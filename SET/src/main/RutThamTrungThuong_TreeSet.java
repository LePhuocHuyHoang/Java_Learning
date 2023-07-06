package main;

import java.util.TreeSet;
import java.util.*;

public class RutThamTrungThuong_TreeSet {
    Set<String> tapHopPhieuDuThuong = new TreeSet<String>();

    public RutThamTrungThuong_TreeSet() {
    }
    public boolean themPhieuDuThuong(String giaTri){
        return this.tapHopPhieuDuThuong.add(giaTri);
    }
    public boolean xoaPhieu(String giaTri){
        return this.tapHopPhieuDuThuong.remove(giaTri);
    }
    public boolean kiemTraPhieuTonTai(String giaTri){
        return this.tapHopPhieuDuThuong.contains(giaTri);
    }
    public void xoaTatCaPhieu(){
        this.tapHopPhieuDuThuong.clear();
    }

    public int laySoLuong(){
        return this.tapHopPhieuDuThuong.size();
    }
    public String rutMotPhieu(){
        String ketQua = "";
        Random rd = new Random();
        int viTri = rd.nextInt(this.tapHopPhieuDuThuong.size());
        ketQua = (String) this.tapHopPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }
    public void inRaTatCaPhieu(){
        System.out.println(Arrays.toString(this.tapHopPhieuDuThuong.toArray()));
    }
    public static void main(String[] args) {
        int luaChon = 0;
        Scanner input = new Scanner(System.in);
        RutThamTrungThuong_TreeSet rt = new RutThamTrungThuong_TreeSet();
        do {
            System.out.println("--------------------------------------");
            System.out.println("MENU: ");
            System.out.println("1. Thêm mã số dự thưởng.");
            System.out.println("2. Xóa mã số dự thưởng.");
            System.out.println("3. Kiểm tra mã số dự thưởng có tồn tại hay không?");
            System.out.println("4. Xóa tất cả các phiếu dự thưởng.");
            System.out.println("5. Số lượng phiếu dự thưởng.");
            System.out.println("6. Rút thăm trúng thưởng.");
            System.out.println("7. In ra tất cả các phiếu.");
            System.out.println("0. Thoát khỏi chương trình");
            luaChon = input.nextInt();
            input.nextLine();
            if(luaChon==1 || luaChon ==2 || luaChon==3){
                System.out.println("Nhập vào mã phiếu dự thưởng: ");
                String giaTri = input.nextLine();
                if(luaChon == 1){
                    rt.themPhieuDuThuong(giaTri);
                } else if (luaChon==2) {
                    rt.xoaPhieu(giaTri);
                } else{
                    System.out.println("Kết quả kiểm tra: " + rt.kiemTraPhieuTonTai(giaTri));
                }
            } else if (luaChon==4) {
                rt.xoaTatCaPhieu();
            } else if (luaChon==5) {
                System.out.println("Số lượng phiếu là: " + rt.laySoLuong());
            } else if (luaChon==6) {
                System.out.println("Mã số trúng thưởng là: "+ rt.rutMotPhieu());
            }else if (luaChon==7){
                System.out.println("Các mã phiếu dự thưởng là: " );
                rt.inRaTatCaPhieu();
            }

        }while (luaChon!=0);
    }
}
