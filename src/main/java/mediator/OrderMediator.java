package mediator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import logging.Logger;
import model.Order;
import pizza.Pizza;
import pizza.SimplePizza;
import pizza.WithKebab;
import pizza.WithPineapple;
import pricing.Pricing;
import view.OrderView;

/**
 * The order mediator
 * Will be responsible for
 * collecting input and presenting output
 *
 * @author Jason Kelly
 */
public class OrderMediator {
  public void showOrder(ArrayList<Order> orders) {
    (new OrderView(orders)).render();
  }

  public void placeOrder(Pricing pricingStrategy) {
    Pizza pizza = new SimplePizza();

    System.out.println("Please choose ingredients");
    System.out.println();
    System.out.println("1: Kebab");
    System.out.println("2: Pineapple");
    System.out.println("3: Complete order");

    while (true) {
      try {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String rawInput = reader.readLine();
        int option = Integer.parseInt(rawInput, 10);

        if (option == 1) {
          System.out.println("Kebab added");
          pizza = new WithKebab(pizza);
        }

        if (option == 2) {
          System.out.println("Pineapple added");
          pizza = new WithPineapple(pizza);
        }

        if (option == 3) {
          System.out.println("Here is your order");

          long adjustedPrice = pricingStrategy.applyDiscount(pizza.getCost());
          Order order = new Order(pizza.getIngredients(), adjustedPrice);

          Logger logger = Logger.getInstance();
          logger.log(order);

          this.showOrder(logger.getLogs());

          System.out.println("Thank you please come again..");
          break;
        }
      } catch (Exception e) {
        System.out.println("Invalid input, try again");
        System.out.println();
      }
    }
  }
}
