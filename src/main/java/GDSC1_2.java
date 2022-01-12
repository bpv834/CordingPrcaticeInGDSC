import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GDSC1_2 {
    public static void main(String[] args) {
        List<String> lan1 = Arrays.asList("English", "Japanese", "Python");
        List<String> lan2 = Arrays.asList("Python","Korean", "Java", "Chinese");
        List<String> re = new ArrayList<String>();
        List<String> merge = new ArrayList<>();
        merge.addAll(lan1);
        merge.addAll(lan2);
        for(int i =0; i< merge.size(); i++){
            if(!re.contains(merge.get(i))){
                re.add(merge.get(i));
            }
        }
        System.out.println(re);

    }
}
