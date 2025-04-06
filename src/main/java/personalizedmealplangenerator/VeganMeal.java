package personalizedmealplangenerator;

public  class  VeganMeal implements MealPlan {
        private String mealName;
        private int weight;

        public VeganMeal(String mealName, int weight) {
            this.mealName = mealName;
            this.weight = weight;
        }

        public  String getMealName() {
            return mealName;
        }

        @Override
        public void getMealDetails() {
            System.out.println("plan for Vegan meal");
            System.out.println("meal is :" + getMealName());
            System.out.println("Weight loss in per months will be : " + weight);
        }
    }


