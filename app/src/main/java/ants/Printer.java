package ants;

public class Printer {
    private final int dimension;

    public Printer(int dimension) {
        this.dimension = dimension;
    }

    public void printBlankLine() {
        String line = getBlankGridLine();
        System.out.print(line);
    }

    public void printAntLine(int antLinePosition) {
        String antLine = getLineWithAnt(antLinePosition);
        System.out.print(antLine);
    }

    private String getLineWithAnt(int antLinePosition) {
        String line = getBlankGridLine();
        String antCharacter = "H";

        return line.substring(0, antLinePosition) + antCharacter + line.substring(antLinePosition + 1);
    }

    private String getBlankGridLine() {
        String blankGridCharacter = "B";
        return blankGridCharacter.repeat(dimension);
    }

    public void printLn() {
        System.out.println();
    }
}