import java.util.Scanner;

public class GDSC1_44 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("행입력");
        int n=sc.nextInt();
        System.out.println("열입력");
        int m=sc.nextInt();

        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }

}
