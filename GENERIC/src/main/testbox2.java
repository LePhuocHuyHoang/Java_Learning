package main;

public class testbox2 {
    public static void main(String[] args) {
        Box2 b1 = new Box2<Integer>(15);
        System.out.println("Gía trị: " + b1.getValue());

        Box2 b2 = new Box2<String>("Hello");
        System.out.println("Gía trị: " + b2.getValue());

        Box2 b3 = new Box2<Double>(3.5);
        System.out.println("Gía trị: " + b3.getValue());
    }
}
