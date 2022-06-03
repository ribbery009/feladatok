//22.Adjon olyan metódust vagy függvényt, ami eldönti, hogy a paramétereként megadott
//(pozitív egészekből álló) nemüres tömbben van-e olyan szám, ami az összes többinél
//többször fordul elő.

class task22 {

    static boolean task(int[] arr) {

        int counter = 0;
        int maxValue = 0;
        int minValue = 1;

        int[] maxNum = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }

            if (counter > maxValue) {
                maxValue = counter;
            }
            if (counter < minValue) {
                minValue = counter;
            }
            if (i == 0)
                minValue = counter;
        }

        if (minValue != maxValue) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 3, 4, 4 };

        System.out.println(task(arr));
    }
}
