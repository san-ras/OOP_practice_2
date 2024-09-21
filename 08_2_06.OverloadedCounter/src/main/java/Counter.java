public class Counter {

    private int value;

    public Counter() {
        this.value = 0;
    }

    public Counter(int startValue) {
        this.value = startValue;
    }

    public int value() {
        return value;
    }

    public void increase() {
        value++;
    }

    public void decrease() {
        value--;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                '}';
    }
}
