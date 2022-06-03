//11. Írjon olyan függvényt vagy metódust, amely a paraméterében megadott természetes szám
//pozitív osztóinak számával tér vissza!

class task11 {

    static int task(int num) {

        int count = 0;

        for (int i = 1; i < num; i++)
            if (num % i == 0) {
                count++;
            }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(task(30));
    }
}