package com.josiahebhomenye.aop;

import java.util.Scanner;

public class Authenticator {
    private String username;
    private String password;

    public void authenticate() {
        if(username == null || password == null) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();
        }
    }
}
