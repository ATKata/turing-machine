import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class TuringTapeTest {
    private static final String DEFAULT_SYMBOL = "0";

    private TuringTape tape;

    @Before
    public void setUp() {
        tape = new TuringTape(DEFAULT_SYMBOL);
    }

    @Test
    public void shouldInitiallyOnlyContainDefaultSymbol() {
        assertThat(tape.getCurrentSymbol(), equalTo(DEFAULT_SYMBOL));
    }

    @Test
    public void shouldBeAbleToSetCurrentSymbol() {
        tape.setCurrentSymbol("1");
        assertThat(tape.getCurrentSymbol(), equalTo("1"));
    }

    @Test
    public void shouldBeAbleToMoveRightToDefaultSymbol() {
        tape.setCurrentSymbol("1");
        tape.moveRight();
        assertThat(tape.getCurrentSymbol(), equalTo(DEFAULT_SYMBOL));
    }

    @Test
    public void shouldBeAbleToMoveLeftToPreviouslySetSymbol() {
        tape.setCurrentSymbol("1");
        tape.moveRight();
        tape.moveLeft();
        assertThat(tape.getCurrentSymbol(), equalTo("1"));
    }

    @Test
    public void shouldBeAbleToMoveLeftToDefaultSymbol() {
        tape.setCurrentSymbol("1");
        tape.moveLeft();
        assertThat(tape.getCurrentSymbol(), equalTo(DEFAULT_SYMBOL));
    }

    @Test
    public void shouldBeAbleToMoveRightToPreviouslySetSymbol() {
        tape.setCurrentSymbol("1");
        tape.moveLeft();
        tape.moveRight();
        assertThat(tape.getCurrentSymbol(), equalTo("1"));
    }
}
