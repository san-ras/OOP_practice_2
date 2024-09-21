
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println(date);

        date.advance();
        System.out.println(date);

        date.advance(20);
        System.out.println(date);

        SimpleDate newDate = date.afterNumberOfDays(7);
        System.out.println("New date - " + newDate);
        System.out.println("Old date - " + date);

    }
}
