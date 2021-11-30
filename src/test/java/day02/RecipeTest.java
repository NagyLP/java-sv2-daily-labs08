package day02;

import day01.NumerSequence;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RecipeTest {

    Recipe recipe = new Recipe("Rántottharcsás palancsinta", "Érdekes étel");
    Recipe recipeTwo = new Recipe("Rántottharcsás palancsinta");


    void testCreate() {
        assertEquals(2, recipe.getIngredient().size());
        assertEquals(0, recipeTwo.getIngredient().size());
        NumerSequence nsThree = new NumerSequence(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(5, nsThree.getNumber().size());
    }

    @Test
    void testAddIngredient() {
recipe.addIngredient("Tejföl");
recipe.addIngredient("Palacsinta");

assertEquals();

    }


}