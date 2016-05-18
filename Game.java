import java.io.Console;

public class Game {

  public static void main(String[] args) {
    Console console = System.console();
    String getAge = console.readLine("Enter your age:  ");
    int age = Integer.parseInt(getAge);
    if (age < 13) {
      console.printf("Sorry you must be older than %s to use this game. \n", age);
      System.exit(0);
    }
    String name = console.readLine("Enter a name:  ");
    String adjective = console.readLine("Enter an adjective:  ");
    String noun;
    boolean isInvalidWord;
    do {
      noun = console.readLine("Enter a noun:  ");
      isInvalidWord = (noun.equalsIgnoreCase("dork") || noun.equalsIgnoreCase("jerk") || noun.equalsIgnoreCase("nerd"));
      if (isInvalidWord) {
        console.printf("That language is not allowed. Try Again. \n\n");
      }
    } while (isInvalidWord);
    String adverb = console.readLine("Enter an adverb:  ");
    String verb = console.readLine("Enter a verb ending with -ing:  ");

    console.printf("Your Story:\n----------------------\n");
    console.printf("%s is a %s %s.   ", name, adjective, noun);
    console.printf("They are always %s %s. \n.", adverb, verb);
  } 
}
