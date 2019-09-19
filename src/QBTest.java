
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;



class QBTest {


    Player testQB = new QB();
    @Before
    public void init() {

        testQB.setName("Tom Brady");
        testQB.setSkill(90);
        testQB.setThrowBehavior(new QBThrow());
        testQB.setCatchBehavior(new QBCatch());
        testQB.setDefendBehavior(new QBDefend());
    }



    @org.junit.jupiter.api.Test
    void throwBall() {
        init();
        assertEquals(90,testQB.throwBall(testQB.getName(),testQB.getSkill()));
    }

    @org.junit.jupiter.api.Test
    void catchPass() {
        init();
        assertEquals(0,testQB.catchPass(testQB.getName(),testQB.getSkill()));
    }

    @org.junit.jupiter.api.Test
    void defendPass() {
        init();
        assertEquals(0,testQB.defendPass(testQB.getName(),testQB.getSkill()));
    }
}