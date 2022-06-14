package basictimecomplexity;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumberOrNot
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number:");
      int num= sc.nextInt();
      System.out.println(isPrimeStream(num));
  }
  public static boolean isPrimeStream(int number) {
      if(number <= 2)
          return number == 2;
      else
          return  (number % 2) != 0
                  &&
                  IntStream.rangeClosed(3, (int) Math.sqrt(number))
                          .filter(n -> n % 2 != 0)
                          .noneMatch(n -> (number % n == 0));
  }
    }

