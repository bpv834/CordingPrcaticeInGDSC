import java.util.Scanner;

public class GDSC2_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++)
            for(int j=0;j<2;j++)
                arr[i][j]=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println(arr[i][0]+arr[i][1]);
        }
    }
}
