package app;

public class Product {

    private String name;
    // Эта переменная может быть int или double
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product() {

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
// Создайте конструктор и геттеры
    // на все переменные
}
