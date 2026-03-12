class Student {
    private int id;          // private variable
    private String name;     // private variable

    // setter method
    public void setId(int id) {
        this.id = id;
    }

    // getter method
    public int getId() {
        return id;
    }

    // setter method
    public void setName(String name) {
        this.name = name;
    }

    // getter method
    public String getName() {
        return name;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {

        Student s = new Student();

        s.setId(101);
        s.setName("Mahi");

        System.out.println("Student ID: " + s.getId());
        System.out.println("Student Name: " + s.getName());
    }
}

class Laptop {
    private String brand;
    private int price;

    // Setter method for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter method for brand
    public String getBrand() {
        return brand;
    }

    // Setter method for price
    public void setPrice(int price) {
        this.price = price;
    }

    // Getter method for price
    public int getPrice() {
        return price;
    }
}

public class Main {
    public static void main(String[] args) {

        Laptop l = new Laptop();

        l.setBrand("Dell");
        l.setPrice(60000);

        System.out.println("Laptop Brand: " + l.getBrand());
        System.out.println("Laptop Price: " + l.getPrice());
    }
}