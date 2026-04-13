package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	private static final int REJECTIONS = 0;
	private int totalRejected = REJECTIONS;

	public int reportRejected() {
		return totalRejected;
	}

    @Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}