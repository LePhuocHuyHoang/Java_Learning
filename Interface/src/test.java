public class test {
    public static void main(String[] args) {
        MayTinhCasioFX500 fx500= new MayTinhCasioFX500();
        MayTinhVinaCal500 cal500= new MayTinhVinaCal500();

        System.out.println("Test câu a: ");
        System.out.println(fx500.cong(5,6));
        System.out.println(fx500.chia(5,0));

        System.out.println("Test câu b: ");
        double[] arr={8,9,45,16,8};
        double[] arr1={41,12,25,16};

        SapXepChen sxchen =new SapXepChen();
        SapXepChon sxchon =new SapXepChon();
        sxchen.sapXepGiam(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        sxchon.sapXepTang(arr1);
        for (int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        System.out.println("Test câu c: ");
        System.out.println(pmmt.cong(12,6));
        pmmt.sapXepTang(arr1);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
