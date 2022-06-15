import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//18. Írjon olyan függvényt vagy metódust, amely előállít egy 5 karakterből (angol kisbetűs ábécé
//karaktereit használva) álló véletlen karakterláncot vagy sztringet! Biztosítsa, hogy minden 5
//hosszú különböző betűkből álló sztring egyenlő valószínűséggel kerüljön kiválasztásra,
//feltéve, hogy a választott programozási nyelv véletlenszám-generátora egyenletes eloszlást
//biztosít!

class task18 {

    static void task() {
        Random rand = new Random();
        String word = "";
        ArrayList<Character> chars = new ArrayList<Character>();

        chars.add('a');
        chars.add('b');
        chars.add('c');
        chars.add('d');
        chars.add('e');
        chars.add('f');
        chars.add('g');
        chars.add('h');
        chars.add('i');
        chars.add('j');
        chars.add('k');
        chars.add('l');

        for (int i = 0; i < 5; i++) {
            int int_random = rand.nextInt(chars.size());
            word += chars.get(int_random);
            chars.remove(int_random);
        }

        System.out.println("word: " + word);
    }

    static void task2() {
        Random rand = new Random();
   
        ArrayList<Character> chars = new ArrayList<Character>();

        char start = 'a';
        char end = 'z';
        int startNum = (int) start;
        int endNum = (int) end;

        for (int i = startNum; i <= endNum; i++) {
            chars.add(start);
            startNum = startNum + 1;
            start = (char) startNum;
        }

        int n = 0;
        String newWord = "";

        while (n < 5) {
            int randNum = rand.nextInt(chars.size());
            newWord = newWord + chars.get(randNum);
            chars.remove(randNum);
            n++;
        }

        System.out.println("word: " + newWord);
    }

    public static void main(String[] args) {
        task();
        task2();
    }
}
