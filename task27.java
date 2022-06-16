//27.Írjon függvényt vagy metódust, mely visszaadja két egész paramétere szorzatának balról
//második számjegyét! (a megoldás során ne használjon sztringeket/karaktertömböket)

class task27 {

    static int task(int first, int second) {
        boolean lower100 = false;
        int result = first * second;
        System.out.println("result: " + result);
        while (!lower100) {

            if ((result / 10) < 10) {
                lower100 = true;
            } else {
                result = result / 10;
            }
        }

        return result % 10;
    }

    static int task2(int first, int second) {
        int result = first * second;

        if (result > 99) {

            while (result >= 100) {
                result = result / 10;
            }
        }

        return result % 10;
    }

    public static void main(String[] args) {
        System.out.println(task(321, 123));
        System.out.println(task2(321, 123));

    }

}
