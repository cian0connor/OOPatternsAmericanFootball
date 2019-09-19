public class WRThrow implements ThrowBehavior{
    @Override
    public int throwBall(String name, int skill) {

        System.out.println(name + " can't throw");
        return 0;

    }
}
