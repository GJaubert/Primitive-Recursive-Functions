package sources.main;

public class PrbIdentity extends AbstractPrb {
  int caseX(int x) {
    PrbProjection projection = new PrbProjection();
    return projection.operate(1, 1, new int[]{x});
  }
}
