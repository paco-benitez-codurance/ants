package ants;

public class Dimension {
  private int value;

  private Dimension(int value) {
    this.value = value;
  }

  public static Dimension of(int dimension) {
    return new Dimension(dimension);
  }

  public int value() {
    return value;
  }
}
