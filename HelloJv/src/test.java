public class test {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,20,2023);
        Ngay ngay2 = new Ngay(18,2,2024);
        Ngay ngay3 = new Ngay(21,12,2023);
        TacGia tacGia1= new TacGia("Lê Phước Huy Hoàng",ngay1);
        TacGia tacGia2= new TacGia("Lê Phước Huy ",ngay2);
        TacGia tacGia3= new TacGia("Lê Phước",ngay3);
        Sach sach1 = new Sach("Sọ dừa", 5000,2013,tacGia1);
        Sach sach2 = new Sach("Sọ", 255000,2033,tacGia2);
        Sach sach3 = new Sach("Dừa", 350000,2012,tacGia3);

        sach1.inTenSach();
        System.out.println(sach1.kiemTraCungNamSach(sach3));
        System.out.println(sach1.giaSauKhiGiam(10));

    }
}
