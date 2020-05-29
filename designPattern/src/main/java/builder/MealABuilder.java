package builder;

/**
 * 具体构建者
 */
public class MealABuilder extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setDrink("可乐");
    }

    @Override
    public void buildDrink() {
        meal.setFood("薯条");
    }
}
