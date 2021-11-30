package day02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Recipe {

    private String recipeName;
    private List<String> ingredient = new ArrayList<>();
    private String description;

    public Recipe(String recipeName) {
        this.recipeName = recipeName;
    }

    public Recipe(String recipeName, String description) {
        this.recipeName = recipeName;
        this.description = description;
    }

    public void addIngredient(String ingredient, String... more) {
        this.ingredient.add(ingredient);
        Collections.addAll(this.ingredient, more);
    }
//        if (ingredient.isBlank()) {
//            System.out.println("Egyet kötelező hozzáadni.");
//        } else {
//            this.ingredient.add(ingredient);
//        }
//    }

    public String getRecipeName() {
        return recipeName;
    }

    public List<String> getIngredient() {
        return ingredient;
    }

    public String getDescription() {
        return description;
    }

    public boolean equals(Recipe other) {
        return recipeName.equals(other.recipeName);
    }
}
