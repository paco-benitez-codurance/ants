package ants;

public class App {

    private final int dimension;
    private boolean isAntInGrid;

    App(DimensionChecker dimensionChecker, int dimension) {
        this.dimension = dimension;
        dimensionChecker.checkDimension(this.dimension);
    }

    public void start() {
        isAntInGrid = true;
    }

    public void print() {
        String line = "B".repeat(dimension);
//TODO: Refactor this!!
        for (int i = 0; i < dimension - 1; i++) {
            if (i == dimension / 2 && isAntInGrid) {
                String antLine = line.substring(0, dimension / 2) + "H" + line.substring(dimension / 2 + 1);
                System.out.println(antLine);
            } else {
                System.out.println(line);
            }
        }
        System.out.print(line);
    }


}
