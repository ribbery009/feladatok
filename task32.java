//32.Írjon függvényt vagy metódust, mely visszaadja, hogy k-tól m-ig hány olyan szám van,
//melyeknek n db valódi osztója van! (n, k és m paraméter).
class task32 {

  static int task(int n, int k, int m) {
    int counter = 0;
    int oszto = 0;
    for (int start = k; start <= m; start++) {
      oszto = 0;
      for (int i = 1; i < start; i++) {
        if (start % i == 0 && i != 1) {
          oszto++;
        }
      }
      if (oszto == n) {
        counter++;
      }
    }

    return counter;
  }

  public static void main(String[] args) {
    System.out.println(task(4,6,12));
  }
}
