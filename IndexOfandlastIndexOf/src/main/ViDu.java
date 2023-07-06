package main;

public class ViDu {
    public static void main(String[] args) {
        String s1 = "Xin chào, tất cả mọi người, Xin chào!";
        String s2 = "Xin chào";
        String s3 = "Xin chào 123";
        char c1 = 'ô';
        char c2 = 'à';
        char c3 = '!';

        //Hàm indexOf
        System.out.println("Vị trí của s2 trong s1 là: "+ s1.indexOf(s2));
        System.out.println("Vị trí của s3 trong s1 là: "+ s1.indexOf(s3));

        //Sử dụng vị trí bắt đầu
        System.out.println("Vị trí của s2 trong s1 tại lần 2 là: "+ s1.indexOf(s2,2));

        //Tìm kiếm char
        System.out.println("Vị trí của c1 trong s1 là: "+ s1.indexOf(c1));
        System.out.println("Vị trí của c2 trong s1 là: "+ s1.indexOf(c2));
        System.out.println("Vị trí của c2 trong s1 tại lần 2 là: "+ s1.indexOf(c2,7));

        //Hàm lastIndexOf
        System.out.println("Vị trí của c2 trong s1 là: "+ s1.lastIndexOf(s2));
        System.out.println("Vị trí của c2 trong s1 là: "+ s1.lastIndexOf(c3));





    }
}
