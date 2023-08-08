package ru.netology.services;

public class Main {
    public static void main(String[] args) {

        CalculateAmount service = new CalculateAmount();
        System.out.println(service.calculate(100_000, 60_000, 150_000));
    }
}