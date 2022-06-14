//6. Írjon függvényt vagy metódust, amely kiszámolja az n-edik Fibonacci számot! A Fibonacci
//sorozatot az an=an-2+an-1 rekurzióval definiálja(n>2), ahol a1 = a2 = 1.

class task6 {

    public static int task(int n) {
        System.out.println("n: "+n);
        if (n <= 2)
            return n;
        return task(n - 1) + task(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(task(8));
    }
}
