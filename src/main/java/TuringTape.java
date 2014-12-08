public class TuringTape {

	public static final String DEFAULT_SYMBOL = "0";

	private StringBuilder tape;
	private int index;

	public TuringTape(String initialTape) {
		tape = new StringBuilder(initialTape);
		index = 0;
	}

	public String getCurrentSymbol() {
		return "" + tape.charAt(index);
	}

	public void setCurrentSymbol(String symbol) {
		tape.replace(index, index + 1, symbol);
	}

	public void moveRight() {
		index++;
		if (index == tape.length()) {
			tape.append(DEFAULT_SYMBOL);
			index = tape.length() - 1;
		}
	}

	public void moveLeft() {
		index--;
		if (index < 0) {
			tape.insert(0, DEFAULT_SYMBOL);
			index = 0;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(tape);
		builder.replace(index, index + 1, "[" + tape.charAt(index) + "]");
		return builder.toString();
	}
}
