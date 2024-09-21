
public class MainProgram {

    public static void main(String[] args) {

        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a.lessThan(b));
        System.out.println(a.lessThan(c));
        System.out.println(c.lessThan(b));

        Money d = new Money(10, 0);
        Money e = new Money(0, 380);
        Money f = d.minus(e);
        System.out.println(f);

    }
}
