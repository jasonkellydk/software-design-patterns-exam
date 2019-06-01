package pricing;

/**
 * The breakfast pricing strategy
 * will make pizza a part of the most
 * crucial meal of the day, why eat healthy?
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public class BreakfastStrategy implements Pricing {
  /**
   * Pizza is not popular for breakfast,
   * We use the cheap tricks to make pizza
   * more popular
   * @param amount amount in DKK "øre"
   * @return amount / 3
   */
  @Override
  public long applyDiscount(long amount) {
    return amount / 3;
  }
}
