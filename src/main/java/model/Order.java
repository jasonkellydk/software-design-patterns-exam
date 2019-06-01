package model;

import java.util.UUID;

/**
 * Abstract class that contains
 * order information for an given order.
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public class Order {
  private UUID id;

  private String order;

  private long price;

  public Order(String order, long price) {
    this.id = UUID.randomUUID();
    this.order = order;
    this.price = price;
  }

  public String getId() {
    return id.toString();
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }

  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }
}
