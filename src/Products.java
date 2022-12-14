import java.util.*;

public class Products {

    private String name;
    private Double price;
    private Integer amount;

    private HashMap<Products, Integer> products;



    public Products(String name, Integer amount ) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.name = name;
            if (amount == null) {
                this.amount = 1;
            } else {
                this.amount = amount;
            }
        }
        products = new HashMap<>();
    }
    public Products(String name, Double price, Integer amount) {
        if (name == null || name.isEmpty()) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.name = name;
        }
        if (price == null) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.price = price;
        }
        if (amount == (int) 0) {
            this.amount = 1;
        } else {
            this.amount = amount;
        }

        products = new HashMap<>();
    }

    public void addProduct(Products products) {
        List<Products> list = new ArrayList<>();
        if (list.equals(list)) {
            throw new RuntimeException("Такой товар уже есть");
        } else {
            list.add(products);
        }
    }

    public void setProducts(HashMap<Products, Integer> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Integer getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products1 = (Products) o;
        return Objects.equals(name, products1.name) && Objects.equals(price, products1.price) && Objects.equals(amount, products1.amount) && Objects.equals(products, products1.products);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, price, amount, products);
    }
}
