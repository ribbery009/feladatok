//31.Írjon függvényt vagy metódust, mely a paraméterként kapott 10x10-es mátrixról eldönti,
//hogy van-e olyan eleme, mely sorában nagyobb és oszlopában pedig kisebb a többi elemnél!

class task31 {

    static boolean task(int[][] array) {

        boolean diff = false;
        int max = 0;
        int min = 0;

        int poiRow = 0;
        int poiCol = 0;

        boolean isTarget = false;

        for (int i = 0; i < 10; i++) {
            max = 0;
            min = 0;
            poiRow = 0;
            poiCol = 0;
            isTarget = true;


            //max keresés 
            for (int col = 0; col < 10; col++) {
                if (array[i][col] > max) {
                    max = array[i][col];
                    poiRow = col;
                    poiCol = i;
                }
            }

            min = array[i][poiRow];
            for (int row = 0; row < 10; row++) {

                //ha van kisebb elem az oszlopában, léptet
                if (array[row][poiRow] < min) {
                    isTarget = false;
                    break;
                }
            }


            if (isTarget) {
                 System.out.println("Row: " + poiRow);
                 System.out.println("Col: " + poiCol);

                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] arr = new int[][] {
                { 6, 12, 8, 9, 10, 19, 2, 3, 4, 5 },
                { 9, 3, 1, 1, 1, 1, 1, 1, 4, 2 },
                { 5, 4, 13, 4, 5, 19, 2, 3, 4, 5 },
                { 6, 7, 5, 14, 3, 19, 2, 3, 4, 5 },
                { 5, 4, 1, 1, 1, 1, 1, 1, 4, 5 },
                { 19, 4, 3, 4, 5, 19, 2, 3, 4, 5 },
                { 6, 4, 1, 1, 1, 1, 1, 1, 4, 5 },
                { 19, 4, 3, 4, 5, 19, 2, 3, 4, 5 },
                { 1, 2, 1, 1, 1, 1, 1, 1, 3, 2 },
                { 19, 4, 3, 4, 5, 19, 2, 3, 4, 5 }, };
        System.out.println(task(arr));
    }
}
