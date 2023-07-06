public class hoaDonCaPhe {
    private String tenLoaiCaPhe;
    private double giaTien1kg;
    private double khoiLuong;

    public hoaDonCaPhe(String tenLoaiCaPhe,double giaTien1kg, double khoiLuong){
        this.tenLoaiCaPhe = tenLoaiCaPhe;
        this.giaTien1kg = giaTien1kg;
        this.khoiLuong = khoiLuong;
    }
    public double tinhTongTien(){
        return this.giaTien1kg * this.khoiLuong;
    }
    public boolean kiemTraKhoiLuongLonHon(double khoiLuong){
        return this.khoiLuong > khoiLuong;
    }
    public boolean kiemTraTienHoaDonLonHon500k(){
        return this.tinhTongTien() > 500000;
    }
    public double giamGia(double x){
        if (this.tinhTongTien() > 500000) {
            return (x / 100) * this.tinhTongTien();
        }
        else {
            return 0;
        }
    }
    public double soTienDaGiam(double x){
        return this.tinhTongTien() - this.giamGia(x);
    }

    public static void main(String[] args) {
        hoaDonCaPhe hoadon = new hoaDonCaPhe("Trung Nguyên",100000,1.5);
        hoaDonCaPhe hoadon2 = new hoaDonCaPhe("Cao Nguyên",500000,5.5);

        System.out.println(hoadon.tinhTongTien());

        System.out.println(hoadon.kiemTraKhoiLuongLonHon(2));

        System.out.println(hoadon.kiemTraTienHoaDonLonHon500k());

        System.out.println(hoadon.giamGia(10));

        System.out.println(hoadon.soTienDaGiam(30));
        System.out.println(hoadon2.soTienDaGiam(30));

    }

}

