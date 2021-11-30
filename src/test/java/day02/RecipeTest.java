package day02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class RecipeTest {

    Recipe recipe = new Recipe("Rántottharcsás palancsinta", "Érdekes étel");
    Recipe recipeTwo = new Recipe("Rántottharcsás palancsinta 2");


    void testCreate() {
        assertNull(recipeTwo.getDescription());
        assertNull(recipeTwo.getIngredient());

        assertEquals(2, recipe.getIngredient().size());
        assertEquals(0, recipeTwo.getIngredient().size());
        assertEquals("Rántottharcsás palancsinta", recipe.getRecipeName());
        assertEquals("Érdekes étel", recipe.getDescription());
    }

    @Test
    void testAddIngredient() {
        recipe.addIngredient("Tejföl");
        recipe.addIngredient("Palacsinta", "harcsa", "kenyér");

        assertEquals(3, recipe.getIngredient().size());
        assertEquals(List.of("Palacsinta", "harcsa", "kenyér"), recipe.getIngredient());
    }
}
