package at.htl.bank.model;

public class BankKonto {

  private String name;
  protected double kontoStand;

    public BankKonto(String name){
      this.name = name;
  }

    public double getKontoStand() {
        return kontoStand;
    }

    public BankKonto(String name, double anfangsBestand){
        this.name = name;
        this.kontoStand = anfangsBestand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void einzahlen(double betrag){
      this.kontoStand += betrag;
    }

    public void abheben(double betrag){
        this.kontoStand -= betrag;
    }
}
