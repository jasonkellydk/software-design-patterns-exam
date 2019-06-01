package view;

import com.github.freva.asciitable.AsciiTable;

import java.util.ArrayList;

import model.Order;
import util.FormatUtil;

/**
 * Will present the order data
 * @author Jason Kelly
 */
public class OrderView implements Viewable {
  private ArrayList<Order> orders;

  public OrderView(ArrayList<Order> orders) {
    this.orders = orders;
  }

  @Override
  public String render() {
    String[] headers = {"Order ID", "Price DKK", "Pizza"};
    String[][] data = {{}};

    int length = orders.size();
    for (int i = 0; i < length; i++) {
      Order order = orders.get(i);
      String formattedPrice = FormatUtil.HumanReadableCrowns(order.getPrice());

      data[i] = new String[]{order.getId(), formattedPrice, order.getOrder()};
    }

    System.out.println(AsciiTable.getTable(headers, data));

    return null;
  }
}
