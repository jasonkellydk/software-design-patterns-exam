package pizza;

/**
 * The simplest pizza.
 * Will serve as base for
 * Our customizable pizzas.
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public class SimplePizza implements Pizza {
  /**
   * The base price of an pizza
   *
   * @return long cost of simple pizza
   */
  @Override
  public long getCost() {
    return 6000;
  }

  /**
   * The Simple pizza ingredients
   *
   * @return String simple pizza, the best start of a new pizza.
   */
  @Override
  public String getIngredients() {
    return "Dough, Tomato with garlic and some oregano";
  }
}
