package main;

import java.util.LinkedList;
import java.util.Queue;

public class ViDuQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSinhVien = new LinkedList<String>();
        danhSachSinhVien.offer("Hoàng");
        danhSachSinhVien.offer("Huy");
        danhSachSinhVien.offer("Hùng");

        while (true){
            String ten = danhSachSinhVien.poll();
            if(ten == null){
                break;
            }
            System.out.println(ten);
        }
    }
}
