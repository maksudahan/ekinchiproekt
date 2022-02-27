package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();

        int c = (a*60)*60;
        int f = (b*60);
        int v = (c+f+d);

        System.out.println(v);


    }
}



        





















