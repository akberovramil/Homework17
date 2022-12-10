import java.util.*;

public class Products {

    private String name;
    private Double price;
    private Double amount;
    private HashSet<Products> products;

    public Products() {

    }

    public Products(String name, Double price, Double amount) {

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
        if (amount == null) {
            throw new RuntimeException("Заполните карточку товара полностью");
        } else {
            this.amount = amount;
        }

        products = new HashSet<>();


    }

    public void addProduct(Products products) {

        List<Products> list = new ArrayList<>();
        if (list.equals(list)) {
            throw new RuntimeException("Такой товар уже есть");
        } else {
            list.add(products);
        }
    }

    public Set<Products> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getAmount() {
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
