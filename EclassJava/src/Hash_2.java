import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hash_2 {
    public static void main(String[] args) {
        HashMap<String,Integer>Scm=new HashMap<String, Integer>();
        Scm.put("최호준",88);
        Scm.put("황인찬",86);
        Scm.put("박성천",84);
        Scm.put("엄성준",82);
        Scm.put("박기수",80);

        System.out.println("해시맵size="+Scm.size());

        Set<String> keys=Scm.keySet();
        Iterator<String> it= keys.iterator();

        while (it.hasNext()){
            String name=it.next();
            int score=Scm.get(name);
            System.out.println(name+" "+score);
        }
    }
}
