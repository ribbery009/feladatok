//24.Adjon olyan metódust vagy függvényt, ami visszaadja, hogy a paramétereként megadott
//(pozitív egészekből álló) nemüres tömbben melyik az a legkisebb index, amire az index
//előtti elemek összege meghaladja a tömb első két elemének szorzatát.Ha nincs ilyen, 0-t
//adjon vissza.

class task24 {

    static int task(int[] arr) {

        int szorzat = arr[0] * arr[1];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = +arr[i];
            if (sum > szorzat) {
                return i;
            }
        }

        return 0;
    }
}
