package com.example.console;

import com.example.model.CandyType;

import java.util.Scanner;

public class ConsoleFunc {

    public static String consoleInputName(){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter candy name");
            String name = scanner.next();
            return name;
        }
        catch(IllegalArgumentException ex){
            throw ex;
        }
    }

    public static int consoleInputSugarContent(){
        try{
            Scanner scanner = new Scanner(System.in);
            int duration;

            System.out.println("Enter candy sugar content in seconds");
            duration = scanner.nextInt();
            return duration;
        }
        catch(IllegalArgumentException ex){
            throw ex;
        }
    }

    public static CandyType consoleInputCandyType(){
        try{
            Scanner scanner = new Scanner(System.in);
            int name;

            System.out.println("Choose type form the list");
            System.out.println("1. " + CandyType.ChocolateBar + "\n" +
                    "2. " + CandyType.Jelly + "\n" +
                    "3. " + CandyType.Sweet + "\n" +
                    "4. " + CandyType.Waffle);
            name = scanner.nextInt();
            switch(name){
                case 1: return CandyType.ChocolateBar;
                case 2: return CandyType.Jelly;
                case 3: return CandyType.Sweet;
                case 4: return CandyType.Waffle;
                default: return CandyType.ChocolateBar;
            }
        }
        catch(IllegalArgumentException ex){
            throw ex;
        }
    }
}
