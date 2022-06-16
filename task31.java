//31.Írjon függvényt vagy metódust, mely a paraméterként kapott 10x10-es mátrixról eldönti,
//hogy van-e olyan eleme, mely sorában nagyobb és oszlopában pedig kisebb a többi elemnél!

class task31 {

    static boolean task(int[][] array) {

        boolean diff = false;
        int max = 0;
        int min = 0;

        int poix = 0;
        int poij = 0;

        boolean isTarget = false;

        for (int i = 0; i < 10; i++) {
            max = 0;
            min = 0;
            poix = 0;
            poij = 0;
            isTarget = true;


            //max keresés 
            for (int j = 0; j < 10; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    poix = j;
                    poij = i;
                }
            }

            min = array[i][poix];
            for (int x = 0; x < 10; x++) {

                //ha van kisebb elem az oszlopában, léptet
                if (array[x][poix] < min) {
                    isTarget = false;
                    break;
                }
            }


            if (isTarget) {
                 System.out.println("x: " + poix);
                 System.out.println("j: " + poij);

                return true;

            }
        }
        return false;
    }

    static boolean task2(int[][] array) {

        boolean diff = false;
        int max = 0;
        int min =0;

        int maxIndex = 0;

   

        for (int i = 0; i < 10; i++) {
            max = 0;
            

            for (int j = 0; j < 10; j++) {
                if (array[i][j] == max) {
                    diff = false;
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                    min = array[i][j];
                    maxIndex = j;
                    diff = true;
                }
            }

            for (int x = 0; x < 10; x++) {

                if (array[x][max] <= min && i !=x ) {
                    diff = false;
                }
            }


            if (diff) {

                System.out.println("x: " + i);
                System.out.println("j: " + max);
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] arr = new int[][] {
                { 1,1,2,1,1,1,1,1,1,1 },
                { 1,1,3,1,1,1,3,1,1,1 },
                { 1,1,3,1,1,1,1,1,1,1 },
                { 1,1,3,1,1,1,1,1,1,1 },
                { 1,1,3,1,1,1,1,1,1,1 },
                { 1,1,3,1,1,1,1,1,1,1 },
                { 1,1,3,1,1,1,1,1,1,1 },
                { 1,1,3,1,1,1,1,1,1,1 },
                { 1,1,3,1,1,1,1,1,1,1 },
                { 1,1,3,1,1,1,1,1,1,1 }};
        System.out.println(task(arr));
        System.out.println(task2(arr));

    }
}
