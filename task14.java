//14. Írjon olyan függvényt vagy metódust, amely egy, az angol ábécé betűit tartalmazó
//karakterláncban vagy sztringben minden szó kezdőbetűjét nagybetűre alakítja!

class task14 {

    static void task(String sentence) {

        int count = 0;
        String newSent = "";
        while (count < sentence.length()) {

            if (count > 0 && (int) sentence.charAt(count - 1) == 32 && (int) sentence.charAt(count) > 96
                    && (int) sentence.charAt(count) < 123) {
                newSent += (char) ((int) sentence.charAt(count) - 32);
            } else {
                newSent += (char) sentence.charAt(count);
            }

            count++;
        }
        sentence = newSent;
        System.out.println(newSent);
    }

    static void task2(char[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if ((char) arr[i] >= 'a' && (char) arr[i] <= 'z') {
                arr[i] = (char) ((int) arr[i] - 32);
            }
        }

        System.out.println(arr);
    }

    public static void main(String[] args) {
        char[] charArr = new char[]{'a','l','m','a'};


        task2(charArr);
        
    }
}
