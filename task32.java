//32.Írjon függvényt vagy metódust, mely visszaadja, hogy k-tól m-ig hány olyan szám van,
//melyeknek n db valódi osztója van! (n, k és m paraméter).
class task32 {

  static int task(int n, int k, int m) {
    int counterer = 0;
    int oszto = 0;
    for (int start = k; start <= m; start++) {
      oszto = 0;
      for (int i = 1; i < start; i++) {
        if (start % i == 0 && i != 1) {
          oszto++;
        }
      }
      if (oszto == n) {
        counterer++;
      }
    }

    return counterer;
  }

  static int task2(int n, int k, int m) {
    int counter = 0;
    int numS = 0;

    for (int i = k; i < m; i++) {
      counter = 0;
      for (int j = k; j < m; j++) {

        if (j != 1 && j != i && i % j == 0) {
          counter++;
        }
      }

      if (counter == n) {
        numS++;
      }
    }

    return numS;
  }

  static int task3(int n, int k, int m) {
    int counter = 0;
    int numS = 0;

    for (int i = k; i <= m; i++) {
      counter = 0;
      for (int j = 2; j < m; j++) {

        if (i % j == 0) {
          counter++;
        }
      }

      if (counter == n) {
        numS++;
      }
    }

    return numS;
  }

  public static void main(String[] args) {
    System.out.println(task(4, 6, 12));

    System.out.println(task3(4, 6, 12));

  }
}
