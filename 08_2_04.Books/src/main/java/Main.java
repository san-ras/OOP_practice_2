import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.parseInt(scanner.nextLine());
            System.out.println("Publication Year: ");
            int publicationYear = Integer.parseInt(scanner.nextLine());
            Book book = new Book(pages, title, publicationYear);
            books.add(book);
        }
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();

        for (Book book : books) {
            if (input.equals("name")) {
                System.out.println(book.getTitle());
            } else if (input.equals("everything")) {
                System.out.println(book.toString());
            }
        }
    }
}
