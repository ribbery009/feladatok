//20.Adjon olyan függvényt vagy metódust, ami adott két pozitív egész paramétere esetén
//megadja(n alatt a k)=n!/k!(n-k)! értékét.Használjon rekurziót!

class task20 {

    static int task(int n, int k) {
        if (n == k || k == 0) return 1;
        return task(n - 1, k - 1) + task(n - 1, k);
    }
}
