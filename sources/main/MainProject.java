package sources.main;

public class MainProject {
  public static void main(String[] args) {
    try {
      if (args.length == 0) 
        throw new RuntimeException("Por favor, indique base y exponente");
      if (args.length == 1) 
        throw new RuntimeException("Por favor, indique un exponente");
      if (args.length > 2) 
        throw new RuntimeException("Por favor, indique solamente base y exponente");
      int[] x = {Integer.parseInt(args[0])};
      PrfPower power = new PrfPower();
      System.out.println(power.operate(x, Integer.parseInt(args[1])));
    } catch (Error error) {
      System.out.println(error);
    }
  }
}