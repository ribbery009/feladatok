//28.Írjon függvényt vagy metódust, mely eldönti, hogy a paraméterként kapott 5x5-ös
//karakterekből álló/ tömbben a főátlóban van-e olyan elem, mely a főátlón kívül is
//megjelenik a tömbben!

class task28 {

    static boolean task(char[][] arr) {

        for (int k = 0; k < arr.length; k++) {

            for (int i = 0; i < arr.length; i++) {

                for (int j = 0; j < arr.length; j++) {
                    if ((int)arr[k][k] == (int)arr[i][j] && j != i) {
                        return true;
                    }
                }
            }

        }

        return false;
    }

    public static void main(String[] args) {
        char[][] arr = new char[][] { 
                { 19, 2, 3, 4, 5 },
                { 6, 12, 8, 9, 10 },
                { 5, 2, 13, 4, 5 },
                { 6, 7, 5, 14, 3 },
                { 6, 7, 5, 4, 15 } };
        System.out.println(task(arr));
    }
}
