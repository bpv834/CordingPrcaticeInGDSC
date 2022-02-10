import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GDSC5_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Double>l=new ArrayList<Double>();
        ArrayList<Double>Nl=new ArrayList<Double>();
        int s=sc.nextInt();
        for (int i=0;i<s;i++){
            l.add(sc.nextDouble());
        }
        Collections.sort(l);
        double max=l.get(s-1);
        double Av=0;
        for (int i=0;i<s;i++){
            Nl.add(l.get(i)/max*100);
            Av=Av+Nl.get(i);
        }
        System.out.println(Av/s);


    }
}
