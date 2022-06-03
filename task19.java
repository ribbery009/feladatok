import java.util.Random;

//19.Írjon olyan függvényt vagy metódust, amely egy karakterláncba vagy sztringbe beszúr egy
//„a” karaktert véletlenül választott pozícióba(véletlenszám–generátor használható)!

class task19 {
    

static void task(){
Random rand = new Random();
String string = "hello";
int randNum = rand.nextInt(string.length());
StringBuilder sb = new StringBuilder(string);
sb.insert(randNum, 'a');
string = sb.toString();
System.out.println(string);
}

public static void main(String[] args) {
    task();
}
}
