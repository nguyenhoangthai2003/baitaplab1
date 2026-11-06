package bai1;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("P01", "But bi", 5000));
        list.add(new Product("P02", "Vo 200 trang", 25000));
        list.add(new Product("P03", "Balo", 350000));
        list.add(new ImportedProduct("I01", "Laptop", 15000000, 0.1, 200000));
        list.add(new ImportedProduct("I02", "Tai nghe", 2000000, 0.05, 50000));

        System.out.println(" DANH SACH SAN PHAM ");
        for (Product p : list) {
            System.out.println(p + " -> finalPrice = " + String.format("%.2f", p.finalPrice()));
        }

        Product max = list.get(0);
        for (Product p : list) {
            if (p.finalPrice() > max.finalPrice()) max = p;
        }
        System.out.println("\nSan pham co finalPrice cao nhat:");
        System.out.println(max + " -> " + String.format("%.2f", max.finalPrice()));
    }
}
