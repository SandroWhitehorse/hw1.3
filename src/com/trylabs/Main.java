package com.trylabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	System.out.println("Введите периметр квадрата");
        Scanner scanner=new Scanner(System.in);
        int perimetr=scanner.nextInt();
        System.out.println("сторона="+(double)perimetr/4);

    }
}
