//23.Adjon olyan metódust vagy függvényt, ami visszaadja, hogy a paramétereként megadott
//(pozitív egészekből álló) nemüres tömbben melyik index az, ahol a leghosszabb
//folyamatosan növekvő részsorozat kezdődik.Ha több ilyen index is van, az utolsót adja
//vissza.

class task23 {

    static int task(int[] arr) {
        boolean helper = false;
        int counter = 0;
        int pointer = 0;
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i + 1] > arr[i]) {
                counter++;
            } else {
                
                if (counter >= max) {
                    max = counter;
                    pointer = i;
                }
                counter = 0;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 1, 2, 5, 6, 7,1,2,3,4,5,6,7,8 };
        System.out.println(task(arr));
    }
}
