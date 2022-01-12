import java.util.ArrayList;
import java.util.Iterator;

public class GDSC1_2 {
    public static void main(String[] args) {
        ArrayList<String> lan1=new ArrayList<String>();
        ArrayList<String> lan2=new ArrayList<String>();
        ArrayList<String> merge=new ArrayList<String>();
        ArrayList<String> lan3=new ArrayList<String>();
        lan1.add("영어");
        lan1.add("일어");
        lan1.add("파이썬");
        lan2.add("파이썬");
        lan2.add("국어");
        lan2.add("자바");
        lan2.add("중국어");
        merge.addAll(lan1);
        merge.addAll(lan2);
       int i=0;
       for(i=0;i<merge.size();i++){
           if(!lan3.contains(merge.get(i)))
               lan3.add(merge.get(i));
       }

        for(int h=0;h<lan3.size();h++)
            System.out.println(lan3.get(h));




    }
}
