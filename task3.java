// Írjon olyan függvényt vagy metódust, amely egy karakterláncban vagy sztringben 
// véletlenszerűen összekeveri a karaktereket (véletlenszám–generátor használható)!

import java.util.Random;

class characterMix {
    public static void main(String args[]){
    Random rand = new Random();
    char[] newText = {'a','v','b','g','h'};
    for(int i = 0;i<newText.length;i++)
    {
        int j = rand.nextInt(newText.length);
        char helper = newText[i];
        newText[i] = newText[j];
        newText[j] = helper;
    }
   
    System.out.println(newText);

    

    }
}
