package ants;

public class Ant {
    public final Position position;
    public boolean isAntInGrid = true;

    public Ant(Position position) {
        this.position = position;
    }

    public static Ant noAnt() {
        Ant ant = new Ant(Position.of(0));
        ant.isAntInGrid = false;
        return ant;
    }


    public void moveRight() {
        throw new UnsupportedOperationException();
    }

    public void moveLeft() {
        throw new UnsupportedOperationException();
    }
}
