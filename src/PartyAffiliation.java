import java.util.Scanner;

public class PartyAffiliation {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String partyName;
    System.out.println(
        "Please input your partyName affiliation (Democrat, Republican, or Independent), and the program will output your animal.");
    if (in.hasNextLine()) {
      partyName = in.nextLine();
        if (partyName.equalsIgnoreCase("D")) {
          System.out.println("You got: a Democratic Donkey!");
        } else if (partyName.equalsIgnoreCase("R")) {
          System.out.println("You got: a Republican Elephant!");
        } else if (partyName.equalsIgnoreCase("I")) {
          System.out.println("You got: an Independent Person!");
        } else {
        System.out.println("you got: Other");
      }

    }
  }
}
