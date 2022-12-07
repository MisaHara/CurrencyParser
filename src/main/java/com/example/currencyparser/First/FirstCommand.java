package com.example.currencyparser.First;

import com.example.currencyparser.Operation.ApplicationOperationCurrency;

import java.util.Scanner;

public class FirstCommand {
    public void CommandText() {
        ApplicationOperationCurrency CurrencyOperation = new ApplicationOperationCurrency();

        System.out.println("\nУ вас есть следующие операции:\n" +
                "1.Узнать текущий курс валюты по отношению к тенге\n" +
                "2.Узнать текущий курс криптовалюты по отношению к тенге \n" +
                "3.Выключить приложение\n");
        Scanner sc = new Scanner(System.in);
        String Operation = sc.nextLine();
        switch (Operation) {
            case "1", "1." :
                CurrencyOperation.CurrentCurrency();
                break;
            case "2", "2." :
                CurrencyOperation.СryptoСurrency();
                break;
            case "3", "3." :
                break;
        }
    }
}
