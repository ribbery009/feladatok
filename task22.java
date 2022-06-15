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

    static boolean task2(int[] arr) {

        int max = 0;
        boolean isHigher = false;
        int count = 0;
        int num = 0;

        for (int i = 0; i < arr.length; i++) {

            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == max && num !=arr[i]) {
                System.out.println("arri: " + arr[i]);
                isHigher = false;
            }
            if (count > max) {
                num = arr[i];
                isHigher = true;
                max = count;
            }
        }

        return isHigher;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 1, 4, 0 };

        System.out.println(task(arr));
        System.out.println(task2(arr));

    }
}
