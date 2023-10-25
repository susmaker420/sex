import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Tamagochi t = new Tamagochi();
        options(t);
    }

    public static void options(Tamagochi t) {
        Scanner sex = new Scanner(System.in);
        System.out.println("1 för att mata");
        System.out.println("2 för att see states");
        System.out.println("3 för att säga randome words");
        System.out.println("4 för att lära den ett ord");
        int sex1 = sex.nextInt();
        switch (sex1) {
            case 1 -> {
                t.feed();
            }
            case 2 -> {
                t.printStats();
            }
            case 3 -> {
                t.hi();
            }
            case 4 -> {
                t.teach(sex.nextLine());
            }
            default -> options(t);

        }
    }


}
