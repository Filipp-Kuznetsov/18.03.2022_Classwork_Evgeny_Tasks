public class Adress {
  private String street;
   private int houseNummer;

   public Adress(String street,int houseNummer){
       this.street=street;
       this.houseNummer=houseNummer;
   }
    @Override
    public String toString() {
        return String.format("%s %s", street, houseNummer);
    }

}
