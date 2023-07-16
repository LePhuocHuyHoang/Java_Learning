package File.txt;

import main.Engineer;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) {
        Engineer engineer1 = new Engineer("La Văn Thịnh","Software Engineer",10,17);
        Engineer engineer2 = new Engineer("Nguyễn Viết Quốc","Network Engineer",31,21);
        Engineer engineer3 = new Engineer("Lê Phước Tiến","Network Engineer",21,7);
        Engineer engineer4 = new Engineer("Nguyễn Thị Lệ Hoa","Software Engineer",30,1);
        Engineer engineer5 = new Engineer("Đỗ Nhật Huy","Software Engineer",25,4);
        PrintWriter printWriter;

        {
            try {
                printWriter = new PrintWriter("D:\\Java_Learnign\\Presentation1and2\\engineer.txt");
                printWriter.println(engineer1);
                printWriter.println(engineer2);
                printWriter.println(engineer3);
                printWriter.println(engineer4);
                printWriter.println(engineer5);
                printWriter.flush();
                printWriter.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
