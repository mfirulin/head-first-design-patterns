/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package chapter04;

public class App {
    public String getGreeting() {
        return "Factory app test";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza();
        System.out.println("Ethan ordered a " + pizza.getName());
        System.out.println();
        pizza = chicagoStore.orderPizza();
        System.out.println("Joel ordered a " + pizza.getName());
    }
}
