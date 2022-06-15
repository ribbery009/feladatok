// irjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy 
// prímszám-e, vagy sem!

class task1 {

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;

        for (int i = 2; i < n;) {
            if (n % i == 0)
                return false;

            i++;
        }

        return true;
    }

    static boolean isPrime2(int n) {
        int counter = 0;
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++) {
            if (counter > 1) {
                return false;
            }

            if (n % i == 0) {
                counter = counter + 1;
            }
        }

        return true;
    }

    static boolean isPrime3(int n) {
        int counter = 0;
        if (n < 2)
            return false;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter = counter + 1;
            }
            if (counter > 2) {
                return false;
            }

          
        }

        return true;
    }

    public static void main(String args[]) {
        // if (isPrime(11))
        //     System.out.println(" true");
        // else
        //     System.out.println(" false");
        // if (isPrime(15))
        //     System.out.println(" true");
        // else
        //     System.out.println(" false");

        System.out.println(isPrime2(16));

        System.out.println(isPrime3(16));

    }

}