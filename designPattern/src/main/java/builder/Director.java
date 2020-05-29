package builder;

/**
 * 指挥者
 */
public class Director {

    private MealBuilder mealBuilder;

    public Director(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal construct() {
        mealBuilder.buildFood();
        mealBuilder.buildDrink();

        return mealBuilder.getMeal();
    }
}
