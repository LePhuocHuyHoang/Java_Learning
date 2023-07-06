package main;

public class SinhVien implements Comparable<SinhVien> {
    private int maSinhVien ;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    //So sánh tên
    public String getTen(){
        String s = this.hoVaTen.trim();
        if (s.indexOf(" ")>=0){
            int viTri=s.lastIndexOf(" ");
            return s.substring(viTri+1);
        }else{
            return s;
        }
    }
    //So sánh điểm trung bình
    public double traVeDiemTB(){
        double a = this.diemTrungBinh;
        return a;
    }
//    @Override
//    public int compareTo(SinhVien o) {
//        String tenThis = this.getTen();
//        String tenO = o.getTen();
//        return tenThis.compareTo(tenO);
//    }
    //So sánh đtb
    @Override
    public int compareTo(SinhVien o) {
        Double a = this.traVeDiemTB();
        Double b = o.traVeDiemTB();
        return a.compareTo(b);
    }
}
