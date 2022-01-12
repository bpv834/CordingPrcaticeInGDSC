import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        Byte b[]=new Byte[6];
        try {
            FileInputStream fin=new FileInputStream("c:\\Temp\\test1.out");
            int n=0;
            int c;
            while ((c=fin.read())!=-1){
                b[n]=(byte)c;
                n++;
            }
            System.out.println("c:\\Temp\\test.out에서 읽은 배열을 출력합니다.");
            for (int i=0;i<b.length;i++){
                System.out.println(b[i]+"");
                System.out.println();

            }
        } catch (IOException e) {
            System.out.println("경로명 체크");
        }

    }
}
