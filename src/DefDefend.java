public class DefDefend implements DefendBehavior {
    @Override
    public int defend(String name, int skill) {

        System.out.println(name + " goes for the interception!");
        return skill;

    }
}
