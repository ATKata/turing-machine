import com.google.common.base.Joiner;

import java.util.ArrayDeque;
import java.util.Deque;

public class TuringTape {
    private class InfiniteSpool {
        private final Deque<String> spool = new ArrayDeque<String>();

        public void put(String symbol) {
            spool.push(symbol);
        }

        public String get() {
            if (!spool.isEmpty()) {
                return spool.pop();
            }
            return defaultSymbol;
        }

        @Override
        public String toString() {
            return Joiner.on(' ').join(spool);
        }
    }

    private final String defaultSymbol;

    private final InfiniteSpool leftSpool = new InfiniteSpool();
    private String currentSymbol;
    private final InfiniteSpool rightSpool = new InfiniteSpool();

    public TuringTape(String defaultSymbol) {
        this.defaultSymbol = defaultSymbol;
        currentSymbol = defaultSymbol;
    }

    public String getCurrentSymbol() {
        return currentSymbol;
    }

    public void setCurrentSymbol(String symbol) {
        this.currentSymbol = symbol;
    }

    public void moveRight() {
        leftSpool.put(currentSymbol);
        currentSymbol = rightSpool.get();
    }

    public void moveLeft() {
        rightSpool.put(currentSymbol);
        currentSymbol = leftSpool.get();
    }
    
    @Override
    public String toString() {
        return (leftSpool.toString() + " [" + currentSymbol + "] " + rightSpool).trim();
    }
}
