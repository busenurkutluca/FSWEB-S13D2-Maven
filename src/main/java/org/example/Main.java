package org.example;

public class Main {
    // Palindrom Sayıyı Bulma
    public static boolean isPalindrome(int number) {
        // Negatif sayılar için işareti yok say
        number = Math.abs(number);

        // Sayıyı string'e çevir ve tersini al
        String strNumber = String.valueOf(number);
        String reversed = new StringBuilder(strNumber).reverse().toString();

        // Orijinal ve ters çevrilmiş string'leri karşılaştır
        return strNumber.equals(reversed);
    }

    // Mükemmel Sayıları Bulma
    public static boolean isPerfectNumber(int number) {
        // Negatif veya 0 için false dön
        if (number <= 0) {
            return false;
        }

        // Bölenlerin toplamını hesapla (kendisi hariç)
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Toplam sayı ile eşitse mükemmel sayıdır
        return sum == number;
    }

    // Sayıları Kelimelere Dök
    public static String numberToWords(int number) {
        // Negatif sayılar için "Invalid Value" dön
        if (number < 0) {
            return "Invalid Value";
        }

        // Rakamları kelimelere çevirmek için dizi
        String[] words = {
                "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine"
        };

        // Sayıyı string'e çevir
        String strNumber = String.valueOf(number);
        StringBuilder result = new StringBuilder();

        // Her rakamı kelimeye çevir ve araya boşluk ekle
        for (int i = 0; i < strNumber.length(); i++) {
            int digit = Character.getNumericValue(strNumber.charAt(i));
            result.append(words[digit]);
            if (i < strNumber.length() - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    // Test için main metodu (opsiyonel)
    public static void main(String[] args) {
        // isPalindrome testleri
        System.out.println(isPalindrome(-1221)); // true
        System.out.println(isPalindrome(707));   // true
        System.out.println(isPalindrome(11212)); // false

        // isPerfectNumber testleri
        System.out.println(isPerfectNumber(6));   // true
        System.out.println(isPerfectNumber(28));  // true
        System.out.println(isPerfectNumber(5));   // false
        System.out.println(isPerfectNumber(-1));  // false

        // numberToWords testleri
        System.out.println(numberToWords(123));  // "One Two Three"
        System.out.println(numberToWords(1010)); // "One Zero One Zero"
        System.out.println(numberToWords(-12));  // "Invalid Value"
    }
}