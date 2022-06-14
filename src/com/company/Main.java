package com.company;

import java.util.Scanner;

//      sqrt деген метод тузунуз.
//      UnaryOperator деген интерфейстин реализациясын кайтаруусу керек
//      Бир санды кабыл алып анын тамырдан чыккан жообун кайтарат(корень).
//      public static UnaryOperator<Double> sqrt().


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press the number :   ");
        int numberScanner = scanner.nextInt();
        UnaryOperator<Double> unaryOperator = Math::sqrt;
        System.out.println(unaryOperator.sqrt(numberScanner));

    }
}


@FunctionalInterface
interface UnaryOperator<T> {
    Double sqrt(double number);
}
