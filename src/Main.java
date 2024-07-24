import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the first note");
        int n1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Please, enter the second note");
        int n2 = Integer.parseInt(scanner.nextLine());

        System.out.println("Please, enter the third note");
        int n3 = Integer.parseInt(scanner.nextLine());

        System.out.println("Please, enter the fourth note");
        int n4 = Integer.parseInt(scanner.nextLine());
        scanner.close();


        int average = calculatingAverage(n1, n2, n3, n4);
        System.out.println("The final average is: " + average);
    }


    public static int calculatingAverage(int n1, int n2, int n3, int n4) {
        return (n1 + n2 + n3 + n4) / 4;
    }
}
