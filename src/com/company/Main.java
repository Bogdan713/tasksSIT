package com.company;

public class Main {

    public static void main(String[] args) {
        double a = 1, b = 2, c = 3;
        System.out.println("\nTask 1 \n");
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
        System.out.print("SUM: ");
        if (a < b && a < c) {
            System.out.println(b * b + c * c);
        } else if (b < a && b < c) {
            System.out.println(a * a + c * c);
        } else {
            System.out.println(a * a + b * b);
        }

        System.out.println("\nTask 2 \n");
        a = 1;
        b = 1;
        c = -1;
        System.out.println("(" + a + "x^2) + (" + b + "x) + " + "(" + c + ") = 0");
        double d = b * b - 4 * a * c;
        System.out.println("D = " + d);
        if (d > 0) {
            System.out.println("x1 = " + (-b - Math.sqrt(d)) / (2 * a));
            System.out.println("x2 = " + (-b + Math.sqrt(d)) / (2 * a));
        } else if (d == 0) {
            System.out.println("x = " + -b / (2 * a));
        } else {
            System.out.println("the discriminant is less than 0");
        }

        System.out.println("\nTask 3 \n");
        String string = "word word word. word word. words? word word!";
        System.out.println(string);
        String buf = string.replace("?", "")
                .replace("!", "")
                .replace(".", "");
        System.out.println("sentences in a row: " + (string.length() - buf.length()));
        string = buf;
        buf = string.replace(" ", "");
        System.out.println("words in a row: " + (string.length() - buf.length() + 1));

        System.out.println("\nTask 4 \n");
        string = "A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!";
        System.out.println(string);
        string = string.toLowerCase()
                .replace(" ", "")
                .replace("?", "")
                .replace("!", "")
                .replace("’", "")
                .replace(".", "")
                .replace("-", "")
                .replace(",", "");
        StringBuilder SB = new StringBuilder(string);
        System.out.println("palindrome: " + SB.toString().equals(SB.reverse().toString()));
    }
}
