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
        String word="";
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

        System.out.println("word: "+word);
    }

    public static void main(String[] args) {
        task();
    }
}
