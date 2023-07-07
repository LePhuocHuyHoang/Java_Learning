package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class RenameToRemoveAndCopy {
    public static void copyAll(File f1,File f2){
        try {
            //Copy bản thân nó
            Files.copy(f1.toPath(),f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (f1.isDirectory()){
            //Copy các tập tin và thư mục con
            File[] mangCon = f1.listFiles();
            for (File file:mangCon) {
                File file_new = new File(f2.getAbsoluteFile()+"/"+file.getName());
                copyAll(file,file_new);
            }
        }
    }
    public static void main(String[] args) {
        //Thay đổi tên bằng class File
        File f1 = new File("D:\\Java_Learnign\\CreateFile\\File_1.txt");
        File f2 = new File("D:\\Java_Learnign\\CreateFile\\File_2.txt");
        File f3 = new File("D:\\Java_Learnign\\CreateFile\\File_3.txt");

        f1.renameTo(f2);
        //Thay đổi tên bằng class Files
        try {
            Files.move(f2.toPath(),f3.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Di chuyển file
        File f4 = new File("D:\\Java_Learnign\\CreateFile\\Directory1\\File_1.txt");
        try {
            Files.move(f1.toPath(),f4.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //Copy File
        File f5 = new File("D:\\Java_Learnign\\CreateFile\\File_5");
        File f5_copy = new File("D:\\Java_Learnign\\CreateFile\\File_5_Copy");
        RenameToRemoveAndCopy.copyAll(f5,f5_copy);
    }
}
