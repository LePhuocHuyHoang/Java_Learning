package main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ViDuPriorityQueue {
    public static void main(String[] args) {
        Queue<String> danhSachSinhVien = new PriorityQueue<String>();
        danhSachSinhVien.offer("Huy");
        danhSachSinhVien.offer("An");
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
