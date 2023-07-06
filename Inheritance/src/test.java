public class test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Husky");
        Cat cat1 = new Cat("mèo tam thể");
        Bird bird = new Bird("chim sẻ");

        System.out.println(bird.name);
        bird.makeSound();
        bird.eat();
        bird.sleep();
        System.out.println(dog1.name);
        dog1.makeSound();
        dog1.eat();
        dog1.sleep();
        System.out.println(cat1.name);
        cat1.makeSound();
        cat1.eat();
        cat1.sleep();
    }
}
