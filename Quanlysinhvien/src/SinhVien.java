public class SinhVien {
    private String maSinhVien;
    private String hoVaTen;
    private Ngay ngaysinh;
    private double diemTrungBinh;
    private Lop lop;

    public SinhVien(String maSinhVien, String hoVaTen, Ngay ngaysinh, double diemTrungBinh, Lop lop) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.ngaysinh = ngaysinh;
        this.diemTrungBinh = diemTrungBinh;
        this.lop = lop;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Ngay getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Ngay ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }
    public String layTenKhoa(){
        return this.lop.getTenKhoa();
    }
    public boolean kiemTraThiDat(){
        return this.diemTrungBinh >= 5;
    }
    public boolean kiemTraCungNgaySinh(SinhVien svKhac){
        return this.ngaysinh.equals(svKhac.ngaysinh);
    }
}

