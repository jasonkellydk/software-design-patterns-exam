package logging;

import org.jetbrains.annotations.Nullable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

import model.Order;

/**
 * The logger class will help our shop
 * gain more insight into our
 * staff and their work.
 *
 * @author Jason Kelly <jason-kelly@live.dk>
 * @see <a href="https://www.baeldung.com/java-singleton-double-checked-locking">More about singleton</a>
 */
public class Logger implements Serializable, Cloneable {
  /**
   * Volatile means that we never are never
   * caching in thread memory, but only
   * in main-memory.
   */
  private static volatile Logger instance;

  /**
   * Will contain all the logs
   * the key will be order id
   * and the value will be the order.
   */
  private HashMap<String, Order> logs = new HashMap<>();

  /**
   * Private constructor
   * To insure we cant instantiate
   * the singleton with the new keyword.
   */
  private Logger() {
  }

  /**
   * Lazy instantiation with Double-Checked locking
   *
   * @return Logger instance
   */
  public static Logger getInstance() {
    if (instance == null) {
      synchronized (Logger.class) {
        if (instance == null) {
          instance = new Logger();
        }
      }
    }

    return instance;
  }

  /**
   * Will add a new log from an order object
   * @param order an order
   */
  public void log(Order order) {
    logs.put(order.getId(), order);
  }

  /**
   * Return all the logs as an arrayList
   * @return logs
   */
  public ArrayList<Order> getLogs() {
    return new ArrayList<>(logs.values());
  }

  /**
   * Query an order for quick retrieval
   * @param id id of the order
   * @return order or null
   */
  @Nullable
  public Order getOrder(String id) {
    return logs.get(id);
  }

  /**
   * Will prevent serialization issues
   * Where an singleton can be instantiated twice
   *
   * @return instance
   */
  protected Object readResolve() {
    return getInstance();
  }

  /**
   * Will prevent the singleton from cloning
   * This will keep the singleton single.
   *
   * @return instance
   * @throws CloneNotSupportedException will never be thrown.
   */
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return getInstance();
  }
}
