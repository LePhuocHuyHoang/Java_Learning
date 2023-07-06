package main;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(100,"Nguyễn Thị Yến","Một",9.7);
        SinhVien sv2= new SinhVien(80,"Hùng","Mười",6.8);
        SinhVien sv3= new SinhVien(199,"Huy Hoàng","Mười",6.8);

        SinhVien[] a_sv = new SinhVien[] {sv1,sv2,sv3};
        System.out.println("Ban đầu: " + Arrays.toString(a_sv));
        //Hàm sắp xếp
        Arrays.sort(a_sv);
        System.out.println("Sau khi sắp xếp: " + Arrays.toString(a_sv));

        //Hàm tìm kiếm
        System.out.println("Tìm kiếm Hoàng: " + Arrays.binarySearch(a_sv,sv3));
    }
}
