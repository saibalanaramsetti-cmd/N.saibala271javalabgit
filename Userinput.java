import java.util.*;
class Userinput{
    public static void main(String []arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        System.out.println("name="+name);
         System.out.println("age="+age);

    }
}