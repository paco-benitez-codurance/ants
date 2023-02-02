package ants;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrinterShould {

  Printer printer;

  @BeforeEach
  void setUp() {
    printer = new Printer();
  }

  @Test
  void printOneDimensionGridState_when_print() {
    Grid grid = new Grid(1);
    Ant ant = Ant.noAnt();

    String result = captureConsoleString(() -> printer.print(grid, ant));

    String expectedResult = "B";
    assertEquals(expectedResult, result);
  }

  @Test
  void printThreeDimensionGridState_when_print() {
    Grid grid = new Grid(3);
    Ant ant = Ant.noAnt();

    String result = captureConsoleString(() -> printer.print(grid, ant));

    String expectedResult = """
      BBB
      BBB
      BBB""";

    assertEquals(expectedResult, result);
  }

  @Test
  void print_grid_with_an_ant_in_the_middle() {
    Grid grid = new Grid(3);
    Ant ant = new Ant(1);

    String result = captureConsoleString(() -> printer.print(grid, ant));

    String expectedResult = """
      BBB
      BHB
      BBB""";
    assertEquals(expectedResult, result);
  }

  private String captureConsoleString(Runnable runnable) {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream((baos));

    PrintStream old = System.out;
    System.setOut(ps);

    runnable.run();

    System.setOut(old);

    return baos.toString();
  }

}