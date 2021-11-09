package sources.main;

abstract class AbstractPrb {
  public int operate(int x) {
    return caseX(x);
  }
  abstract int caseX(int x);
}
