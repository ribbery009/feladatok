//6. Írjon függvényt vagy metódust, amely kiszámolja az n-edik Fibonacci számot! A Fibonacci
//sorozatot az an=an-2+an-1 rekurzióval definiálja(n>2), ahol a1 = a2 = 1.

class task6 {

    public static int task(int n) {
        if (n <= 2)
            return n;
        return task(n - 2) + task(n - 1);
    }
}
