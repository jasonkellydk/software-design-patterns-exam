package view;

import org.jetbrains.annotations.Nullable;

/**
 * The viewable will provide a common
 * way to provide an presentation of data.
 * @author Jason Kelly
 */
public interface Viewable {
  @Nullable
  public String render();
}
