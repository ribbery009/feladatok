//30.Írjon függvényt vagy metódust, mely pozitív egész paraméterét fordítva adja vissza, pl.
//fordit(234) eredménye 432! (a megoldás során ne használjon sztringeket/karaktertömböket)

class task30 {

    static int task(int num) {

        int newNum = 0;
        while (num > 0) {
            newNum = newNum * 10;
            newNum = newNum + (num % 10);
            num = num / 10;
        }
        return newNum;
    }

    public static void main(String[] args) {

        System.out.println(task(4567));

    }
}
