package main;

import java.util.*;

public class TuDien {
    private Map<String,String>   duLieu = new TreeMap<String,String>();

    public String themTu(String tuKhoa,String yNghia){
        return this.duLieu.put(tuKhoa,yNghia);
    }

    public String xoaTu(String tuKhoa){
        return this.duLieu.remove(tuKhoa);
    }

    public String traTu(String tuKhoa){
        return this.duLieu.get(tuKhoa);
    }
    public void inTuKhoa(){
        Set<String> tapHopTuKhoa = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }

    public int laySoLuong(){
        return this.duLieu.size();
    }

    public void xoaTatCa(){
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        TuDien tuDien= new TuDien();
        int luaChon=0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("-----------------");
            System.out.println("MENU");
            System.out.println("1. Thêm từ (Từ khóa, Ý nghĩa).");
            System.out.println("2. Xóa từ.");
            System.out.println("3. Tìm ý nghĩa của từ khóa.");
            System.out.println("4. In ra danh sách từ khóa.");
            System.out.println("5. In ra số lượng từ.");
            System.out.println("6. Xóa tất cả các từ khóa.");
            System.out.println("0. Thoát khỏi chương trình.");
            luaChon = input.nextInt();
            input.nextLine();
            if (luaChon==1){
                System.out.println("Nhập vào từ khóa: ");
                String tuKhoa = input.nextLine();
                System.out.println("Nhập vào ý nghĩa: ");
                String yNghia = input.nextLine();
                tuDien.themTu(tuKhoa,yNghia);
            } else if (luaChon==2 || luaChon==3) {
                String tuKhoa =input.nextLine();
                if (luaChon == 2){
                    System.out.println("Nhập vào từ khóa: ");
                    tuDien.xoaTu(tuKhoa);
                }else {
                    System.out.println("Nhập vào từ khóa: ");
                    System.out.println("Ý nghĩa là: " + tuDien.traTu(tuKhoa));
                }
            } else if (luaChon==4) {
                tuDien.inTuKhoa();
            } else if (luaChon==5) {
                System.out.println("Số lượng từ khóa là: " + tuDien.laySoLuong());
            } else if (luaChon==6) {
                tuDien.xoaTatCa();
            }
        }while (luaChon !=0);

    }
}
