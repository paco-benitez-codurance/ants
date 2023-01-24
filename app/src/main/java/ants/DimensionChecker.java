package ants;

class DimensionChecker {
  void checkDimension(int dimension) {
    if (dimension % 2 == 0) throw new WrongDimension();
  }
}
