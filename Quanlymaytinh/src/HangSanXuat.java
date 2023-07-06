public class HangSanXuat {
    private String tenSanXuat;
    private Quocgia quocGia;

    public HangSanXuat(String tenSanXuat, Quocgia quocGia) {
        this.tenSanXuat = tenSanXuat;
        this.quocGia = quocGia;
    }

    public String getTenSanXuat() {
        return tenSanXuat;
    }

    public void setTenSanXuat(String tenSanXuat) {
        this.tenSanXuat = tenSanXuat;
    }

    public Quocgia getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(Quocgia quocGia) {
        this.quocGia = quocGia;
    }
    public String layTenQuocGia(){
        return this.quocGia.getTenQuocGia();
    }
}
