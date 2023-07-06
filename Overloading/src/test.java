public class test {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        System.out.println(mm.timMin(5,6));
        System.out.println(mm.timMin(5.5,8.9));
        System.out.println(mm.tínhTong(25,68));
        double arr[]= {1,2,3,4,5};
        System.out.println(mm.tinhTong(arr));
    }
}
