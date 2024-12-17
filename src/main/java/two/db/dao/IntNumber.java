package two.db.dao;

public class IntNumber {
    private int value;

    public IntNumber(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value+"";
    }
}
