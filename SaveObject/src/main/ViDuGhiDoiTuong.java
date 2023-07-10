package main;

import java.io.*;


public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Java_Learnign\\CreateFile\\Directory1\\file.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos =new ObjectOutputStream(os);

            SinhVien st = new SinhVien("001", "TITV", 2000, 10);
            oos.writeObject(st);

            oos.flush();
            oos.close();
        } catch (Exception e) {
            // TODO: handle exception
        }


    }
}
