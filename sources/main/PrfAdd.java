package sources.main;

public class PrfAdd extends AbstractPrf {

  int caseZero(int[] X, int zero) {
    PrbIdentity indentity = new PrbIdentity();
    return indentity.operate(X[0]);
  }

  int caseSuccesorY(int[] X, int succesorY) {
    int y = succesorY - 1;
    PrbSuccesor succesor = new PrbSuccesor();
    PrfAdd add = new PrfAdd();
    int[] h = {X[0], y, add.operate(X, y)};
    PrbProjection projection = new PrbProjection();
    return succesor.operate(projection.operate(3, 3, h));
  }
}
