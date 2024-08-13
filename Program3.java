//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

public class program3{
    public static void main(String[] args){
        int w = 0;
        int l = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("ENTER LENGTH");
        l = s.nextInt();
        System.out.println("ENTER WIDTH");
        w = s.nextInt();
        int a = l * w;
        int p = l + l + w +w;
        System.out.println("The length is " + l);
        System.out.println("The width is " + w);
        System.out.println("The Area is " + a);
        System.out.println("The Perimeter is " + p);
    }
}
/*
//The length is 143
//The width is 82
//The Area is 11726
//The Perimeter is 450
*/
