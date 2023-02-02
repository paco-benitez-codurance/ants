package ants;

import java.util.function.Supplier;

public class Grid {

  public final int dimension;

  public Grid(int dimension) {
    this(dimension, DimensionChecker::new);
  }

  Grid(int dimension, Supplier<DimensionChecker> dimensionCheckerSupplier) {
    dimensionCheckerSupplier.get().checkDimension(dimension);
    this.dimension = dimension;
  }

  public String getColorAt(int x, int y) {
        throw new UnsupportedOperationException();
    }
}
