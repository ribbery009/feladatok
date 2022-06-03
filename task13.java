//13. Írjon olyan függvényt vagy metódust, amely egy karakterláncról vagy sztringről eldönti,
//hogy palindróma-e! (Balról olvasva ugyanaz, mint jobbról olvasva.)

class task13 {

    static boolean task(String word) {

        int firstC = 0;

        while (firstC < word.length()) {

            if (word.charAt(firstC) != word.charAt((word.length()- 1 - firstC))) {
                return false;
            }
            firstC++;
        }

        return true;
    }

    public static void main(String[] args) {

        if (task("asdfffsa")) {
            System.out.println("Palindroma!!");
        } else {
            System.out.println("Nem Palindroma!");
        }
    }
}
