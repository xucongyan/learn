package builder;

/**
 * 抽象建造者
 */
public abstract class MealBuilder {

    Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
