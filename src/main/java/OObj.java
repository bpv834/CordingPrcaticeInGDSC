public class OObj {
    int Panmae;
    int Danga;
    int Jago;
    String Code="";
    String EN="";
    public OObj(int Panmae, int Danga,int Jago, String EN, String Code) {
        this.Panmae = Panmae; this.Danga = Danga; this.Jago=Jago; this.EN=EN; this.Code=Code;
    }
    public int getP() { return Panmae; }
    public int getD() { return Danga; }
    public int getJ() { return Jago; }
    public String getN(){return EN;}
    public String getC(){return Code;}

}
