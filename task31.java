//31.Írjon függvényt vagy metódust, mely a paraméterként kapott 10x10-es mátrixról eldönti,
//hogy van-e olyan eleme, mely sorában nagyobb és oszlopában pedig kisebb a többi elemnél!

class task31 {

    static void feladat(int[][] array) {

        boolean diff = false;
        int max = 0;
        int poiRow = 0;
        int poiCol = 0;

        boolean isLargrestRow = true;
        boolean isSmallestCol = true;

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {

                for (int j2 = 0; j2 < array.length; j2++) {
                    //  if(array[j][i] > array[j][i] || )
                }
            }
        }

  

   
    }

    public static void main(String[] args) {

        int[][] arr = new int[][] {
                { 19, 2, 3, 4, 5, 19, 2, 3, 4, 5 },
                { 6, 12, 8, 9, 10, 19, 2, 3, 4, 5 },
                { 5, 2, 13, 4, 5, 19, 2, 3, 4, 5 },
                { 6, 7, 5, 14, 3, 19, 2, 3, 4, 5 },
                { 6, 7, 5, 4, 15, 19, 2, 3, 4, 5 } };
        feladat(arr);
    }
}
