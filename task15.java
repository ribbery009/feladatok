//15. Írjon olyan függvényt vagy metódust, amely egy karakterláncból vagy sztringből eltávolítja
//egy megadott karakter összes előfordulását!
class task15 {

    static void task(String word, char target) {

        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target) {
                newWord += word.charAt(i);
            }
        }
        word = newWord;
        System.out.println("szó: "+word);
    }

    
    static void task2(String word, char target) {

        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != target) {
                newWord += word.charAt(i);
            }
        }
        word = newWord;
        System.out.println("szó: "+word);
    }

    public static void main(String[] args) {
        task("kakas", 'a');
        task2("kakas", 'a');
    }
}
