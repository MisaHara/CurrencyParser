package com.example.currencyparser.Operation;

import com.example.currencyparser.First.FirstCommand;
import org.jsoup.Jsoup;

import java.util.Scanner;

public class ApplicationOperationCurrency {
    FirstCommand fC = new FirstCommand();
    Boolean Run = true;
    final String element = "div[class=YMlKec fxKbKc]";
    final String KZT = " тенге.";
    final String Error = "Вы что-то делаете неверно!\n";
    public void CurrentCurrency() {
        while (Run) {

            Scanner s = new Scanner(System.in);
            System.out.println("""
                    Введите число валюты которую хотите увидеть:\s
                    1. В Долларах
                    2. В Евро
                    3. В Юанях
                    4. В Рублях
                    """);
            String currency = s.nextLine();

            switch (currency) {
                case "1", "1." -> {
                    try {
                        var document = Jsoup.connect("https://www.google.com/finance/quote/USD-KZT?sa=X&ved=2ahUKEwiph4qt4OT7AhXppYsKHQsFBrQQmY0JegQIBhAc").get();
                        var titleElement = document.selectFirst(element);
                        assert titleElement != null;
                        System.out.println("Курс доллара = " + titleElement.text() + KZT);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    Run = false;
                    fC.CommandText();
                }
                case "2", "2." -> {
                    try {
                        var document = Jsoup.connect("https://www.google.com/finance/quote/EUR-KZT?sa=X&ved=2ahUKEwi6tdGQ3-T7AhURpIsKHbxIABEQmY0JegQIBhAc").get();
                        var titleElement = document.selectFirst(element);
                        assert titleElement != null;
                        System.out.println("Курс евро = " + titleElement.text() + KZT);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    Run = false;
                    fC.CommandText();
                }
                case "3", "3." -> {
                    try {
                        var document = Jsoup.connect("https://www.google.com/finance/quote/CNY-KZT?sa=X&ved=2ahUKEwiB6_bV3-T7AhWimIsKHSVLC9YQmY0JegQICBAc").get();
                        var titleElement = document.selectFirst(element);
                        assert titleElement != null;
                        System.out.println("Курс юань = " + titleElement.text() + KZT);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    Run = false;
                    fC.CommandText();
                }
                case "4", "4." -> {
                    try {
                        var document = Jsoup.connect("https://www.google.com/finance/quote/RUB-KZT?sa=X&ved=2ahUKEwjbr-yI4eT7AhXkiIsKHfgqByEQmY0JegQIBhAc").get();
                        var titleElement = document.selectFirst(element);
                        assert titleElement != null;
                        System.out.println("Курс рубля = " + titleElement.text() + KZT);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    Run = false;
                    fC.CommandText();
                }
                default -> System.out.println(Error);
            }
        }
    }

    public void СryptoСurrency() {
        while (Run) {

            Scanner s = new Scanner(System.in);
            System.out.println("""
                    Введите число криптовалюты которую хотите увидеть:\s
                    1. Биткойн
                    2. Эфириум
                    3. LiteCoin
                    4. BNB
                    """);
            String currency = s.nextLine();

            switch (currency) {
                case "1", "1." -> {
                    try {
                        var document = Jsoup.connect("https://www.google.com/finance/quote/BTC-KZT?sa=X&ved=2ahUKEwjsyp33-uT7AhURvosKHadeDW4Q-fUHegQIBxAe").get();
                        var titleElement = document.selectFirst(element);
                        assert titleElement != null;
                        System.out.println("Курс Биткойна = " + titleElement.text() + KZT);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    Run = false;
                    fC.CommandText();
                }
                case "2", "2." -> {
                    try {
                        var document = Jsoup.connect("https://www.google.com/finance/quote/ETH-KZT?sa=X&ved=2ahUKEwj4zfnM_OT7AhUQzIsKHVNXCg0Q-fUHegQIBhAe").get();
                        var titleElement = document.selectFirst(element);
                        assert titleElement != null;
                        System.out.println("Курс Эфириума = " + titleElement.text() + KZT);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    Run = false;
                    fC.CommandText();
                }
                case "3", "3." -> {
                    try {
                        var document = Jsoup.connect("https://www.google.com/finance/quote/LTC-KZT?sa=X&ved=2ahUKEwiRwoCp_eT7AhWvw4sKHRziAFsQ-fUHegQIBxAe").get();
                        var titleElement = document.selectFirst(element);
                        assert titleElement != null;
                        System.out.println("Курс LiteCoin = " + titleElement.text() + KZT);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    Run = false;
                    fC.CommandText();
                }
                case "4", "4." -> {
                    try {
                        var document = Jsoup.connect("https://www.google.com/finance/quote/BNB-KZT?sa=X&ved=2ahUKEwiU1Nj-_OT7AhXr-ioKHYfZDgwQ-fUHegQIBhAe").get();
                        var titleElement = document.selectFirst(element);
                        assert titleElement != null;
                        System.out.println("Курс BNB = " + titleElement.text() + KZT);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    Run = false;
                    fC.CommandText();
                }
                default -> System.out.println(Error);
            }
        }
    }
}

