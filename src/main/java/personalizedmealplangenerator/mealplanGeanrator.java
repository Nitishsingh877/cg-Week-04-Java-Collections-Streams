package personalizedmealplangenerator;

public class mealplanGeanrator {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMealMeal = mealGenrator.genrateMeal(new VegetarianMeal("panner",6));
        Meal<VeganMeal> veganMealMeal = mealGenrator.genrateMeal(new VeganMeal("tezPatta",2));
        Meal<KetoMeal> ketoMealMeal = mealGenrator.genrateMeal(new KetoMeal("ketoCrabs",50));
        Meal<HighProteinMeal> highProteinMealMeal = mealGenrator.genrateMeal(new HighProteinMeal("chicken",100));

        //displaying meal plans
        vegetarianMealMeal.displayMeal();
        System.out.println("----------");
//        VeganMeal vm;
//        vm = veganMealMeal.getMealPlan();
//        System.out.println(vm.getMealName());
        veganMealMeal.displayMeal();
        System.out.println("\n-----------");
        ketoMealMeal.displayMeal();
        System.out.println("----------");
        highProteinMealMeal.displayMeal();





     }
}
