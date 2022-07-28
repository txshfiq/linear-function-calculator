import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scanner = new Scanner (System.in);

      System.out.println ("Y=MX+B CALCULATOR     ver. 1");
      System.out.println ("----------------------------");
      System.out.println ("Type x1:");

    double x_one = Double.valueOf (scanner.nextLine ());
      System.out.println ("Type y1:");
    double y_one = Double.valueOf (scanner.nextLine ());

      System.out.println ("Type x2:");
    double x_two = Double.valueOf (scanner.nextLine ());
      System.out.println ("Type y2:");
    double y_two = Double.valueOf (scanner.nextLine ());

    double m = (y_two - y_one) / (x_two - x_one);
    double b = y_one - m * x_one;
    
      System.out.println (" ");
      System.out.println ("Your equation is:");
      System.out.println ("y = " + m + "x + " + b);
      System.out.println (" ");
      
      System.out.println ("Your slope (m) was " + m);
      System.out.println ("Your y-intercept (b) was " + b);
      System.out.println (" ");
      
      System.out.println ("Note: if the slope and y-intercept ");
      System.out.println ("end up saying 'infinity', that means ");
      System.out.println ("you have a vertical line and therefore no y-intercept.");
  }
}