public class Test {
    public static void main(String[] args) {
        Ngay ngay1=new Ngay(20,06,2015);
        Ngay ngay2=new Ngay(04,07,2019);
        Ngay ngay3=new Ngay(20,06,2015);

        Lop lop1 = new Lop("46k21.3","Thống kê tin học");
        Lop lop2 = new Lop("46k21.2","Quản lý hệ thống");
        Lop lop3 = new Lop("46k21.1","Quản trị dự án");

        SinhVien sv1 = new SinhVien("201121521312","Lê Phước Huy Hoàng",ngay1,9.8,lop1);
        SinhVien sv2 = new SinhVien("201121521313","Lê Phước Huy ",ngay2,2.0,lop2);
        SinhVien sv3 = new SinhVien("201121521315","Lê Phước ",ngay3,10,lop3);

        System.out.println(sv1.layTenKhoa());
        System.out.println(sv2.layTenKhoa());
        System.out.println(sv3.layTenKhoa());

        System.out.println(sv1.kiemTraThiDat());
        System.out.println(sv2.kiemTraThiDat());
        System.out.println(sv3.kiemTraThiDat());

        System.out.println(sv1.kiemTraCungNgaySinh(sv2));
        System.out.println(sv1.kiemTraCungNgaySinh(sv1));
    }
}
