package personalizedmealplangenerator;

public class VegetarianMeal implements MealPlan{
    private String mealName;
    private int duration;

    public VegetarianMeal(String mealName, int duration) {
        this.mealName = mealName;
        this.duration = duration;
    }

    public String getMealName() {
        return mealName;
    }

    @Override
    public void getMealDetails() {
        System.out.println("meal is" + getMealName());
        System.out.println("duration in months is " + duration);
    }
}
