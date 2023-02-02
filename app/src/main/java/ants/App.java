package ants;

import java.util.function.Function;

public class App {

  private final int dimension;
  private final Printer printer;
  private final Ant ant;
  private final Grid grid;
  private boolean isAntInGrid;

  App(DimensionChecker dimensionChecker,
      int dimension,
      Function<Integer, Ant> antFunction,
      Function<Integer, Grid> gridFunction) {
    this.dimension = dimension;
    this.printer = new Printer(dimension);
    this.ant = antFunction.apply(dimension / 2);
    this.grid = gridFunction.apply(dimension);
    dimensionChecker.checkDimension(this.dimension);
  }

  public void start() {
    isAntInGrid = true;
  }

  //xxxxx -> xxxx.print(grid, ant)
  public void print() {
    for (int i = 0; i < dimension - 1; i++) {
      printLine(i);
      printer.printLn();
    }
    printLine(dimension);
  }

  private void printLine(int lineNumber) {
    boolean isAntLine = isAntLocatedInThisLine(lineNumber);

    if (isAntLine) {
      printer.printAntLine(ant.position);
    } else {
      printer.printBlankLine();
    }
  }

  private boolean isAntLocatedInThisLine(int lineNumber) {
    int antLineNumber = ant.position;

    return lineNumber == antLineNumber && isAntInGrid;
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
