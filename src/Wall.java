public class Wall {
    private final int hight;

    @Override
    public String toString() {
        return Integer.toString(hight);
    }


    public Wall(int hight) {
        this.hight = hight;

    }

    public int getHight() {
        return hight;
    }
}
