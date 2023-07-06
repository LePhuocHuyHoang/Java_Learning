package main;

import java.util.Arrays;

public class ViDu {
    public static void main(String[] args) {
        //Kiểu nguyên thủy
        int[] mang1 = {1,2,3};

        //Copy mảng cách 1
        int[] mang1_a=mang1;
        mang1_a[0]=100;
        System.out.println("Mảng 1: " + Arrays.toString(mang1));
        System.out.println("Mảng 1_a: " + Arrays.toString(mang1_a));
        //Copy mảng cách 2
        int[] mang1_b=mang1.clone();
        mang1_b[0] = 50;
        System.out.println("Mảng 1_b: " + Arrays.toString(mang1_b));
        //Copy mảng cách 3 - dùng System.arraycopy()
        int[] mang1_c = new int[mang1.length];
        System.arraycopy(mang1,0,mang1_c,0,mang1.length);
        mang1_c[0] = 90;
        System.out.println("Mảng 1_c: "+Arrays.toString(mang1_c));

        //Kiểu đối tượng
        String[] mang_doi_tuong = {"Huy","Hoàng"};
        //Copy mảng cách 1
        String[] mang_doi_tuong_a=mang_doi_tuong;
        mang_doi_tuong_a[0]="Hùng";
        System.out.println("Mảng đối tượng : " + Arrays.toString(mang_doi_tuong));
        System.out.println("Mảng đối tượng a: " + Arrays.toString(mang_doi_tuong_a));
        //Copy mảng cách 2
        String[] mang_doi_tuong_b=mang_doi_tuong.clone();
        mang_doi_tuong_b[0] = "Long";
        System.out.println("Mảng đối tượng b: " + Arrays.toString(mang_doi_tuong_b));
        //Copy mảng cách 3
        String[] mang_doi_tuong_c = new String[mang_doi_tuong.length];
        System.arraycopy(mang_doi_tuong,0,mang_doi_tuong_c,0,mang_doi_tuong.length);
        mang_doi_tuong_c[0] = "Hậu";
        System.out.println("Mảng đối tượng c: "+Arrays.toString(mang_doi_tuong_c));
    }
}
