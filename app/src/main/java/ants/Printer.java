package ants;

public class Printer {


    public void print(Grid grid, Ant ant) {
        for (int i = 0; i < grid.dimension - 1; i++) {
            printLine(grid, ant, i);
            this.printLn();
        }
        printLine(grid, ant, grid.dimension);
    }

    private void printLine(Grid grid, Ant ant, int lineNumber) {
        boolean isAntLine = isAntLocatedInThisLine(ant, lineNumber);

        if (isAntLine) {
            this.printAntLine(grid, ant.position);
        } else {
            this.printBlankLine(grid);
        }
    }

    private boolean isAntLocatedInThisLine(Ant ant, int lineNumber) {
        int antLineNumber = ant.position;

        return lineNumber == antLineNumber && ant.isAntInGrid;
    }

    public void printBlankLine(Grid grid) {
        String line = getBlankGridLine(grid);
        System.out.print(line);
    }

    public void printAntLine(Grid grid, int antLinePosition) {
        String antLine = getLineWithAnt(grid, antLinePosition);
        System.out.print(antLine);
    }

    private String getLineWithAnt(Grid grid, int antLinePosition) {
        String line = getBlankGridLine(grid);
        String antCharacter = "H";

        return line.substring(0, antLinePosition) + antCharacter + line.substring(antLinePosition + 1);
    }

    private String getBlankGridLine(Grid grid) {
        String blankGridCharacter = "B";
        return blankGridCharacter.repeat(grid.dimension);
    }

    public void printLn() {
        System.out.println();
    }


}