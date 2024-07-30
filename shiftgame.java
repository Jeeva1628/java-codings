import java.util.*;
class shiftgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of persons:");
        int person = sc.nextInt();
        System.out.println("enter the no of shifts:");
        int shift=sc.nextInt();
        int rem=person%shift;
        System.out.println("person "+rem+" has the note now");
    }
}
