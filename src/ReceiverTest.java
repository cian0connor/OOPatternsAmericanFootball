import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;

class ReceiverTest {

    Player testWR = new Receiver();
    @Before
    public void init() {

        testWR.setName("Jerry Rice");
        testWR.setSkill(90);
        testWR.setThrowBehavior(new WRThrow());
        testWR.setCatchBehavior(new WRCatch());
        testWR.setDefendBehavior(new WRDefend());
    }




    @org.junit.jupiter.api.Test
    void throwBall() {
        init();
        assertEquals(0,testWR.throwBall(testWR.getName(),testWR.getSkill()));
    }

    @org.junit.jupiter.api.Test
    void catchPass() {
        init();
        assertEquals(90,testWR.catchPass(testWR.getName(),testWR.getSkill()));
    }

    @org.junit.jupiter.api.Test
    void defendPass() {
        init();
        assertEquals(0,testWR.defendPass(testWR.getName(),testWR.getSkill()));
    }
}