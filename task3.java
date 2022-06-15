// Írjon olyan függvényt vagy metódust, amely egy karakterláncban vagy sztringben 
// véletlenszerűen összekeveri a karaktereket (véletlenszám–generátor használható)!

import java.util.Random;

class characterMix {

    

    static void kever(char[] arr){
        Random rand = new Random();

        for(int i=0;i<arr.length;i++){
            int num = rand.nextInt(arr.length);
            char helper = arr[i];
            arr[i]=arr[num];
            arr[num]=helper;
        }

        System.out.println(arr);
    }
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

    
    char[] arr = {'a','v','b','g','h'};
    kever(arr);
    }
}
