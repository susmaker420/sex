import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tamagochi {
    Scanner sex = new Scanner(System.in);

    //attribute
    private int hunger = 0;
    private int boredom = 0;


    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive = true;
    private Random generator = new Random();
    public String name;

    boolean s = getAlive();

    //constructor
    public Tamagochi() {
        System.out.println("vad kommer din tamagochi heta");
        this.name = sex.nextLine();
        System.out.println("din Tamagochi heter" + name);

    }

    //methods
    public void feed() {
        hunger -= 10;
        if (hunger < 0) {
            hunger = 0;
        }
    }


    public void hi() {
        setWords();

    }

    public void teach(String word) {
        String newstuff = sex.nextLine();
        System.out.println("tamagucci learned " + newstuff);
        reduceBoredom();
    }

    public void tick() {
        hunger++;
        boredom++;
        if (hunger == 10 || boredom == 10) {
            this.isAlive = false;
            getAlive();
        }
    }

    public void printStats() {
        System.out.println("status för boredome" + boredom);
        System.out.println("status för hunger" + hunger);
    }

    public boolean getAlive() {
        return isAlive;
    }

    private void reduceBoredom() {
        boredom -= 10;
        if (boredom < 0) {
            boredom = 0;

        }
    }

    public ArrayList<String> getWords() {
        return words;
    }

    public void setWords() {
        words.add("balls");
        words.add("guccy");
        words.add("nuggets");

    }
}

