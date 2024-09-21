import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Duration: ");
            int duration = Integer.parseInt(scanner.nextLine());
            TelevisionProgram tvProgram = new TelevisionProgram(name, duration);
            programs.add(tvProgram);
        }
        System.out.println("Program's maximum duration?");
        int duration = Integer.parseInt(scanner.nextLine());

        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= duration) {
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes");
            }
        }
    }
}
