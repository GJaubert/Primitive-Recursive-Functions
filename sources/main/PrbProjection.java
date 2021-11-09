package sources.main;

public class PrbProjection {
  public int operate(int n, int i, int[] X) {
    return caseX(n, i, X);
  }
  int caseX(int n, int i, int[] X) {
    return X[i - 1];
  }
}
