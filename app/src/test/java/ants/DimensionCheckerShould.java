package ants;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class DimensionCheckerShould {

  private DimensionChecker dimensionChecker;


  @BeforeEach
  void setUp() {
    dimensionChecker = new DimensionChecker();
  }

  @Test
  void raiseError_when_dimensionIsEven() {
    int evenNumber = 2;

    assertThrows(WrongDimension.class, () ->
      dimensionChecker.checkDimension(evenNumber)
    );
  }

  @Test
  void raiseNoError_when_dimensionIsOdd() {
    int oddNumber = 1;

    assertDoesNotThrow(() ->
      dimensionChecker.checkDimension(oddNumber)
    );
  }

}