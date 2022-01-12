import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ColectionsEx {
    static void printList(LinkedList<String> l) {
        Iterator<String> iterator = l.iterator();
        while (iterator.hasNext()) {
            String e = iterator.next();
            String separator;
            if (iterator.hasNext())
                separator = "->";
            else
                separator = "\n";
            System.out.print(e+separator);
        }
    }

    public static void main(String[] args) {
        LinkedList<String>mylist=new LinkedList<String>();
        mylist.add("트랜스포머");
        mylist.add("스타워즈");
        mylist.add("매트릭스");
        mylist.add(0,"터미네이터");
        mylist.add(2,"아바타");

        Collections.sort(mylist);
        printList(mylist);
        Collections.reverse(mylist);
        printList(mylist);
        int index=Collections.binarySearch(mylist,"아바타")+1;
        System.out.println("아바타는"+index+"번째 요소다");
    }

}
