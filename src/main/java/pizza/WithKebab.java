package pizza;

/**
 * The co owner want to add kebab to the pizza
 * Perhaps we should add some compatibility check
 * Do anyone want pineapple and kebab on a pizza?
 * // TODO rethink this business decision
 *
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public class WithKebab extends PizzaDecorator {
  public WithKebab(Pizza pizza) {
    super(pizza);
  }

  /**
   * The added cost when dealing with kebab
   *
   * @return cost + 10000
   */
  @Override
  public long getCost() {
    return super.getCost() + 10000;
  }

  /**
   * The ingredients + kebab
   *
   * @return ingredients and some kebab.
   */
  @Override
  public String getIngredients() {
    return super.getIngredients() + ", Kebab";
  }
}
