package com.geek.lesson36;


public class Math {

    public int add(double a, double b) {
        return (int) (a + b);
    }

    public int sub(double a, double b) {
        return (int) (a - b);
    }

    public int multiply(int a, int b) {
        if (a * b == 0) return 0;
        else return a * b;
    }

    public int div(int a, int b) {
        if (a == 0 || b == 0) return 0;
        else return a / b;
    }

    public String reverse(String words) {
        String[] splitWords = words.split(" ");
        StringBuilder a;
        if (splitWords[0].equals("")) return null;
        else {
            for (int i = 0; i < splitWords.length / 2; i++) {
                String tmp = splitWords[i];
                splitWords[i] = splitWords[splitWords.length - i - 1];
                splitWords[splitWords.length - i - 1] = tmp;
            }
            a = new StringBuilder();
            for (int i = 0; i < splitWords.length; i++) {
                a.append(splitWords[i]).append(" ");
            }
        }
        return a.toString().trim();
    }
}
