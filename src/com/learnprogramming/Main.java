package com.learnprogramming;

public class Main {

    public static void main(String[] args) {

        DiagonalStar.printSquareStar(2);

//        String numberAsString = "2018.125";
//        System.out.println("numberAsString = " + numberAsString);
//
//        double number = Double.parseDouble(numberAsString);
//        System.out.println("number = " + number);
//
//        numberAsString += 1;
//        number += 1;
//
//        System.out.println("numberAsString = " + numberAsString);
//        System.out.println("number = " + number);

//        System.out.println(canPack(1, 0, 4));
//        System.out.println(canPack(1, 2, 5));
//        System.out.println(canPack(0, 5, 4));
//        System.out.println(canPack(2, 2, 11));
//        System.out.println(canPack(-3, 2, 12));

//        System.out.println(getLargestPrime(15));

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int smallTotalWeight = smallCount;
        int bigTotalWeight = bigCount * 5;
        if ((smallTotalWeight + bigTotalWeight) < 0) {
            return false;
        }

        return (smallTotalWeight + bigTotalWeight >= goal) && (smallTotalWeight >= goal % 5);
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int prime = 2;
        while (number > prime) {
            if (number % prime == 0) {
                number = number / prime;
            } else {
                prime++;
            }
        }

        return prime;
    }

}
