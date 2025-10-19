package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите логин:");
        String login = scanner.nextLine();

        switch (login){
            case "qwerty":
                System.out.println("ты так не поступай");
                break;
            case "admin":
                System.out.println("тебе туда не надо");

                if (scanner.nextLine().equals("admin")){
                    System.out.println("ты aдмин?");

                }else {
                    System.out.print("бебебебубубуб");


                }
        }

        }

   }


