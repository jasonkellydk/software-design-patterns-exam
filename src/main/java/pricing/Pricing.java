package pricing;

/**
 * pricing.Pricing is the common contract
 * to define the given price
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public interface Pricing {

  /**
   * All prices are returned as a long
   * Primarily to support the Diamond Pizza
   * #milleniumPizza
   * @return long price in "øre"
   */
  public long applyDiscount(long amount);
}
