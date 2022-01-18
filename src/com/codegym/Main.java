package com.codegym;

import java.util.Stack;

public class Main {


    public static void main(String[] args) {
        String string1 = "s * (s – a) * (s – b) * (s – c)";
        String string2 = "s * (s – a) * (s – b * (s – c)    ";
        System.out.println(kiemTraDauNgoac(string1));
        System.out.println(kiemTraDauNgoac(string2));
    }

    public static boolean kiemTraDauNgoac(String string) {
        final char OPEN = '(';
        final char CLOSE = ')';
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {

            // nếu charAt(i) là OPEN thì thêm vào stack
            // nếu charAt(i) là CLOSE thì bỏ 1 ra khỏi stack, stack trống (chưa có OPEN mà đã có CLOSE) thì return fall luôn

            if (string.charAt(i) == OPEN) {
                stack.push(OPEN);
            }
            if (string.charAt(i) == CLOSE) {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
