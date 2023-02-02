package ants;

import java.util.Objects;

public class Position {
  private int value;

  private Position(int value) {
    this.value = value;
  }

  public static Position of(int dimension) {
    return new Position(dimension);
  }

  public int value() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Position position = (Position) o;
    return value == position.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
