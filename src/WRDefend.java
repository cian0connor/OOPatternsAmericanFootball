public class WRDefend implements  DefendBehavior {
    @Override
    public int defend(String name, int skill) {

        System.out.println(name + " can't defend!");
        return 0;

    }
}
