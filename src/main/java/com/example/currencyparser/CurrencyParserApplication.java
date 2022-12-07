package com.example.currencyparser;

import com.example.currencyparser.First.FirstCommand;
import com.example.currencyparser.Operation.ApplicationOperationCurrency;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CurrencyParserApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyParserApplication.class, args);
        FirstCommand fC = new FirstCommand();
        fC.CommandText();
    }
}
