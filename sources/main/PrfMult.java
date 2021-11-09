package sources.main;

public class PrfMult extends AbstractPrf {
  int caseZero(int[] X, int zero) {
    PrbZero zeroPrb = new PrbZero();
    return zeroPrb.operate(X[0]);
  }

  int caseSuccesorY(int X[], int succesorY) {
    int y = succesorY - 1;
    PrfAdd add = new PrfAdd();
    PrfMult mult = new PrfMult();
    int[] h = {X[0], y, mult.operate(X, y)};
    PrbProjection projection = new PrbProjection();
    return add.operate(new int[]{projection.operate(3, 3, h)}, X[0]);
  }
}
