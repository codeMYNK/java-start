import java.util.*;

public class If_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age:");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult Your age is:"+ age);
        } else {
            System.out.println("Go Just Grow Up! Your age is:"+ age);
        }
    }
}