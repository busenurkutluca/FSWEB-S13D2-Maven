package org.example;

import static java.lang.Integer.reverse;

public class Main {

    public static boolean isPalindrome(int number) {
        int originalNumber = Math.abs(number);
        int reversedNumber = 0;
        int temp = originalNumber;

        // Sayıyı ters çevirme işlemi
        while (temp > 0) {
            int lastDigit = temp % 10; // Son basamağı alıyoruz
            reversedNumber = (reversedNumber * 10) + lastDigit; // Sayıyı ters çeviriyoruz
            temp /= 10; // Bir basamak küçültüyoruz
        }

        // Ters çevrilmiş sayıyla orijinal sayıyı karşılaştırıyoruz
        return originalNumber == reversedNumber;
    }


    public static boolean isPerfectNumber(int number) {
        // 0'dan küçük sayılar mükemmel sayı olamaz
        if (number < 1) {
            return false;
        }

        int sumOfDivisors = 0;

        // 1'den başlayarak, sayının tüm bölenlerini bulup topluyoruz
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Sayının böleni mi?
                sumOfDivisors += i; // Bölenini toplama ekle
            }
        }

        // Bölenlerin toplamı sayının kendisine eşit mi?
        return sumOfDivisors == number;
    }


}















