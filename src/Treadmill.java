public class Treadmill {
    private final int distance;

    @Override
    public String toString() {
        return Integer.toString(distance);
    }

    public Treadmill(int distance) {
        this.distance = distance;

    }

    public int getDistance() {
        return distance;
    }
}
