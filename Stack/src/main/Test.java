package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<String> stackChuoi = new Stack<String>();

//        Ví dụ đảo ngược chuỗi
        System.out.println("Nhập vào chuỗi: ");
        String s = input.nextLine();
        for (int i = 0; i < s.length(); i++) {
            stackChuoi.push(s.charAt(i) +"");
        }
        System.out.println("Chuỗi đảo ngược: ");
        for (int i = 0; i < s.length(); i++) {
            System.out.print(stackChuoi.pop());
        }
        System.out.println();
//        Ví dụ chuyển từ hệ nhị phân sang hệ thập phân
        Stack<Integer> stackSoDu = new Stack<Integer>();
        System.out.println("Nhập một số nguyên dương từ bàn phím: ");
        int x = input.nextInt();
        while (x>0){
            int soDu = x %2;
            System.out.print(soDu);
            System.out.println();
            stackSoDu.push(soDu);
            x = x / 2;
        }
        System.out.println("Số nhị phân là: ");
        int n = stackSoDu.size();
        for (int i = 0; i < n; i++) {
            System.out.print(stackSoDu.pop());
        }
    }
}
