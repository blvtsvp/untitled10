package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        if(x+y >= 180) System.out.println("Triangle doesn't exist");
        else if(x+y == 90 || x == 90 || y ==90) System.out.println("Triangle is right");
        else System.out.println("Triangle exist");
    }
}
