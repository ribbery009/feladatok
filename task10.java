//10. Írjon olyan függvényt vagy metódust, amelynek paramétere egy 1 < x < 10 természetes
//szám, és kiírja az 1,3,4,6,7,9,10,12,... sorozat első öt x-szel osztható elemét, azaz a sorozat
//i+1-edik tagja 2-vel nagyobb az i-ediknél, ha i páratlan, s eggyel nagyobb az i-ediknél, ha i páros!

class task10 {

    public static void task(int x) {

        int count = 0;int sum =0;
        while (count < 5) {
     
            sum += (sum % 2 == 0 ? 1 : 2); 
            if(sum % x == 0){
                count ++;
                System.out.println(sum);
            }
        }


    }

    public static void main(String[] args) {
        task(3);
    }
}
