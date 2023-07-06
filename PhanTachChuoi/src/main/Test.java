package main;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String a = "Xin chào, tôi tên là: Lê Phước Huy Hoàng";

        String[] b = a.split(" ");
        System.out.println(Arrays.toString(b));

        String[] c = a.split("\\,|\\:");
        System.out.println(Arrays.toString(c));

        System.out.println("Tên: " + b[b.length-1]);
    }
}
