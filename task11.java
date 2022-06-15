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

    static int task2(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++)
            if (num % i == 0) {
                count++;
            }

        return count;
    }

    static int laciTask(int szam){
        int oszto = 2;
        for (int i = 2; i <= szam/2; i++)
        {
            if (szam % i == 0) oszto++;
        }
        return oszto;
    }

    public static void main(String[] args) {
        System.out.println(task(30));

        System.out.println(task2(30));

        System.out.println(laciTask(30));

    }
}