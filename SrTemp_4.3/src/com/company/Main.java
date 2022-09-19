package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите дневную температуру за последние 7 дней: ");
        int temp[] = new int[8];
        int d = 0;
        for (int i = 1; i < 8; i++) {
            System.out.print("Температура в " +(i)+"-й  день: ");
            temp[i] = in.nextInt();
            d= d +temp[i];
        }
        d = d/7;
        System.out.println("Средняя температура за последние 7 дней составляет: "+d + " градусов.");
    }
}