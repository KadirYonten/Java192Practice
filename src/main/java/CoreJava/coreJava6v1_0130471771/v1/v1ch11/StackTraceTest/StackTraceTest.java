import javax.swing.*;

/**
   A program that displays a trace feature of a recursive
   method call.
*/
public class StackTraceTest
{
   /**
      Computes the factorial of a number
      @param n a nonnegative integer
      @return n! = 1 * 2 * . . . * n
   */
   public static int factorial(int n)
   {
      System.out.println("factorial(" + n + "):");
      Throwable t = new Throwable();
      StackTraceElement[] frames = t.getStackTrace();
      for (int i = 0; i < frames.length; i++)
         System.out.println(frames[i]);
      int r;
      if (n <= 1) r = 1;
      else r = n * factorial(n - 1);
      System.out.println("return " + r);
      return r;         
   }

   public static void main(String[] args)
   {
      String input = JOptionPane.showInputDialog("Enter n:");
      int n = Integer.parseInt(input);
      factorial(n);
      System.exit(0);
   }
}
