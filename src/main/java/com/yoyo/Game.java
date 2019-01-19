package com.yoyo;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Random random = new Random();
        int secret = random.nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println(secret);
        int number = 0;
        while (number != secret) {
            System.out.print("輸入猜的數字: ");
            number = Integer.parseInt(scanner.next());
            grade(number);
            if (number > secret) {
                System.out.println("低一點");
            } else if (number < secret) {
                System.out.println("高一點");
            } else {
                System.out.println("恭喜猜中了!! 數字為: " + secret);
            }
        }
    }

    private static void grade(int number) {
        char grade = 'F';
        switch (number) {
            case 1:
                grade = 'A';
                break;
            case 2:
                grade = 'B';
                break;
            case 3:
                grade = 'C';
                break;
            case 4:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("轉為成績為: " + grade);
    }
}
