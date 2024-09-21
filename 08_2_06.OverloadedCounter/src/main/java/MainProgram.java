
public class MainProgram {

    public static void main(String[] args) {

        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        System.out.println(counter1);
        System.out.println(counter2);

        counter1.decrease();
        counter1.decrease(2);
        counter1.decrease(-4);
        counter2.increase();
        counter2.increase(2);
        counter2.increase(-1);

        System.out.println(counter1);
        System.out.println(counter2);

    }
}
