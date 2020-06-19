public class Robot implements actions{
    private final int hightMaxJump;
    private final int maxDistance;


    public Robot(int hightMaxJump, int maxDistance) {
        this.hightMaxJump = hightMaxJump;
        this.maxDistance = maxDistance;
    }
    public void jump(int jump) {
        if (jump > hightMaxJump)
            System.out.println("robot could not able to jump");
        else System.out.println("robot was able to jump");
    }

    public void run(int distance) {
        if (distance > maxDistance)
            System.out.println("robot could not able to run");
        else System.out.println("robot was able to run");
    }
}
