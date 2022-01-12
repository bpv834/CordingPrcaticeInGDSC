public class Object_1 {
    int Price;
    int Unit_price;
    int Remains;
    String Code="";
    String EngName="";
    public Object_1(int Price, int Unit_price,int Remains, String EngName, String Code) {
        this.Price = Price; this.Unit_price = Unit_price; this.Remains=Remains; this.EngName=EngName; this.Code=Code;
    }
    public int getP() { return Price; }
    public int getD() { return Unit_price; }
    public int getJ() { return Remains; }
    public String getN(){return EngName;}
    public String getC(){return Code;}
}
