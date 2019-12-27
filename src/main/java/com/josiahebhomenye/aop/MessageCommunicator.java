package com.josiahebhomenye.aop;

public class MessageCommunicator {

    public void deliver(String msg){
        System.out.println(msg);
    }

    public void deliver(String person, String msg){
        System.out.printf("%s, %s\n", person, msg);
    }
}
