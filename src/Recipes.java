import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Recipes {

    private HashMap<Products, Integer> recipes;
    private Products product;
    private Double totalCost;
    private String nameRecipe;
    private Integer productsAmount;

    public Recipes(Products product, Double totalCost, String nameRecipe, Integer productsAmount) {
        this.product = product;
        this.totalCost = totalCost;
        this.nameRecipe = nameRecipe;
        if (productsAmount == null || productsAmount == 0) {
            this.productsAmount = 1;
        } else {
            this.productsAmount = productsAmount;
        }
    }

    public static Double calculateCost(Recipes recipes) {
        Double sum;
        sum = recipes.product.getPrice() * recipes.productsAmount;
        return sum;
    }

    public Map<Products, Integer> getRecipes() {
        return recipes;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public Integer getProductsAmount() {
        return productsAmount;
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "product=" + product +
                ", nameRecipe='" + nameRecipe + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes1 = (Recipes) o;
        return Objects.equals(recipes, recipes1.recipes) && Objects.equals(totalCost, recipes1.totalCost) && Objects.equals(nameRecipe, recipes1.nameRecipe);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recipes, totalCost, nameRecipe);
    }
}
