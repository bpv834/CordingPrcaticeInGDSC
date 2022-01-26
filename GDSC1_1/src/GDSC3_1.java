import java.util.Scanner;

public class GDSC3_1 {
  public static int solution(int l, int r){

      int num=0;
      while (l<=r) {

          int cnt=0;
          for (int i = 1; i <= l; i++) {

              if (l % i == 0)
                  cnt++;

          }
          if(cnt%2==0)
              num=num+l;
          else{
              num=num-l;
          }
          l++;
      }
      return num;


  }

    public static void main(String[] args) {
        System.out.println("답"+solution(13,17));
    }
}
