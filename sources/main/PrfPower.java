package sources.main;

public class PrfPower extends AbstractPrf {

  int caseZero(int[] x, int zero) {
    PrbOne one = new PrbOne();
    return one.operate(x[0]);
  }

  int caseSuccesorY(int[] X, int succesorY) {
    int y = succesorY - 1;
    PrfMult mult = new PrfMult();
    PrfPower power = new PrfPower();
    int[] h = {X[0], y, power.operate(X, y)};
    PrbProjection projection = new PrbProjection();
    return mult.operate(new int[]{projection.operate(3, 3, h)}, X[0]);
  }
}
