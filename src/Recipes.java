import java.util.Objects;
import java.util.Set;

public class Recipes {

    private Set<Products> recipes;
    private Double totalCost;
    private String nameRecipe;

    public Recipes(Set<Products> recipes, Double totalCost, String nameRecipe) {
        this.recipes = recipes;
        this.totalCost = totalCost;
        this.nameRecipe = nameRecipe;
    }

    public Set<Products> getRecipes() {
        return recipes;
    }

    public Double getTotalCost() {
        return totalCost;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    @Override
    public String toString() {
        return "Recipes{" +
                "recipes=" + recipes +
                ", totalCost=" + totalCost +
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
