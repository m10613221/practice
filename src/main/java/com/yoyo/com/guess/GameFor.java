package com.yoyo.com.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int random = new Random().nextInt(10)+1;
        Scanner scanner = new Scanner(System.in);
        for (int i =  5 ; i > 0 ; i--) {

            System.out.print("猜數字，剩下 "+i+" 次，請輸入數字: ");
            int num=scanner.nextInt();
            if (num > random) {
                System.out.println("低一點");
            } else if (num < random) {
                System.out.println("高一點");
            } else {
                System.out.println("恭喜猜中了!! 數字為: " + random);
                break;
            }

        }
    }
}
