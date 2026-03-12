//method overloading

class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {

        MathOperation m = new MathOperation();

        System.out.println(m.add(10, 20));
        System.out.println(m.add(10, 20, 30));
    }
}

//method overriding

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {

        Animal a = new Dog();
        a.sound();
    }
}