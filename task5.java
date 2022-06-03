//5. Írjon függvényt vagy metódust, amely egy valós szám köbgyökét adja vissza! Használja az
//xk+1=1/3*(2*xk+a/xk2) sorozatot, amely a köbgyökéhez konvergál, ha x1=1.

class Analize2 {
    static double task(double szam) {
        int n = 50;
        double[] x = new double[n + 1];
        x[1] = 1;
        for (int k = 1; k < n; k++)
            x[k + 1] = (2 * x[k] + (szam / (x[k] * x[k]))) / 3;
        return x[n];
    }

    public static void main(String[] args) {
        double newNum = task(9);
        System.out.println(newNum);
    }

}
