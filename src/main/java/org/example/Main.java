package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1003));
        System.out.println(isPerfectNumber(-1));
        System.out.println(numberToWords(-12));
    }

    public static boolean isPalindrome(int number){
        if (number < 0) return false;

        String numberString = String.valueOf(number);
        String reversedNumberString = new StringBuilder(numberString).reverse().toString();
        return numberString.equals(reversedNumberString);
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1) return false;

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) sum += i;
        }

        return sum == number;
    }

    public static String numberToWords(int number){
        if (number < 0) return "Invalid Value";

        String inputStr = String.valueOf(number);
        String result = "";
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        int initialLength = inputStr.length();
        while (initialLength > 0) {
            for (int i = 0; i < inputStr.length(); i++) {
                String charToStr = String.valueOf(inputStr.charAt(i));
                int indexValue = Integer.parseInt(charToStr);
                result += words[indexValue] + " ";
                initialLength--;
            }
        }
        result = result.trim();
        return result;
    }
}
