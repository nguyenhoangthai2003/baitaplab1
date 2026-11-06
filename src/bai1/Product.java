package bai1;
public class Product {
    private String id;
    private String name;
    private double basePrice;

    public Product(String id, String name, double basePrice) {
        setId(id);
        setName(name);
        setBasePrice(basePrice);
    }

    public String getId() {
        return id; 
    }
    public void setId(String id) {
        if (id == null || id.trim().isEmpty())
            throw new IllegalArgumentException("id khong được rong");
        this.id = id;
    }

    public String getName() { 
        return name; 
    }
    public void setName(String name) { 
        this.name = name; 

    }

    public double getBasePrice() { 
        return basePrice; 
    }
    public void setBasePrice(double basePrice) {
        if (basePrice < 0)
            throw new IllegalArgumentException("basePrice >= 0");
        this.basePrice = basePrice;
    }

    public double finalPrice() { 
        return basePrice; 
    }

    @Override
    public String toString() {
        return String.format("Product[id=%s, name=%s, basePrice=%.2f]", id, name, basePrice);
    }
}
