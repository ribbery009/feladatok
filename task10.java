//10. Írjon olyan függvényt vagy metódust, amelynek paramétere egy 1 < x < 10 természetes
//szám, és kiírja az 1,3,4,6,7,9,10,12,... sorozat első öt x-szel osztható elemét, azaz a sorozat
//i+1-edik tagja 2-vel nagyobb az i-ediknél, ha i páratlan, 
//s eggyel nagyobb az i-ediknél, ha i páros!

class task10 {

    public static void task(int x) {

        int count = 0;
        int sum = 1;
        int i=1;
        while (count < 5) {

            System.out.println("sorozat: " + sum);
            if (sum % x == 0) {
                count++;
                System.out.println(sum);
            }
            sum += (i % 2 == 0 ? 1 : 2);
            i++;
        }

    }

    public static void task2(int n) {

        int count = 0;
        int i=1;
        while (count < 5) {

            if (i % n == 0) {
                count=count+1;
                System.out.println("task2:"+i);
            }
            if(i%2==0){
                i=i+1;
            }else{
                i=i+2;
            }
        }

    }

    public static void task3(int x) {

        int count = 0;
        int sum = 1;
        int i=1;
        while (count < 5) {

           
            if (sum % x == 0) {
                count=count+1;
                System.out.println("task3: "+sum);
            }
            if(i%2==0){
                sum=sum+1;
            }else{
                sum=sum+2;
            }
            i++;
        }

    }
    public static void taskLaci(int szam) {
        int sor = 1, i = 1, db = 0;
        while (db < 5) {
            if (sor % szam == 0) {
                 System.out.println("sor laci: " + sor);
                db++;
            }
            sor += (i % 2 == 0 ? 1 : 2);
            // System.out.println("sor laci: " + sor);
            i++;
        }
    }

    static void taskImi(int x) {

        int count = 0;
        int num = 1;
        int i = 1;
        while (count < 5) {
            if (num % x == 0) {
                System.out.println("sorImi: "+num);
                count++;
            }
            num = i % 2 == 0 ? num + 1 : num + 2;
            // System.out.println("imi: " + num);
            i++;
        }

    }

    public static void main(String[] args) {
        // task(3);
        // task2(3);


        task3(3);
        taskLaci(3);
        taskImi(3);
    }
}
