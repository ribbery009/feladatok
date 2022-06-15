//25.Adjon egy metódust vagy függvényt, ami paraméterként adott s sztring/karaktertömb, c
//karakter és n pozitív egész szám esetén megadja, hogy a c karakter n-edik előfordulása
//hányadik pozíción van az „s” sztringben.

class task25 {

    static int task(String s, char c, int n) {

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                counter++;
                if (counter == n)
                    return i;
            }
        }
        return -1;
    }

    static int task2(String s, char c, int n) {

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                counter++;
            }
            if (counter == n)
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(task("almamater", 'a', 3));
        System.out.println(task2("almamater", 'a', 3));

    }
}
