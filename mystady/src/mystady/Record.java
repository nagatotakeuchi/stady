package mystady;

import java.util.Arrays;

public class Record {
	private Object[] record;

	public Record(Object[] record) {
		this.record = record;
	}


	@Override
	public String toString() {
		StringBuilder n = new StringBuilder();
		Arrays.stream(record).forEach(r -> n.append(r + " "));
		return n.toString();
	}

}
