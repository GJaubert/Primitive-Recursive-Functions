package sources.main;

public class PrbOne extends AbstractPrb {
  int caseX(int x) {
    PrbSuccesor suc = new PrbSuccesor();
    PrbZero zero = new PrbZero();
    return suc.operate(zero.operate(x));
  }
}
