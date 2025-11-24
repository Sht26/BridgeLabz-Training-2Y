package Generics;
interface MealPlan {}

class VegetarianMeal implements MealPlan {}
class VeganMeal implements MealPlan {}
class KetoMeal implements MealPlan {}

class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan) { this.plan = plan; }
}

class MealUtil {
    public static <T extends MealPlan> void generateMeal(T plan) {
        System.out.println("Generated: " + plan.getClass().getSimpleName());
    }
}

class PersonalizedMealPlan {
    public static void main(String[] args) {
        MealUtil.generateMeal(new VeganMeal());
    }
}
