//21.Adjon olyan metódust vagy függvényt, ami eldönti, hogy a paramétereként megadott
//(pozitív egészekből álló) nemüres tömbben van-e olyan szám, ami az összes többit osztja.
//(Maradékszámító függvény használható).

class task21 {

    static void task(int[] arr) {

        boolean helper = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % arr[i] != 0)
                    helper = true;
            }
            if(!helper)
            System.out.println("Van olyan szám! A szám: " + arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 2, 4, 6, 8, 10 };
        task(arr);
    }
}
