public class test {
    public static void main(String[] args) {
        HangSanXuat hsx1 = new HangSanXuat("Ford","Mỹ");
        HangSanXuat hsx2 = new HangSanXuat("Toyota","Nhật Bản");
        HangSanXuat hsx3 = new HangSanXuat("Vinfast","Việt Nam");

        MayBay ptdc1 = new MayBay("Máy bay",hsx1,"Dầu");
        PhuongTienDiChuyen ptdc2 = new XeOto("Xe Oto",hsx2,"Xăng");
        PhuongTienDiChuyen ptdc3 = new XeDap("Xe đạp",hsx3);

        System.out.println("Lấy tên hãng sản xuất: ");
        System.out.println(ptdc1.loaiPhuongTien+"-"+ptdc1.layTenHangSanXuat());
        System.out.println(ptdc2.loaiPhuongTien+"-"+ptdc2.layTenHangSanXuat());
        System.out.println(ptdc3.loaiPhuongTien+"-"+ptdc3.layTenHangSanXuat());

        System.out.println("Lấy vẫn tốc: ");
        System.out.println(ptdc1.loaiPhuongTien+"-"+ptdc1.layVanToc());
        System.out.println(ptdc2.loaiPhuongTien+"-"+ptdc2.layVanToc());
        System.out.println(ptdc3.loaiPhuongTien+"-"+ptdc3.layVanToc());

        System.out.println("Hành động của máy bay: ");
        ptdc1.catCach();
        ptdc1.haCanh();
    }
}
