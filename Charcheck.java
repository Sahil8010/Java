import java.net.SocketTimeoutException;
import java.util.*;
public class Charcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char ch = sc.next().trim().charAt(1);

        if(ch >= 'a' && ch<= 'z'){
            System.out.println("Lower case");
        }else{
            System.out.println("Upper case");
        }
    }
}
