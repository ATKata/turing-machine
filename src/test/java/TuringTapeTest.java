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


}
