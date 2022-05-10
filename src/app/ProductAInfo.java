package app;

import java.util.Scanner;

// Исправьте ошибки компиляции
public class ProductAInfo {
    static String productName;
static Product product = new Product();
    public static void setQuantity(int quantity) {
        ProductAInfo.quantity = quantity;
    }

    private static int quantity;
    static double price;
    // static Product завершите декларирование переменной;

    public static int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        doInputs();
        showData(processData());
    }



    public static void setPrice(double price) {
        ProductAInfo.price = price;
    }

    private static void doInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название товара: ");
       product.setName(scanner.nextLine().trim());
        System.out.print("Введите количество товара: ");
        quantity = scanner.nextInt();
        System.out.print("Введите цену товара: ");
        price = scanner.nextDouble();
        System.out.print("---------------------------\n");
        scanner.close();
    }

    public static double getPrice() {
        return price;
    }

    private static String processData() {



        String cost = Rounder.roundValue(calcSales(quantity, price));
        return "Товар: " + product.getName() + "\nСтоимость (грн.): " + cost;
    }

    private static double calcSales(int quantity, double price) {
        return quantity * price;
    }

    private static void showData(String output) {
        System.out.println(output);
    }
}
