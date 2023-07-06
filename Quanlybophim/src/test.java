public class test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(12,06,2013);
        Ngay ngay2 = new Ngay(02,07,2018);
        Ngay ngay3 = new Ngay(16,06,2022);

        HangSanXuat hangSanXuat1 = new HangSanXuat("New","Hàn");
        HangSanXuat hangSanXuat2 = new HangSanXuat("Old","Trung");
        HangSanXuat hangSanXuat3 = new HangSanXuat("Medium","Việt");

        BoPhim boPhim1 = new BoPhim("Ma Sói", 2015,hangSanXuat1,40000,ngay1);
        BoPhim boPhim2 = new BoPhim("Ma Da", 2019,hangSanXuat2,60000,ngay2);
        BoPhim boPhim3 = new BoPhim("Ma Ma", 2015,hangSanXuat3,80000,ngay3);

        System.out.println(boPhim1.kiemTraGiaVeReHon(boPhim3));
        System.out.println(boPhim1.tenHangSanXuatPhim());
        System.out.println(boPhim1.giaSauKhuyenMai(10));
    }
}
