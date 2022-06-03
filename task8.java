//8. Írjon olyan függvényt vagy metódust, amely egy természetes szám esetén kiírja, hogy a 9-es
//számjegyből hány darabot tartalmaz(ne alakítsa át sztringgé/karaktertömbbé)!

class task8 {

    static int task(int n,int d) {
        int count = 0;
 
        while (n > 0)
        {
            count = (n % 10 == d) ? count + 1 : count;
            n = n / 10;
        }
     
        return count;
    }

    public static void main(String[] args) {
        int d = 9;
        int n = 929394556;
     
        System.out.println(task(n, d));
    }
}
