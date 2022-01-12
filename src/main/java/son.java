import java.util.Scanner;

public class son extends Human {
    public String name;
    public String id;
    private int kor;
    private int eng;
    private int math;
    private int sci;
    private int soc;
    private int avg;
    private String grade;

    @Override
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("이름을 입력하세요 ");
        name = in.next();
        System.out.print("학번을 입력하세요 ");
        id = in.next();
        System.out.print("국어 점수 입력하세요 ");
        kor = in.nextInt();
        System.out.print("영어 점수 입력하세요 ");
        eng = in.nextInt();
        System.out.print("수학 점수 입력하세요 ");
        math = in.nextInt();
        System.out.print("과학 점수 입력하세요 ");
        sci = in.nextInt();
        System.out.print("사회 점수 입력하세요 ");
        soc =in.nextInt();
}
    public void calc() { //점수 계산
        avg = (kor + eng + math + sci + soc) / 5;
    }

    public void setGrade() { //학점 계산 if (avg >= 95)
        if(avg>=95)
            grade="A+";
            else if (avg >= 90&&avg<95)
                grade = "A";
            else if (avg >= 85&&avg<90)
                grade = "B+";
            else if (avg >= 80&&avg<85)
                grade = "B";
            else if (avg >= 75&&avg<80)
                grade = "C+";
            else if (avg >= 70&&avg<75)
                grade = "C";
            else if (avg >= 65&&avg<70)
                grade = "D+";
            else if (avg >= 60&&avg<65)
               grade = "D";
            else
                grade="F";
        }
@Override
public String toString() {
        return "Student [이름=" + name + ", 학번=" + id + ", 중간고사=" + kor
        + ", 기말고사=" + eng + ", 출석=" + math + ", 레포트="
        + sci + ", 점수=" + soc + ", 학점=" + grade + "]";
        }

    public static void main(String[] args) {
        son s=new son();
        s.input();
        s.calc();
        s.setGrade();
        System.out.println(s.toString());
    }

}
