//29.Írjon függvényt vagy metódust, mely valós típusú paraméterének azt a számjegyét adja
//vissza, amelyik a tizedes pont után áll! (a megoldás során ne használjon
//sztringeket/karaktertömböket)

class task29 {

    static int task(double num) {
        num = (num * 10);
        int newNum = (int) num % 10;
        return newNum;
    }

    public static void main(String[] args) {

        double num = 1.5;
        System.out.println(task(num));
    }
}
