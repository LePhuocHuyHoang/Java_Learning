package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
    public static void main(String[] args) {
        double taiKhoanNguoiChoi = 5000000;
        Scanner input = new Scanner(System.in);

        Locale lc = new Locale("vi","VN");
        NumberFormat numf = NumberFormat.getCurrencyInstance(lc);

        int luaChon = 0;
        do{
            System.out.println("-----------MỜI BẠN LỰA CHỌN-----------");
            System.out.println("Chọn (1) để tiếp tục chơi.");
            System.out.println("Nhấn phím bất kỳ để thoát trò chơi.");
            luaChon = input.nextInt();
            if (luaChon == 1){
                System.out.println("*** BẮT ĐẦU CHƠI: ***");
                System.out.println("****** Tài khoản của bạn: " + numf.format(taiKhoanNguoiChoi) + "  , bạn muốn cược bao nhiêu?");
                double datCuoc = 0;
                do {
                    System.out.println("****** Đặt cược bé hơn số tiền bạn đang có.");
                    datCuoc = input.nextDouble();
                }while (datCuoc <= 0 || datCuoc> taiKhoanNguoiChoi);
                int luaChonTaiXiu = 0;
                do {
                    System.out.println("****** Chọn 1 = Tài hoặc Chọn 2 = Xỉu.");
                    luaChonTaiXiu = input.nextInt();
                }while (luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
                Random xucXac1 = new Random();
                Random xucXac2 = new Random();
                Random xucXac3 = new Random();

                int giaTri1=xucXac1.nextInt(5)+1;
                int giaTri2=xucXac2.nextInt(5)+1;
                int giaTri3=xucXac3.nextInt(5)+1;
                int tong = giaTri1 + giaTri2 + giaTri3;

                System.out.println("****** Kết quả: " + giaTri1 + "-" + giaTri2 + "-" + giaTri3);
                if (tong==3 || tong==18){
                    taiKhoanNguoiChoi -= datCuoc;
                    System.out.println("****** Tổng là: " + tong + " => nhà cái thắng, bạn đã thua!");
                    System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                } else if (tong >= 4 && tong <=10) {
                    System.out.println("****** Tổng là: " + tong + " => xỉu.");
                    if(luaChonTaiXiu == 2){
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****** Bạn đã thắng cược!");
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }else {
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("****** Bạn đã thua cược");
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }
                }else{
                    System.out.println("****** Tổng là: " + tong + " => tài.");
                    if(luaChonTaiXiu == 1){
                        taiKhoanNguoiChoi += datCuoc;
                        System.out.println("****** Bạn đã thắng cược!");
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }else {
                        taiKhoanNguoiChoi -= datCuoc;
                        System.out.println("****** Bạn đã thua cược");
                        System.out.println("****** Tài khoản của bạn là: " + numf.format(taiKhoanNguoiChoi));
                    }
                }


            }
        }while(luaChon==1);
    }
}
