import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefTest {

    Player testDef = new Def();

    @Before
    public void init() {

        testDef.setName("Ed Reed");
        testDef.setSkill(90);
        testDef.setThrowBehavior(new DefThrow());
        testDef.setCatchBehavior(new DefCatch());
        testDef.setDefendBehavior(new DefDefend());
    }

    @org.junit.jupiter.api.Test
    void throwBall() {
        init();
        assertEquals(0,testDef.throwBall(testDef.getName(),testDef.getSkill()));
    }

    @org.junit.jupiter.api.Test
    void catchPass() {
        init();
        assertEquals(0,testDef.catchPass(testDef.getName(),testDef.getSkill()));
    }

    @org.junit.jupiter.api.Test
    void defendPass() {
        init();
        assertEquals(90,testDef.defendPass(testDef.getName(),testDef.getSkill()));
    }
}