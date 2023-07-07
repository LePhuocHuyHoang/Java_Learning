package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class FileWrite {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("D:\\Java_Learnign\\CreateFile\\file.txt","UTF-8");
            pw.println("Xin chào, mình là hoàng!");
            pw.print("Dữ liệu: ");
            pw.print(3.14);
            pw.print(' ');
            pw.print("Là số pi");
            pw.println(" ");
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}
