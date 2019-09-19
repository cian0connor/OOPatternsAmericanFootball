public class DefCatch implements CatchBehavior{
    @Override
    public int catchBall(String name, int skill) {

        System.out.println(name + " can't catch the ball!");
        return 0;

    }
}
