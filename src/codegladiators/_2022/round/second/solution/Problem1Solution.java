package codegladiators._2022.round.second.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int roomIndex = scanner.nextInt();
    List<Integer> validRooms = new ArrayList<>();

    int i = 1;
    while (validRooms.size() < roomIndex) {
      String currentRoom = String.valueOf(i);
      if (currentRoom.contains("2") || currentRoom.contains("14")) {
        i++;
        continue;
      }
      validRooms.add(i);
      i++;
    }

    System.out.println(validRooms.get(validRooms.size() - 1));

  }
}
