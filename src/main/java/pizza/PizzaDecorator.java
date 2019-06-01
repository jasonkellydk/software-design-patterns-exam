package pizza;

/**
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public abstract class PizzaDecorator implements Pizza {
  private final Pizza decoratedPizza;

  public PizzaDecorator(Pizza pizza) {
    decoratedPizza = pizza;
  }

  @Override
  public long getCost() {
    return decoratedPizza.getCost();
  }

  @Override
  public String getIngredients() {
    return decoratedPizza.getIngredients();
  }
}
