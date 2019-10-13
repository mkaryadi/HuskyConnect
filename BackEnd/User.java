import java.util.*;

public class User {
    private Scanner console;
    private Set<String> courses;
    
    private String name;
    private String contactInfo;
    
    public User(String name, String contactInfo) {
        console = new Scanner(System.in);
        courses = new TreeSet<String>();
        
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
        }
        while (!done) {
            System.out.println("Enter another course (Q to Quit)");
            course = console.nextLine();
            if (course.equals("q") || course.equals("Q")) {
                done = true;
            } else {
               data.add(course);
            }
        }
    }
    
    // Prints out what courses are taken
    public void printCourses() {
         System.out.println(courses);
    }
    
    // Finds to see if personTwo has TAKEN classes personOne is TAKING
    public Set<String> compare(Set<String> personOne, Set<String> personTwo) {
         Set<String> similarCourses = new Set<String>();
         return similarCourses;
    }
}