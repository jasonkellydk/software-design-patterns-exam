import logging.Logger;
import mediator.OrderMediator;
import model.Order;
import pizza.Pizza;
import pizza.SimplePizza;
import pizza.WithKebab;
import pizza.WithPineapple;
import pricing.BreakfastStrategy;
import pricing.DinnerStrategy;
import pricing.LunchStrategy;
import pricing.Pricing;

public class Main {
  public static void main(String[] args) {
    Pricing breakfast = new BreakfastStrategy();
    Pricing lunch = new LunchStrategy();
    Pricing dinner = new DinnerStrategy();

    Pizza pizza = new SimplePizza();
    pizza = new WithKebab(pizza);
    pizza = new WithPineapple(pizza);

    long pizzaPrice = pizza.getCost();
    long adjustedPrice = dinner.applyDiscount(pizzaPrice);

    Logger logger = Logger.getInstance();

    Order order = new Order(pizza.getIngredients(), adjustedPrice);
    logger.log(order);

    OrderMediator mediator = new OrderMediator();
    mediator.showOrder(logger.getLogs());
  }
}
