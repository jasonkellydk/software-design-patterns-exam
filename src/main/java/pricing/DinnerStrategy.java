package pricing;

/**
 * The lunch pricing strategy
 * to make pizza a crucial part of every
 * dinner table we provide an adjusted price
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public class DinnerStrategy implements Pricing {
  /**
   * In the evening the price uses surge principle
   * Pizza is very popular at the dinner table
   * @param amount amount in DKK
   * @return amount * 1.2
   */
  @Override
  public long applyDiscount(long amount) {
    return amount * 2;
  }
}
