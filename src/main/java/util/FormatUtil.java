package util;

/**
 * Price formatter for our
 * floating point safe pizza shop
 *
 * @author Jason Kelly <jason-kelly@live.dk>
 */
public final class FormatUtil {
  /**
   * Returns a human readable price
   *
   * @param amount in øre
   * @return string of human readable
   */
  public static String HumanReadableCrowns(long amount) {
    String crowns = Long.toString((amount / 100));
    return String.format("%s,- DKK", crowns);
  }
}
