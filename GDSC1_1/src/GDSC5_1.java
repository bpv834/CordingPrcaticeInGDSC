import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GDSC5_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<Integer>();
        int s=sc.nextInt();
        for(int i=0;i<s;i++){
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        System.out.println(l.get(0)+" "+l.get(s-1));
    }
}
