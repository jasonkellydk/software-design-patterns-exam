import mediator.OrderMediator;
import pricing.BreakfastStrategy;
import pricing.DinnerStrategy;
import pricing.LunchStrategy;
import pricing.Pricing;

public class Main {
  public static void main(String[] args) {
    Pricing breakfast = new BreakfastStrategy();
    Pricing lunch = new LunchStrategy();
    Pricing dinner = new DinnerStrategy();

    OrderMediator mediator = new OrderMediator();
    mediator.placeOrder(dinner);
  }
}
