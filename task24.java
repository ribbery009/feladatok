//24.Adjon olyan metódust vagy függvényt, ami visszaadja, hogy a paramétereként megadott
//(pozitív egészekből álló) nemüres tömbben melyik az a legkisebb index, amire az index
//előtti elemek összege meghaladja a tömb első két elemének szorzatát.Ha nincs ilyen, 0-t
//adjon vissza.

class task24 {

    static int task(int[] arr) {

        int szorzat = arr[0] * arr[1];
        int sum = 0;


        System.out.println("szorzat: "+szorzat);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("sum: "+sum);
            
            if (sum > szorzat) {
                return i;
            }
            sum +=arr[i];
        }

        return 0;
    }

    static int imiTask(int [] x){
        int x0x1 = x[0] * x[1];
        int ind = 0;
        for (int i = 2;  i < x.length; i++) {
            int sum = 0;
            for (int j = 0; j < i; j++) {
                sum += x[j];
            }
            if (sum<=x0x1) continue;
            ind = i;
            break;
        }
        return ind;
    }

    static int laciTask(int [] tomb){
        int osszeg = 0;
        int szorzat = tomb[0] * tomb[1];
        for (int i = 0; i < tomb.length; i++)
        {
            if (osszeg > szorzat) return i;
            osszeg += tomb[i];
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = new int[] {5, 4, 6, 9, 15 };
        System.out.println(task(arr));
        System.out.println(imiTask(arr));
        System.out.println(laciTask(arr));

    }
}
