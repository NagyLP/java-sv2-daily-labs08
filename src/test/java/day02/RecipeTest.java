package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe = new Recipe("Rántottharcsás palancsinta", "Érdekes étel");
    Recipe recipeTwo = new Recipe("Rántottharcsás palancsinta 2");


    void testCreate() {
        assertNotNull(recipe.getDescription());
        assertNull(recipeTwo.getDescription());

        assertEquals(0, recipe.getIngredients().size());
        assertEquals(0, recipeTwo.getIngredients().size());
        assertEquals("Rántottharcsás palancsinta", recipe.getName());
        assertEquals("Érdekes étel", recipe.getDescription());
    }

    @Test
    void testAddIngredient() {
        recipe.addIngredient("Tejföl");
        recipe.addIngredient("Palacsinta", "harcsa", "kenyér");

        assertEquals(4, recipe.getIngredients().size());
        assertEquals(List.of("Tejföl", "Palacsinta", "harcsa", "kenyér"), recipe.getIngredients());
    }
}
