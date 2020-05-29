package builder;

/**
 * 构造者模式
 */
public class Test {

    public static void main(String[] args) {

        Director directorA = new Director(new MealABuilder());

        Director directorB = new Director(new MealBBuilder());

        Meal mealA = directorA.construct();
        Meal mealB = directorB.construct();


        System.out.println(mealA.getDrink());
        System.out.println(mealB.getDrink());
    }
}
