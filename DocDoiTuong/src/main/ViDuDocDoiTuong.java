package main;

import java.io.*;

public class ViDuDocDoiTuong {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Java_Learnign\\CreateFile\\Directory1\\file.data");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois =new ObjectInputStream(is);
            SinhVien sv = (SinhVien) ois.readObject();

            System.out.println(sv);
            ois.close();
        } catch (Exception e) {
            // TODO: handle exception
        }


    }
}
