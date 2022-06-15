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
            System.out.println("Van olyan szám! Task1 A szám: " + arr[i]);
        }
    }

    static boolean task2(int[] arr) {

        boolean helper = true;
        for (int i = 0; i < arr.length; i++) {
            helper = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % arr[i] != 0)
                    helper = false;
            }
            if(helper){
                System.out.println("Van olyan szám! Task2 A szám: " + arr[i]);
                return true;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 18, 4, 2, 8, 10 };
        task(arr);
        task2(arr);
    }
}
