package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str1 = scan.nextLine();
        System.out.println("Enter the substring:");
        String str2 = scan.nextLine();
        System.out.println("Enter the position:");
        int k = scan.nextInt();
        String stres = str1.substring(0, k) + str2 + str1.substring(k, str1.length());
        System.out.println(stres);
    }
}
