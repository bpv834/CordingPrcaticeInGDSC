import java.util.Scanner;

public class GDSC2_5 {
    public static String Main(int a){
        String str = "";
        int i =0;
        while(i<a){
            if(i%2 == 0){
                str += "수";
            }else{
                str += "박";
            }
            i++;
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Main(n));
    }
}