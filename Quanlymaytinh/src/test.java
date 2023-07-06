public class test {
    public static void main(String[] args) {
        Quocgia qg1 = new Quocgia("2102","Hàn");
        Quocgia qg2 = new Quocgia("2103","Nhật");
        Quocgia qg3 = new Quocgia("2104","Việt");

        Ngay ngay1 = new Ngay(21,10,2012);
        Ngay ngay2 = new Ngay(30,06,2015);
        Ngay ngay3 = new Ngay(01,10,2023);

        HangSanXuat hsx1 = new HangSanXuat("Nice",qg1);
        HangSanXuat hsx2 = new HangSanXuat("Marvel",qg2);
        HangSanXuat hsx3 = new HangSanXuat("DC",qg3);

        MayTinh maytinh1 = new MayTinh(hsx1,ngay1,1200000,1.5);
        MayTinh maytinh2 = new MayTinh(hsx2,ngay2,3000000,4);
        MayTinh maytinh3 = new MayTinh(hsx3,ngay3,1500000,3.5);

        System.out.println(maytinh1.kiemTraGiaThapHon(maytinh2));
        System.out.println(maytinh1.kiemTraGiaThapHon(maytinh3));

        System.out.println(maytinh1.layTenQuocGia());
        System.out.println(maytinh2.layTenQuocGia());
        System.out.println(maytinh3.layTenQuocGia());

    }
}
