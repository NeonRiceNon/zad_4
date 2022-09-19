package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String valut;
        String EURtext = "EUR";
        String USDtext = "USD";
        double RubNal = 0;
        boolean sravnen;
        double convert;

        System.out.print("Введите вашу сумму RUB: ");
        RubNal = in.nextDouble();
        System.out.print("В какую валюту Вы хотите конвертировать? Возможно: EUR и USD. Выберите нужный вариант: ");

        valut = in.next();
        sravnen = (valut.equalsIgnoreCase(EURtext));
        if (sravnen = true) {
            convert = RubNal * 60.04;//EUR
            System.out.println("Ваша сумма в Евро: " + convert);
        } else {
                convert = RubNal * 60.17;//USD
                System.out.println("Ваша сумма в Долларах: " + convert); //не работает
            }
        }
    }
