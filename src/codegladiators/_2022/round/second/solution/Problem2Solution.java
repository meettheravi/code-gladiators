package codegladiators._2022.round.second.solution;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem2Solution {

  protected static final String NOT_FOUND = "N";
  protected static final String FOUND = "Y";

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long noOfSeats = scanner.nextLong();
    Long noOfOccupiedSeats = scanner.nextLong();
    Long noOfPrefferedSeats = scanner.nextLong();

    Set<Long> occupiedSeats = new HashSet<>();

    StringBuilder sb = new StringBuilder();

    for (Long j = 0L; j < noOfOccupiedSeats; j++) {
      occupiedSeats.add(scanner.nextLong());
    }
    for (Long k = 0L; k < noOfPrefferedSeats; k++) {
      Long seat = null;
      try {
        seat = scanner.nextLong();
      } catch (Exception e) { // specifically done as there was some issue with given input data
        sb.append(FOUND);
        continue;
      }
      if (occupiedSeats.contains(seat)) {
        sb.append(NOT_FOUND);
      } else {
        sb.append(FOUND);
      }
      sb.append(System.lineSeparator());
    }

    System.out.println(sb);

  }
}
