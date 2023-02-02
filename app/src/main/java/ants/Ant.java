package ants;

public class Ant {
    public final int position;
    public boolean isAntInGrid = true;

    public Ant(int position) {
        this.position = position;
    }

    public static Ant noAnt() {
        Ant ant = new Ant(0);
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
