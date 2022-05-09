package org.vashonsd;

public class Main {

    public static void main(String[] args) {
        System.out.println(toCelsius(32.0));
        System.out.println(toFahrenheit(20.0));
    }
    public static double toCelsius(double n){
        return (n-32)*9/5;
    }
    public static double toFahrenheit(double n){
        return (n*9/5)+32;
    }
}
