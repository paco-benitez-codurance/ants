package ants;

public class App {

    private final int dimension;
    private final Printer printer;
    private final Ant ant;
    private final Grid grid;
    private boolean isAntInGrid;

    App(DimensionChecker dimensionChecker, int dimension, Ant ant, Grid grid) {
        this.ant = ant;
        this.dimension = dimension;
        this.printer = new Printer(dimension);
        this.grid = grid;
        dimensionChecker.checkDimension(this.dimension);
    }

    public void start() {
        isAntInGrid = true;
    }

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
            int antLinePosition = getAntLinePosition();
            printer.printAntLine(antLinePosition);
        } else {
            printer.printBlankLine();
        }
    }

    private boolean isAntLocatedInThisLine(int lineNumber) {
        int antLineNumber = getAntLinePosition();

        return lineNumber == antLineNumber && isAntInGrid;
    }

    private int getAntLinePosition() {
        return dimension / 2;
    }

    public void move() {
        String color = grid.getColorAt(1,1);

        if (color.equals("N")) {
            ant.moveLeft();
        }

        if(color.equals("B")){
            ant.moveRight();
        }


    }
}
