package mediator;

import java.util.ArrayList;

import model.Order;
import view.OrderView;

/**
 * The order mediator
 * Will be responsible for
 * collecting input and presenting output
 * @author Jason Kelly
 */
public class OrderMediator {
  public void showOrder(ArrayList<Order> orders) {
    (new OrderView(orders)).render();
  }
}
