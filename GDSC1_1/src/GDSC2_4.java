import java.util.Scanner;

public class GDSC2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int H=sc.nextInt();
        int M=sc.nextInt();

        if(M>=45){
            M=M-45;
        }
        else if(M<45&&H>0){
            H=H-1;
            M=60-(45-M);
        }
        else if(M<45&&H<=0) {
            H = 23;
            M = 60 - (45 - M);
        }
        System.out.println(H+" "+M);
    }
}
