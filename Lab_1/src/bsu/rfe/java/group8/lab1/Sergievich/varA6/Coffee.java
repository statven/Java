package bsu.rfe.java.group8.lab1.Sergievich.varA6;
public class Coffee extends Food{
    public String getAroma() {
        return Aroma;
    }

    public void setAroma(String Aroma) {
        this.Aroma = Aroma;
    }

    private String Aroma;
    public Coffee(String Aroma) {
        super("Кофе");
        this.Aroma = Aroma;
    }



    @Override
    public void consume() {
        System.out.print(  this.toString()+  " выпито ");

    }
    @Override
    public String toString(){
        return "Кофе с ароматом  " + Aroma;
    }
}
