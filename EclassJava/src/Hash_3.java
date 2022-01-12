import java.util.HashMap;
import java.util.Scanner;

class Stu{
    int id;
    String tel;
    public Stu(int id,String tel){
        this.id=id;
        this.tel=tel;
    }
    public int getId(){return id;}
    public String getTel(){return tel;}

}
public class Hash_3 {
    public static void main(String[] args) {
        HashMap<String,Stu> hs=new HashMap<String, Stu>();
        hs.put("최호준",new Stu(1,"010-3057-1270"));
        hs.put("최호",new Stu(2,"010-3057-1271"));
        hs.put("최준",new Stu(3,"010-3057-1272"));

        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("검색할 이름");
            String name=sc.next();
            if(name.equals("없음"))
                break;
            Stu sstu=hs.get(name);
            if(sstu==null)
                System.out.println("찾을 수 없다");
            else
                System.out.println("id="+sstu.getId()+"tel="+sstu.getTel());
        }
    }
}
