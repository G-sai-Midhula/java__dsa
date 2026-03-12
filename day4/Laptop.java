class Laptop {

    String brand;
    int price;

    void display() {
        System.out.println(brand + " " + price);
    }

    public static void main(String args[]) {
        Laptop l1 = new Laptop();
        l1.brand = "Dell";
        l1.price = 60000;
        l1.display();
    }
}