package main;

import java.io.File;
import java.io.IOException;

public class CreateFileAndFolder {
    public static void main(String[] args) {

        File folder1 = new File("D:\\Java_Learnign\\CreateFile\\Diretory_1");
        folder1.mkdir();

        File folder2 = new File("D:\\Java_Learnign\\CreateFile\\Diretory_1\\Diretory_2\\Diretory_3\\Diretory_4");
        folder2.mkdirs();

        File file1 = new File("D:\\Java_Learnign\\CreateFile\\Diretory_1\\ViDu.txt");
        try {
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
