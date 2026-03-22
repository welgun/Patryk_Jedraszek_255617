package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

	public static final int REJECTIONS = 0;
	int totalRejected = REJECTIONS;

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