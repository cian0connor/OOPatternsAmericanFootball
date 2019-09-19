
public class Driver {
    public static void main(String[] args) {
        Player qb1 = new QB();
        qb1.setName("Tom Brady");
        qb1.setSkill(90);
        qb1.setThrowBehavior(new QBThrow());
        qb1.setCatchBehavior(new QBCatch());
        qb1.setDefendBehavior(new QBDefend());

        Player wr1 = new Receiver();
        wr1.setName("Jerry Rice");
        wr1.setSkill(90);
        wr1.setThrowBehavior(new WRThrow());
        wr1.setCatchBehavior(new WRCatch());
        wr1.setDefendBehavior(new WRDefend());

        Player def1 = new Def();
        def1.setName("Ed Reed");
        def1.setSkill(0);
        def1.setThrowBehavior(new DefThrow());
        def1.setCatchBehavior(new DefCatch());
        def1.setDefendBehavior(new DefDefend());


       qb1.playGame(qb1.throwBall(qb1.getName(),qb1.getSkill()), wr1.catchPass(wr1.getName(),wr1.getSkill()), def1.defendPass(def1.getName(),def1.getSkill()));


    }
}