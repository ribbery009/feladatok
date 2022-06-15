//12. Írjon olyan függvényt vagy metódust, amely egy karakterláncból vagy sztringből a
//számjegyek kivételével minden karaktert eltávolít!

class task12 {

    static void task(String word) {

        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            System.out.println((int) word.charAt(i));
            if ((int) word.charAt(i) > 47 && (int) word.charAt(i) < 58) {
                newWord = newWord + word.charAt(i);
            }
        }
    }

    static void task2(String word) {

        String newWord = "";
        for (int i = 0; i < word.length(); i++) {

            if ((char) word.charAt(i) >= '0' && (char) word.charAt(i) <= '9') {
                newWord = newWord + word.charAt(i);
            }
        }
        word = newWord;

        System.out.println("new: "+newWord);
    }

    public static void main(String[] args) {
        // task("asd23kjf34kj3");
        String szo = "asd23kjf34kj3";
        task2(szo);
        System.out.println(szo);
    }
}
