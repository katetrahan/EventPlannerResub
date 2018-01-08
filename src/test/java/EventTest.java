import models.Event;
import org.junit.*;
import static org.junit.Assert.*;



public class EventTest {

    @Test
    public void newEvent_instantiatesCorrectly() throws Exception{
        Event testEvent = new Event();
        assertTrue(testEvent instanceof Event);
    }
}
