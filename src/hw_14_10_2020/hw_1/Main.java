package hw_14_10_2020.hw_1;

public class Main {

    public static void main(String[] args) {
        Cat scottish_fold = new Cat("Scottish Fold", 3, 55);
        scottish_fold.printBreed();
        scottish_fold.params();
        scottish_fold.meow();
        scottish_fold.eating();
        Cat.move();
        System.out.println();

        Dog billy = new Dog("Billy", 8, 50);
        billy.printBreed();
        billy.params();
        billy.woof();
        billy.eating();
        Dog.move();
        System.out.println();

        Mouse house_mouse = new Mouse("House mouse", 100, 10);
        house_mouse.printBreed();
        house_mouse.params();
        house_mouse.piii();
        Mouse.move();
        house_mouse.eaten();
    }
}
