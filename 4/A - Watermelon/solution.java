import java.util.Scanner;
 
public class question {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        if(x%2==0&&x>2) System.out.println("yes");
        else System.out.println("no");
    }
}