package ants;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class GridShould {

  private DimensionChecker dimensionChecker;

  @BeforeEach
  void setUp() {
    dimensionChecker = mock(DimensionChecker.class);
  }

  @Test
  void callDimensionChecker_when_build() {
    int aDimension = 3;
    new Grid(aDimension, () -> dimensionChecker);

    verify(dimensionChecker).checkDimension(aDimension);
  }

}