package File.txt;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class ReadFile {
    public static void main(String[] args) {
        File file1 = new File("D:\\Java_Learnign\\Presentation1and2\\engineer.txt");
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(file1.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true){
                line = bufferedReader.readLine();
                if (line == null){
                    break;
                }else{
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
