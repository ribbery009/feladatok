//8. Írjon olyan függvényt vagy metódust, amely egy természetes szám esetén kiírja, hogy a 9-es
//számjegyből hány darabot tartalmaz(ne alakítsa át sztringgé/karaktertömbbé)!

class task8 {

    static int task(int n,int d) {
        int count = 0;
 
        while (n > 0)
        {
            count = (n % 10 == d) ? count + 1 : count;
            n = n / 10;
        }
     
        return count;
    }

    static int task2(int n) {
        int count = 0;
 
        while (n > 0)
        {
            if(n%10==9) 
            {count++;
            }
            n=n/10;
        }
     
        return count;
    }

    
    static int task3(int num) {
        int count = 0;
 
        while (num > 0)
        {
            if(num%10==9) 
            {count++;
            }
            num=num/10;
        }
     
        return count;
    }

    public static void main(String[] args) {
        int d = 9;
        int n = 929394556;
     
        System.out.println(task(n, d));

        System.out.println(task2(n));

        System.out.println(task3(n));


    }
}
