package main;

import java.util.ArrayDeque;
import java.util.Deque;
public class ViDuDeque {
    public static void main(String[] args) {
        Deque<String> danhSachSinhVien = new ArrayDeque<String>();
        danhSachSinhVien.offer("Huy");
        danhSachSinhVien.offer("An");
        danhSachSinhVien.offer("Hùng");

        danhSachSinhVien.offerLast("Long");
        danhSachSinhVien.offerFirst("Thùy");

        while (true){
            String ten = danhSachSinhVien.poll();
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
