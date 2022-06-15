//17. Írjon olyan függvényt vagy metódust, amely kiírja az angol kisbetűs ábécé azon betűit,
//melyek ASCII kódja négyzetszám!

class task17 {

    static void task() {
        for (int i = 0; i <= 11; i++) {
            if ((char) (i * i) >= 'a' && (char) (i * i) <= 'z')
                System.out.println((char) (i * i));
        }
    }

    static void task2() {

        char start = 'a';
        char end = 'z';
        int startNum = (int) start;
        int endNum = (int) end;
        while (startNum <= endNum) {
            int count = 0;
            while ((count * count) <= startNum) {
                if (count * count == startNum) {
                    System.out.println("karakter, melynek kódja négyzetszám: " + start);
                }
                count++;
            }

            startNum=startNum+1;
            start = (char) startNum;
        }
    }

    public static void main(String[] args) {
        task();
        task2();
    }
}
