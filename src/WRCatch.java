public class WRCatch implements CatchBehavior{
    @Override
    public int catchBall(String name, int skill) {

        System.out.println(name + " goes for the catch!");
        return skill;

    }
}
