//7. Írjon olyan függvényt vagy metódust, amely egy természetes számhoz visszaadja azt a
//legnagyobb egész kitevős hatványát, amely még éppen kisebb, mint 567!

class task7 {

    static int task(int n) {

        if (n < 2) {
            return n;
        }
        int result = n;
        int counter = 0;

        while (result < 567) {
            counter++;
            result = result * n;
        }

        return counter;
    }

    public static void main(String[] args) {
        

        int num1 = task(8);

        System.out.println("num1: "+num1);


    }
}
