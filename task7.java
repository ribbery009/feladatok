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

        return result;
    }

    static int task2(int n) {

        if (n < 2) {
            return n;
        }
        int result = 0;
        int helper = n;
    
        do {
            result = n;
            n = n * helper;
        } while (n < 567);

        return result;
    }

    static int task3(int n) {

       
        int result = 0;
        int helper = n;
        int sum = n;
    
        do {
            result = sum;
            sum = sum * helper;
        } while (sum < 567);

        return result;
    }


    static int imiT(int num){
        int result = 1;
        while (result * num < 567) result *= num;
        return result;
    }

    public static int laciT(int szam)
    {
        if (szam == 0 || szam == 1) return szam;
        int hatvany = szam;
        while (hatvany * szam < 567) hatvany *= szam;
        return hatvany;
    }
    public static void main(String[] args) {

        System.out.println("num1: " + task(8));
        System.out.println("num2: " + task2(8));
        System.out.println("num3: " + task3(8));



        System.out.println("laci: " + laciT(8));
        System.out.println("imi: " + imiT(8));


    }
}
