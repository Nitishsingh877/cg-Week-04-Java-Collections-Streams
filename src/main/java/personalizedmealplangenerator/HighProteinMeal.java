package personalizedmealplangenerator;

public class HighProteinMeal implements MealPlan{
    private String mealName;
    private int gramsInProteins;

    public HighProteinMeal(String mealName, int gramsInProteins) {
        this.mealName = mealName;
        this.gramsInProteins = gramsInProteins;
    }

    public String getMealName() {
        return mealName;
    }

    @Override
    public void getMealDetails() {
        System.out.println("plan for High Protein Meal");
        System.out.println("meal name is " + mealName);
        System.out.println("gram in protein needed is " + gramsInProteins);
    }
}
