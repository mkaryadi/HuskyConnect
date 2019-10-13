import java.util.*;

public class User {

    private Set<String> taken;
    private Set<String> taking;
    
    public User() {
        taken = new TreeSet<>();
        taking = new TreeSet<>();
        System.out.println("Enter classes you've taken?");
        fill(taken, pastPrompt);
        String currentPrompt = "Enter classes you're taking?");
        fill(taking, currentPrompt);
    }
    
    
     
    private void fill(Set<String> data, String prompt) {
        Scanner console = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            System.out.println(prompt);
            String course = console.nextLine();
            data.add(course);
            System.out.println("Is that all? If so, please type the number 1. Otherwise, type any other number.");
            int checkNum = console.nextInt();
            if (checkNum == 1) {
                done = true;
            }
        }
    }
}