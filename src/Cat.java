public class Cat implements actions {
    private final int hightMaxJump;
    private final int maxDistance;


    public Cat(int hightMaxJump, int maxDistance) {
        this.hightMaxJump = hightMaxJump;
        this.maxDistance = maxDistance;
    }
    public void jump(int jump) {
        if (jump > hightMaxJump)
            System.out.println("cat could not able to jump");
        else System.out.println("cat was able to jump");
    }

    public void run(int distance) {
        if (distance > maxDistance)
            System.out.println("cat could not able to run");
        else System.out.println("cat was able to run");
    }
}
