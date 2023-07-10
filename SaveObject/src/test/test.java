package test;

import main.DanhSachSinhVien;
import main.SinhVien;

import java.io.File;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do {
            System.out.println("MENU ------- ");
            System.out.println(
                    "1.	Thêm sinh viên vào danh sách.\n"
                            + "2.	In danh sách sinh viên ra màn hình.\n"
                            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                            + "5.	Làm rỗng danh sách sinh viên.\n"
                            + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                            + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "10.	Ghi tất cả dữ liệu xuống file.\n"
                            + "0.  Thoát khỏi chương trình."
            );
            luaChon = input.nextInt();
            input.nextLine();

            if (luaChon == 1) {
                    System.out.println("Nhập mã sinh viên: "); String maSinhVien = input.nextLine();
                    System.out.println("Nhập họ và tên: "); String hoVaTen = input.nextLine();
                    System.out.println("Nhập năm sinh: "); int namSinh = input.nextInt();
                    System.out.println("Nhập điểm trung bình: "); double diemTrungBinh = input.nextDouble();
                    SinhVien sv = new SinhVien(maSinhVien,hoVaTen,namSinh,diemTrungBinh);
                    dssv.themSinhVien(sv);

            }
            else if (luaChon == 2) {
                dssv.inDanhSachSinhvien();
            }
            else if (luaChon == 3) {
                System.out.println("Kiểm tra danh sách rỗng: "+ dssv.kiemTraDanhSachRong());
            }
            else if (luaChon == 4) {
                System.out.println("Số lượng hiện tại: "+ dssv.laySoLuongSinhVien());

            }
            else if (luaChon == 5) {
                dssv.lamRongDanhSach();
            }
            else if (luaChon == 6) {
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = input.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Kiểm tra sinh viên có trong danh sách: "+ dssv.kiemTraTonTai(sv));
            }
            else if (luaChon == 7) {
                System.out.println("Nhập mã sinh viên: "); String maSinhVien = input.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Xóa sinh viên có trong danh sách: "+ dssv.xoaSinhVien(sv));
            }
            else if (luaChon == 8) {
                System.out.println("Nhập họ và tên: "); String hoVaTen = input.nextLine();
                dssv.timSinhVien(hoVaTen);
            }
            else if (luaChon == 9) {
                dssv.sapXepSinhVienGiamDanTheoDiem();
                dssv.inDanhSachSinhvien();

            }
            else if (luaChon == 10) {
                System.out.println("Nhập tên file: ");
                String tenFile = input.nextLine();
                File f = new File(tenFile);
                dssv.ghiDuLieuXuongFile(f);

            }
        }while (luaChon != 0);
    }
}
