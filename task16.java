
//16. Írjon olyan függvényt vagy metódust, amely megszámolja egy adott karakterlánc vagy
//sztring összes előfordulását egy másik karakterláncban vagy sztringben!
class task16 {

    static void task(String szo) {
        String str = "hello  alma yes alma hello alma az alma.";

        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {

            lastIndex = str.indexOf(szo, lastIndex);
            System.out.println("lastIndex:"+lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += szo.length();
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        task("alma");
    }
}
