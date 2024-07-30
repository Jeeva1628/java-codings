import java.lang.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of persons:");
        int person = sc.nextInt();
        System.out.println("enter the no of shifts:");
        int shift=sc.nextInt();
        System.out.println("who has the note now");
        int start=sc.nextInt();
        int dif=start-1;
        int rem=(shift%person)+dif;
        int res=rem%person;
        System.out.println("person "+(res+1)+" has the note now");
    }
}
