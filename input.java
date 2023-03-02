import java.util.*;
public class input {
    public static void main(String[] args){
        System.out.println("Enter something");
        Scanner sc = new Scanner(System.in);
        // System.out.println(sc.nextInt()); //only enter a number when you enter int
        // System.out.println("My name is " +sc.nextLine());//only for a character
        String name = sc.nextLine();
        System.out.println(name);

    }
}
