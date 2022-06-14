//33.Írjon függvényt vagy metódust, mely visszaadja, hogy két pozitív egész paraméterének
//legkisebb közös többszöröse hány számjegyből áll kettes számrendszerben.

class task33 {

  public static int lcm(int number1, int number2) {
    int absLowerNumber = 0;
    int absHigherNumber = 0;
    int lcm = 0;
    if (number1 > number2) {
      absHigherNumber = number1;
      absLowerNumber = number2;
    } else {
      absHigherNumber = number2;
      absLowerNumber = number1;
    }

    lcm = absHigherNumber;
    while (lcm % absLowerNumber != 0) {
      lcm += absHigherNumber;
    }
    int db = 0;

    System.out.println("lcm: " + lcm);
    while (lcm > 0) {
      lcm = lcm / 2;
      db++;
    }
    return db;
  }

  public static void main(String[] args) {
    System.out.println(lcm(4, 6));
  }
}
