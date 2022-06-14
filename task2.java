// Írjon olyan függvényt vagy metódust, amely egy természetes számról eldönti, hogy tökéletes 
// szám-e, vagy sem! (pozitív osztóinak összege a szám kétszerese

class isPerfectNumber {

    static boolean origiSolution(int n) {
        int i = 1;
        int sum = 0;
        while (i <= n / 2) {
            if (n % i == 0) {
                sum = sum + i;
            }
            i++;
        }
        if (sum == n) {
            return true;
        } else
            return false;
    }

    static boolean lastSolution(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        if (sum == (n * 2)) {
            return true;
        }

        return false;
    }

    public static void main(String args[]) {
        int n = 6;
        // origiSolution(n);

        System.out.println(origiSolution(n));

        System.out.println(lastSolution(n));
    }
}