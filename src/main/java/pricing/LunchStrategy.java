package pricing;

/**
 * The lunch pricing strategy
 * We want to optimize when people
 * Eat pizzas and therefore we need discount
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public class LunchStrategy implements Pricing {
  /**
   * We apply 50% discount in this strategy
   * @param amount in DKK "øre"
   * @return amount / 2
   */
  @Override
  public long applyDiscount(long amount) {
    return amount / 2;
  }
}
