public class Calculator{
  public static void main(String args[])
  {
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    int r1=a+b;
    int r2=a-b;
    int r3=a*b;
    System.out.println("addition:",+r1);
    System.out.println("subtraction",+r2);
    System.out.println("mul:",+r3);
  }
}
