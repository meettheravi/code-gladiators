package codegladiators._2022;

import java.util.Scanner;

public class Problem1Solution {

  public static void main(String[] args) {
    String EMPTY_STRING = "";
    String BLANK_STRING = " ";
    Scanner scanner = new Scanner(System.in);
    short launchTimeHH = scanner.nextShort();
    short launchTimeMM = scanner.nextShort();
    short travelTimeHH = scanner.nextShort();
    short travelTimeMM = scanner.nextShort();

    short carryMM = (short) ((launchTimeMM + travelTimeMM) / 60);
    String blastTimeMM = EMPTY_STRING + ((launchTimeMM + travelTimeMM) % 60);

    if (carryMM != 0) {
      travelTimeHH += 1;
    }
    String blastTimeHH = EMPTY_STRING + ((launchTimeHH + travelTimeHH) % 24);
    if (blastTimeHH.length() == 1) {
      blastTimeHH = 0 + blastTimeHH;
    }
    if (blastTimeMM.length() == 1) {
      blastTimeMM = 0 + blastTimeMM;
    }

    System.out.println(blastTimeHH + BLANK_STRING + blastTimeMM);

  }
}
