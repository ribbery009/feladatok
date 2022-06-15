//26.Adjon metódust vagy függvényt, ami a paraméterként kapott, egészekből álló rendezett
//tömbben a tömb hosszának logaritmusával arányos lépésszám alatt megkeresi a
//paraméterként kapott egész első előfordulásának indexét, illetve ha nincs ilyen, akkor -1-et
//ad vissza. (pl.a bináris keresés)

class task26 {

    static int task(int [] tomb,int szam) {

        int min = 0, max = tomb.length-1;
        while (min <= max)
        {
            int mid = min + (max - min) / 2;
            if (tomb[mid] == szam) return mid;
            if (tomb[mid] > szam) max = mid - 1;
            else min = mid + 1;
        }
        return -1;
    }

    static int task2(int [] tomb,int szam) {

        int min = 0, max = tomb.length-1;
        while (min <= max)
        {
            int mid =  (max + min) / 2;
            if (tomb[mid] == szam) return mid;
            if (tomb[mid] > szam) max --;
            else min++;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] tomb = new int[]{21,22,23,24,25,26,27,28,29,30};
        System.out.println(task(tomb,27));
        System.out.println(task2(tomb,27));
    }

}
