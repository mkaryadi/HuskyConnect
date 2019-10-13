import java.util.*;

public class User {
<<<<<<< HEAD

    private String name;
    private String email;
    private Set<String> taken;
    private Set<String> taking;
    
    public User() {
        Scanner console = new Scanner(System.in);
        System.out.
        taken = new TreeSet<>();
        taking = new TreeSet<>();
        System.out.println("Enter classes you've taken?");
        fill(taken, pastPrompt);
        String currentPrompt = "Enter classes you're taking?"
        fill(taking, currentPrompt);
    }
=======
    private Scanner console;
    private Set<String> taken;
    private Set<String> taking;
    
    private String name;
    private String contactInfo;
>>>>>>> b154c52356a5cb06a3d3f8e518dbb1dcd52a12dc
    
    public User(String name, String contactInfo) {
        console = new Scanner(System.in);
        taken = new TreeSet<String>();
        taking = new TreeSet<String>();
        
        this.name = name;
        this.contactInfo = contactInfo;
        
        System.out.println("Hello, " + name);      
        System.out.println("Enter classes you've taken");
        fill(taken);
        System.out.println("Enter a class you're taking:");
        fill(taking);
    }
    
    private void fill(Set<String> data) {
        boolean done = false;
        String course = console.nextLine();
        
        if (course.equals("q") || course.equals("Q")) {
            done = true;
        } else {
            data.add(course);
<<<<<<< HEAD
            System.out.println("Is that all? If so, please type the number 1. Otherwise, type any other number.");
            int checkNum = console.nextInt();
            if (checkNum == 1) { 
=======
        }
        while (!done) {
            System.out.println("Enter another course (Q to Quit)");
            course = console.nextLine();
            if (course.equals("q") || course.equals("Q")) {
>>>>>>> b154c52356a5cb06a3d3f8e518dbb1dcd52a12dc
                done = true;
            } else {
               data.add(course);
            }
        }
    }
    
    // Prints out what courses are taken
    public void printTakenList() {
         System.out.println(taken);
    }
    
    // Prints out what courses are being taken
    public void printTakingList() {
         System.out.println(taking);
    }
    
    // Finds to see if personTwo has TAKEN classes personOne is TAKING
    public Set<String> compare(Set<String> personOne, Set<String> personTwo) {
         Set<String> similarCourses = new TreeSet<String>();
         return similarCourses;
    }
}