package app;

import java.util.Scanner;

// Исправьте ошибки компиляции
public class ProductBInfo {
static Product product = new Product();
    static String productName;
   private static double quantity;

    public static double getQuantity() {
        return quantity;
    }

    public static void setQuantity(double quantity) {
        ProductBInfo.quantity = quantity;
    }

    public static double getPrice() {
        return price;
    }

    public static void setPrice(double price) {
        ProductBInfo.price = price;
    }

    private static double price;


    public static void main(String[] args) {
        doInputs();
        showData(processData());
    }

    private static void doInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара: ");
        productName = scanner.nextLine().trim();
        product.setName(productName);
        System.out.print("Введите количество товара: ");
       sequantity = scanner.nextDouble();
        System.out.print("Введите цену товара: ");
        price = scanner.nextDouble();
        System.out.print("---------------------------\n");
        scanner.close();
    }

    private static String processData() {
//        String name = получите значение через геттер
//        quantity = получите значение через геттер
//        price = получите значение через геттер
        String cost = Rounder.roundValue(calcSales(quantity, price));
        return "Товар: " + product.getName() + "\nСтоимость (грн.): " + cost;
    }

    private static double calcSales(double quantity, double price) {
        return quantity * price;
    }

    private static void showData(String output) {
        System.out.println(output);
    }
}
