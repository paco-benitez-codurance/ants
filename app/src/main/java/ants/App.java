package ants;

public class App {

    private final int dimension;
    private final Printer printer;
    private boolean isAntInGrid;

    App(DimensionChecker dimensionChecker, int dimension) {
        this.dimension = dimension;
        this.printer = new Printer(dimension);
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

    private void printLine( int lineNumber) {
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

}
