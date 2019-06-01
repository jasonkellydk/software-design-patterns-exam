package pizza;

/**
 * Who eats pizza with pineapple?
 * Well me, but lets make the price high
 * Just to follow the stream of pineapple haters.
 *
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public class WithPineapple extends PizzaDecorator {
  public WithPineapple(Pizza pizza) {
    super(pizza);
  }

  /**
   * The cost will be 10000 øre DKK more
   *
   * @return cost + 10000 øre
   */
  @Override
  public long getCost() {
    return super.getCost() + 10000;
  }

  /**
   * Will add pineapple to the ingredient list
   *
   * @return ingredients + pineapple
   */
  @Override
  public String getIngredients() {
    return super.getIngredients() + ", Pineapple";
  }
}
