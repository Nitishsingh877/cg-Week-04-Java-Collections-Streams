package personalizedmealplangenerator;

public class mealGenrator {
    public static <T extends MealPlan> Meal<T> genrateMeal(T mealPlan){
        return new Meal<>(mealPlan);
    }
}
