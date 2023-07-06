package main;

public class Test {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb_t2 = new ThoiKhoaBieu(Day.Monday,"Toán Lý Hóa");
        ThoiKhoaBieu tkb_t3 = new ThoiKhoaBieu(Day.Tuesday,"Văn Sử Địa");
        ThoiKhoaBieu tkb_t4 = new ThoiKhoaBieu(Day.Wednesday,"Lý Hóa Sinh");
        ThoiKhoaBieu tkb_t5 = new ThoiKhoaBieu(Day.Thursday,"Tin GDCD Anh");
        ThoiKhoaBieu tkb_t6 = new ThoiKhoaBieu(Day.Friday,"Anh Sinh Hóa");
        ThoiKhoaBieu tkb_t7 = new ThoiKhoaBieu(Day.Saturday,"Văn Sử Lý");

        System.out.println(tkb_t5);

        int x=Month.January.soNgay();
        System.out.println(x);

    }


}
