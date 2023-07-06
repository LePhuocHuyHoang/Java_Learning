public class test {
    public static void main(String[] args) {
        ToaDo td1= new ToaDo(13,12);
        ToaDo td2= new ToaDo(3,1);
        ToaDo td3= new ToaDo(15,25);

        Hinh ht = new Diem(td1);
        Hinh ht2 = new HinhTron(td2,3.14);
        Hinh ht3 = new HinhChuNhat(td3,6,8);

        System.out.println("Diện tích điểm: "+ ht.tinhDienTich());
        System.out.println("Diện tích hình tròn: "+ ht2.tinhDienTich());
        System.out.println("Diện tích hình chữ nhật: "+ ht3.tinhDienTich());

    }
}
