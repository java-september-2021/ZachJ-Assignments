import java.util.ArrayList;
import java.util.Random;

public class Puzzle {
    static Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        int i=0;
        for(i=0; i<10; i++) {
            int num = randMachine.nextInt();
            tenRolls.add(num);
        }
        return tenRolls;
    }

    public static ArrayList<Character> makeLetterArray() {
        ArrayList<Character> letterPool = new ArrayList<Character>();
        char letter = 'a';
        for (letter = 'a'; letter <= 'z'; letter++) {
            letterPool.add(letter);
        }
        return letterPool;
    }

    public static char getLetter() {
        ArrayList<Character> letterPool= new ArrayList<Character>();
        int rando = randMachine.nextInt();//?
        char character = letterPool.get(rando);
        System.out.println(character);
        return character;
    }

    public static ArrayList<Character> generatePassword() {
        ArrayList<Character> password = new ArrayList<Character>();
        int k;
        for(k=0; k <8; k++) {
            Character word= getLetter();
            password.add(word);
        }
        System.out.println(password);
        return password;       
    }

    public static void generatePasswordSet(int n) {
        int l;
        ArrayList<String> passSet = new ArrayList<String>();
        for(l = 0; l < n; l++) {
            generatePassword();
            passSet.add("");
        }
        System.out.println(passSet);
    }
}
