package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        //Cách 1
        File f = new File("D:\\Java_Learnign\\CreateFile\\file.txt");
        try {
            BufferedReader bfr = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
            String line = null;
            while (true){
                line = bfr.readLine();
                if (line == null){
                    break;
                }else{
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Cách 2
        File f2 = new File("D:\\Java_Learnign\\CreateFile\\file.txt");
        try {
            List<String> allTest =Files.readAllLines(f2.toPath(),StandardCharsets.UTF_8);
            for (String Line:allTest) {
                System.out.println(Line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Cách 3
        File f3 = new File("D:\\Java_Learnign\\CreateFile\\file.txt");
        Scanner docFile = null;
        try {
            docFile = new Scanner(f3);
            while (docFile.hasNextLine()){
                String data = docFile.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
