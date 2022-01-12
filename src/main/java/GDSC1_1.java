import java.util.Arrays;

public class GDSC1_1 {
    public static void main(String[] args) {
        String str[]=new String[]{"English", "Japanese", "Python"};
        String str1[]=new String[]{"Python","Korean", "Java", "Chinese"};

        int l= str.length+ str1.length;
        String strp[]=new String[l];
        System.arraycopy(str,0,strp,0,str.length);
        System.arraycopy(str1,0,strp,str.length,str1.length);
        Arrays.sort(strp);
        for(int i=1;i<l;i++){
            if(strp[i]!=strp[i-1])
                System.out.println(strp[i]);
        }
        if(strp[0]!=strp[1])
            System.out.println(strp[0]);





    }
}
