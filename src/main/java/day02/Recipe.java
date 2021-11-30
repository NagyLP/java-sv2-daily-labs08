package day02;

import java.util.List;

public class Recipe {

    private String recipeName;
    private List<String> ingredient;
    private String description;

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }

    public Recipe(String recipeName, String description) {
        this.recipeName = recipeName;
        this.description = description;
    }

    public void addIngredient(String ingredient) {
        if (ingredient.isBlank()) {
            System.out.println("Egyet kötelező hozzáadni.");
        } else {
            this.ingredient.add(ingredient);
        }
    }

    public String getRecipeName() {
        return recipeName;
    }

    public List<String> getIngredient() {
        return ingredient;
    }

    public String getDescription() {
        return description;
    }
}
