import java.util.ArrayList;
import java.util.Iterator;

public class GDSC1_1 {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<String>();
        l.add("지민");
        l.add("지수");
        l.add("예지");
        l.add("용민");
        l.add("정민");
        l.add("형균");
        Iterator<String> i=l.iterator();
        while (i.hasNext()){
            System.out.println(i.next()+" GDSC");
        }
    }
}
