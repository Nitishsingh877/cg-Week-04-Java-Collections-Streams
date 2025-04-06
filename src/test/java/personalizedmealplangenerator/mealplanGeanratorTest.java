package personalizedmealplangenerator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mealplanGeanratorTest {

    @BeforeEach
    public void mealplan(){
        Meal<VegetarianMeal> vegetarianMealMeal = mealGenrator.genrateMeal(new VegetarianMeal("panner",6));
        Meal<VeganMeal> veganMealMeal = mealGenrator.genrateMeal(new VeganMeal("tezPatta",2));
        Meal<KetoMeal> ketoMealMeal = mealGenrator.genrateMeal(new KetoMeal("ketoCrabs",50));
        Meal<HighProteinMeal> highProteinMealMeal = mealGenrator.genrateMeal(new HighProteinMeal("chicken",100));
    }

   @Test
    void testVeganMeal(){
       Meal<VeganMeal> veganMealMeal = mealGenrator.genrateMeal(new VeganMeal("tezPatta",2));
        assertEquals("tezPatta",veganMealMeal.getMealPlan().getMealName());
       System.out.println("testCase Passed");
   }
    @Test
    void testVegetrainMeal(){
        Meal<VegetarianMeal> vegetarianMealMeal = mealGenrator.genrateMeal(new VegetarianMeal("panner",6));
        assertEquals("panner", vegetarianMealMeal.getMealPlan().getMealName(),"veg meal not passed");
    }
    @Test
    void HighProteinTest(){
        Meal<HighProteinMeal> highProteinMealMeal = mealGenrator.genrateMeal(new HighProteinMeal("chicken",100));
        assertEquals("chicken", highProteinMealMeal.getMealPlan().getMealName(), "protein test not passed");
    }
    @Test
    void KetoTest(){
        Meal<KetoMeal> ketoMealMeal = mealGenrator.genrateMeal(new KetoMeal("ketoCrabs",50));
        assertEquals("ketoCrabs", ketoMealMeal.getMealPlan().getMealName());
    }

}