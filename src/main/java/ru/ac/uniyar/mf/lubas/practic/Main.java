package ru.ac.uniyar.mf.lubas.practic;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] parts_1 = str.split(" ");
        String left = parts_1[0];
        String right = parts_1[2];
        String sign = parts_1[1];

        String result = calculate(left, sign, right);
        System.out.print(result);
    }

    public static String calculate(String left, String sign, String right) {
        String[] parts_left = left.split("/");
        String[] parts_right = right.split("/");

        int left_m = Integer.parseInt(parts_left[0]);
        int left_n;
        if (parts_left.length == 1)
            left_n = 1;
        else
            left_n = Integer.parseInt(parts_left[1]);

        int right_m = Integer.parseInt(parts_right[0]);
        int right_n;
        if (parts_right.length == 1)
            right_n = 1;
        else
            right_n = Integer.parseInt(parts_right[1]);

        int ans_m = 0, ans_n = 0;
        String ans = "";
        switch (sign) {
            case "+":
                ans_m = left_m * right_n + left_n * right_m;
                ans_n = left_n * right_n;
                break;
            case "-":
                ans_m = left_m * right_n - left_n * right_m;
                ans_n = left_n * right_n;
                break;
            case "*":
                ans_m = left_m * right_m;
                ans_n = left_n * right_n;
                break;
            case "/":
                ans_m = left_m * right_n;
                ans_n = left_n * right_m;
                break;
        }
        int g_c_d = gcd(ans_n, ans_m);
        ans_m = ans_m / g_c_d;
        ans_n = ans_n / g_c_d;
        if (ans_n < 0){
            ans_n *= -1;
            ans_m *= -1;
        }
        if (ans_n == 0)
            ans = "Division by zero";
        else if (ans_m == 0)
            ans = "0";
        else if (ans_n == 1)
            ans = String.valueOf(ans_m);
        else
            ans = (String.valueOf(ans_m) + "/" + String.valueOf(ans_n));
        return ans;
    }

    public static int gcd(int num1, int num2){
        if (num2 == 0)
            return num1;
        return gcd(num2, num1 % num2);
    }
}

