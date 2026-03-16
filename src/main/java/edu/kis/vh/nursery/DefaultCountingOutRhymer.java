package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int[] NUMBERS = new int[12];
    public final int CHECK_RESULT = -1;
    public final int FULL_RESULT = 11;

    public int total = CHECK_RESULT;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == CHECK_RESULT;
    }

    public boolean isFull() {
        return total == FULL_RESULT;
    }

    protected int peekaboo() {
        if (callCheck())
            return CHECK_RESULT;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return CHECK_RESULT;
        return NUMBERS[total--];
    }

}
