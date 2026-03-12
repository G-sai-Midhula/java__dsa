abstract class Shape {

    // abstract method
    abstract void draw();

    // normal method
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {

    // implementing abstract method
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class Abstract {
    public static void main(String[] args) {

        Circle c = new Circle();
        c.draw();
        c.display();
    }
}
//SINGLE TON

abstract class AbstracT {

    private static Abstract obj = new ConcreteClass();

    // abstract method
    abstract void display();

    // static method to return object
    public static Abstract getInstance() {
        return obj;
    }
}

// child class implementing abstract method
class ConcreteClass extends Abstract {

    void display() {
        System.out.println("Singleton object using abstract class");
    }
}

public class Main {
    public static void main(String[] args) {

        Abstract s = Abstract.getInstance();
        s.display();
    }
}