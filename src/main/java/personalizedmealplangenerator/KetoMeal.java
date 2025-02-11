package personalizedmealplangenerator;

public class KetoMeal implements MealPlan{

    private String MealName;
    private int carbsWeight;

    public KetoMeal(String mealName, int carbsWeight) {
        MealName = mealName;
        this.carbsWeight = carbsWeight;
    }

    public String getMealName() {
        return MealName;
    }

    @Override
    public void getMealDetails() {
        System.out.println("meal name is " + getMealName());
        System.out.println("weights for carbs is " + carbsWeight);
    }
}
