public class HinhTron extends Hinh{
    private double r;

    public HinhTron(ToaDo toaDo, double r) {
        super(toaDo);
        this.r = r;
    }

    @Override
    double tinhDienTich() {
        return 3.14*this.r*this.r;
    }
}
