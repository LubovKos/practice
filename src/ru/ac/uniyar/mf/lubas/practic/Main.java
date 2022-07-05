package ru.ac.uniyar.mf.lubas.practic;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        String str = in.nextLine();
        String[] parts_1 = str.split(" ");
        String[] left = parts_1[0].split("/");
        String[] right = parts_1[2].split("/");
        //если число - дробь вида m/n
        if (left.length >= 2 || right.length >= 2) {
            int m1 = Integer.parseInt(left[0]);
            int n1;
            if (left.length == 1)
                n1 =1;
            else
                n1 = Integer.parseInt(left[1]);
            int m2 = Integer.parseInt(right[0]);
            int n2;
            if (right.length == 1)
                n2 = 1;
            else
                n2 = Integer.parseInt(right[1]);
            String sign = parts_1[1];
            int ans_m = 0, ans_n = 0;
            String ans = "";
            switch (sign) {
                case "+":
                    ans_m = m1 * n2 + n1 * m2;
                    ans_n = n1 * n2;
                    if (ans_n == 1)
                        ans = String.valueOf(ans_m);
                    else
                        ans = (String.valueOf(ans_m) + "/" + String.valueOf(ans_n));
                    break;
                case "-":
                    ans_m = m1 * n2 - n1 * m2;
                    ans_n = n1 * n2;
                    if (ans_n == 1)
                        ans = String.valueOf(ans_m);
                    else
                        ans = (String.valueOf(ans_m) + "/" + String.valueOf(ans_n));
                    break;
                case "*":
                    ans_m = m1 * m2;
                    ans_n = n1 * n2;
                    if (ans_n == 1)
                        ans = String.valueOf(ans_m);
                    else
                        ans = (String.valueOf(ans_m) + "/" + String.valueOf(ans_n));
                    break;
                case "/":
                    ans_m = m1 * n2;
                    ans_n = m2 * n1;
                    if (ans_n == 1)
                        ans = String.valueOf(ans_m);
                    else
                        ans = (String.valueOf(ans_m) + "/" + String.valueOf(ans_n));
                    break;
            }
            if (ans_n == 0)
                System.out.print("Division by zero");
            else{
                if (ans_m == 0)
                    System.out.print(0);
                else
                    System.out.print(ans);
            }
        } else {
            num1 = Integer.parseInt(parts_1[0]);
            num2 = Integer.parseInt(parts_1[2]);
            String sign = parts_1[1];
            int ans = 0;
            switch (sign) {
                case "+":
                    ans = num1 + num2;
                    System.out.print(ans);
                    break;
                case "-":
                    ans = num1 - num2;
                    System.out.print(ans);
                    break;
                case "*":
                    ans = num1 * num2;
                    System.out.print(ans);
                    break;
                case "/":
                    try {
                        ans = num1 / num2;
                        System.out.print(ans);
                        break;
                    } catch (ArithmeticException e) {
                        System.out.print("Division by zero");
                        break;
                    }
            }
        }
    }
}

