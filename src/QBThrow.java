public class QBThrow implements ThrowBehavior {
    @Override
    public int throwBall(String name, int skill) {

            System.out.println(name + " throws the ball");
            return skill;

    }

}
