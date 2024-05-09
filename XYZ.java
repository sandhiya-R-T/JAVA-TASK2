package OOPSinJava;

import java.util.Scanner;

class Product {
    private int pid;
    private double price;
    private int quantity;

        public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

        public int getPid() {
        return pid;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

public class XYZ {
        public static Product[] acceptProductInfo() {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        System.out.println("Enter product information (pid, price, quantity) for 5 products:");

        for (int i = 0; i < 5; i++) {
            System.out.println("Product " + (i + 1) + ":");
            System.out.print("Enter pid: ");
            int pid = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            products[i] = new Product(pid, price, quantity);
        }

        scanner.close();
        return products;
    }
    public static int findProductWithHighestPrice(Product[] products) {
        double maxPrice = products[0].getPrice();
        int maxPid = products[0].getPid();

        for (int i = 1; i < products.length; i++) {
            if (products[i].getPrice() > maxPrice) {
                maxPrice = products[i].getPrice();
                maxPid = products[i].getPid();
            }
        }

        return maxPid;
    }

       public static double calculateTotalAmount(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }

       public static void main(String[] args) {
        
        Product[] products = acceptProductInfo();

               int maxPid = findProductWithHighestPrice(products);
        System.out.println("Pid of the product with the highest price: " + maxPid);

               double totalAmount = calculateTotalAmount(products);
        System.out.println("Total amount spent on all products: $" + totalAmount);
    }
}
