//9. Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy a kettes
//számrendszerbeli felírásában a jobbról második bitje 1 vagy 0 (ne alakítsa át sztringgé/karaktertömbbé)!

class task9 {

    public static int task(int szam)
    {
        return (szam / 2) % 2;
    }
public static void main(String[] args) {
    System.out.println(task(8));
}
}
