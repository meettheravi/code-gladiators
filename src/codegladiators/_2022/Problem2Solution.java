package codegladiators._2022;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    short noOfTestcases = scanner.nextShort();
    for (short i = 0; i < noOfTestcases; i++) {
      int chantuHaveToBuy = scanner.nextInt();
      int giftsAvailable = scanner.nextInt();

      long pricesList[] = new long[giftsAvailable];
      for (int j = 0; j < pricesList.length; j++) {
        pricesList[j] = scanner.nextInt();
      }

      Arrays.sort(pricesList);

      long minAmount = 0;

      for (int k = 0; k < chantuHaveToBuy; k++) {
        minAmount+=pricesList[k];
      }
      System.out.println(minAmount);
    }

  }
}
