public class TacGia {
    private String tenTacGia;
    private Ngay ngaySinh;
    public TacGia(String tenTacGia,Ngay ngaySinh){
        this.tenTacGia=tenTacGia;
        this.ngaySinh=ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }
}
