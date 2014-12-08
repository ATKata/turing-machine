import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

public class TuringTapeTest {
    

    private TuringTape tape;

    @Before
    public void setUp() {
        tape = new TuringTape(TuringTape.DEFAULT_SYMBOL);
    }

    @Test
    public void checkGetCurrentSymbolReturnsDefault(){
    	assertEquals(TuringTape.DEFAULT_SYMBOL,tape.getCurrentSymbol());
    }
    
    @Test
    public void goLeftToUnitialisedLocation(){
    	tape.moveLeft();
    	assertEquals(TuringTape.DEFAULT_SYMBOL,tape.getCurrentSymbol());
    }
    
    @Test
    public void goRightToUnitialisedLocation(){
    	tape.moveRight();
    	assertEquals(TuringTape.DEFAULT_SYMBOL,tape.getCurrentSymbol());
    }
    
    @Test
   public void testWriteCharacterToTape() {
    	tape.setCurrentSymbol("1");
    	assertEquals("1",tape.getCurrentSymbol());
    }
    
    @Test
    public void testToStringOneDefaultCharacterInBrackets(){
    	assertEquals("[0]", tape.toString());
    }
}
