package pizza;

/**
 * We will use the decorator pattern
 * To create pizzas which can dynamically be
 * changed, we are gonna see some fun ingredients.
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public interface Pizza {
  /**
   * Will return the cost of the
   * ingredient in DKK "øre"
   * @return cost of ingredients
   */
  long getCost();

  /**
   * Will return the ingredients used
   * @return String name of ingredient
   */
  String getIngredients();
}
