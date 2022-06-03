//12. Írjon olyan függvényt vagy metódust, amely egy karakterláncból vagy sztringből a
//számjegyek kivételével minden karaktert eltávolít!

class task12 {

    static void task(String word) {

        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            System.out.println((int)word.charAt(i));
            if ((int) word.charAt(i) > 47 && (int) word.charAt(i) < 58) {
                newWord = newWord + word.charAt(i);
            }
        }
    }

    public static void main(String[] args) {
        task("asd23kjf34kj3");
    }
}
