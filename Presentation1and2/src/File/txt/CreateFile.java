package File.txt;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File file1 = new File("D:\\Java_Learnign\\Presentation1and2\\engineer.txt");
        try {
            file1.createNewFile();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
