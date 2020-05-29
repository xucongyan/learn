package builder;

/**
 * 具体构建者
 */
public class MealBBuilder extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setDrink("柠檬果汁");
    }

    @Override
    public void buildDrink() {
        meal.setFood("鸡翅");
    }
}
