package main;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {
    public static void main(String[] args) {
        try {
            String sourceFile = "D:\\Java_Learnign\\CreateFile\\Directory1\\file.data";
            FileOutputStream fos = null;
            fos = new FileOutputStream("D:\\Java_Learnign\\CreateFile\\Directory1\\compressed.zip");
            ZipOutputStream zipOut = new ZipOutputStream(fos);

            File fileToZip = new File(sourceFile);
            FileInputStream fis = new FileInputStream(fileToZip);

            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);
            byte[] bytes =new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >=0) {
                zipOut.write(bytes, 0, length);
                zipOut.close();
            }
            fis.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
