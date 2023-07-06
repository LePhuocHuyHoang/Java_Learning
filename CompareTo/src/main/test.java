package main;

public class test {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(100,"Huy Hoàng","Một",9.7);
        SinhVien sv2= new SinhVien(80,"Hùng","Mười",6.8);
        SinhVien sv3= new SinhVien(199,"Nguyễn Thị Yến","Mười",6.8);

        System.out.println(sv1.compareTo(sv2));
        System.out.println(sv3.compareTo(sv1));

    }
}



