package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ViDuXoaFile {
    public static void xoaFile(File fx){
        if (fx.isFile()){
            //Xóa nếu là tập tin
            System.out.println("Đã xóa: " + fx.getAbsolutePath());
            fx.delete();;
        } else if (fx.isDirectory()) {
            //Lấy các file con
            File[] mangCon = fx.listFiles();
            for (File f: mangCon) {
                xoaFile(f);
            }
            //Xóa bản thân thư mục sau khi đã xóa các file con
            System.out.println("Đã xóa: " + fx.getAbsolutePath());
            fx.delete();
        }
    }
    public static void main(String[] args) {
        //Sử dụng class File xóa tập tin hoặc thư mục
        File f0 = new File("D:\\Java_Learnign\\CreateFile\\Diretory_1");
        File f1 = new File("D:\\Java_Learnign\\CreateFile\\Diretory_2");
        File vidu = new File("D:\\Java_Learnign\\CreateFile\\Vidu");

        f1.deleteOnExit();
        vidu.delete();
        ViDuXoaFile.xoaFile(f0);

        //Sử dụng class Files xóa tập tin hoặc thư mục
        Path p0 = f0.toPath();
        Path p1 = f1.toPath();
        Path p_vidu = vidu.toPath();

        try {
            Files.deleteIfExists(p1);
            Files.deleteIfExists(p0);
            Files.deleteIfExists(p_vidu);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
