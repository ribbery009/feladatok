// A következő közelítő formulát használva írjon függvényt vagy metódust, amely egy valós 
// szám négyzetgyökét adja vissza! Használja az xk+1=1/2*(xk+a/xk) sorozatot, amely a
// négyzetgyökéhez konvergál, ha x1=1.

class Analize1 {

    static double An1(double szam) {
        int n = 50;
        double[] x = new double[n + 1];
        x[1] = 1;
        for (int k = 1; k < n; k++) {
            x[k + 1] = (x[k] + (szam / x[k])) / 2;
        }
        return x[n];
    }

    public static void main(String[] args) {
        double newNum = An1(4);
        System.out.println(newNum);
    }
}
