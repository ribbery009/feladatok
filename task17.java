//17. Írjon olyan függvényt vagy metódust, amely kiírja az angol kisbetűs ábécé azon betűit,
//melyek ASCII kódja négyzetszám!

class task17 {

    static void task(){
        for(int i=0;i<=11;i++){
            if ((char)(i * i) >= 'a' && (char)(i * i) <= 'z') 
            System.out.println((char)(i * i));
        }
    }

    public static void main(String[] args) {
        task();
    }
}
