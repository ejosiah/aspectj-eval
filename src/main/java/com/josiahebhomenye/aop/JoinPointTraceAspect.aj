package com.josiahebhomenye.aop;

public aspect JoinPointTraceAspect {
    private int callDepth;

    pointcut traced() : !within(JoinPointTraceAspect);

    before() : traced(){
        print("Before", thisJoinPoint);
        callDepth++;
    }

    after() : traced(){
        callDepth--;
        print("after", thisJoinPoint);
    }

    private void print(String prefix, Object message){
        for(int i = 0; i < callDepth; i++) {
            System.out.print(" ");
        }
        System.out.println(prefix + ": " + message);
    }
}
