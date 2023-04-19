package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private int[] numbers = new int[12];

	private int total = -1;

	public int getTotal() {
		return total;
	}

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean isEmpty() {
		return total == -1;
	}

	public boolean isFull() {
		return total == 11;
	}

	protected int peekaboo() {
		if (isEmpty())
			return -1;
		return numbers[total];
	}

	public int countOut() {
		if (isEmpty())
			return -1;
		return numbers[total--];
	}

	private int[] getNumbers() {
		return numbers;
	}

	private void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

}
