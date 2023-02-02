package ants;

import java.util.function.Function;
import java.util.function.Supplier;

public class App {

  private final Printer printer;
  private final Ant ant;
  private final Grid grid;

  App(Dimension dimension,
      Function<Position, Ant> antFunction,
      Function<Dimension, Grid> gridFunction,
      Supplier<Printer> printerFunction) {
    this.printer = printerFunction.get();
    this.ant = antFunction.apply(Position.of(dimension.value() / 2));
    this.grid = gridFunction.apply(dimension);
  }

  public void print() {
    printer.print(grid, ant);
  }

  public void move() {
    String color = grid.getColorAt(1, 1);

    if (color.equals("N")) {
      ant.moveLeft();
    }

    if (color.equals("B")) {
      ant.moveRight();
    }

  }
}
