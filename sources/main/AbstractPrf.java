package sources.main;

abstract class AbstractPrf {
  public int operate(int[] X, int y) {
    if (y == 0) return caseZero(X, y);
    else return caseSuccesorY(X, y);
  }

  abstract int caseZero(int[] X, int zero);
  abstract int caseSuccesorY(int[] X, int succesorY);
}
