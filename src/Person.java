public class Person {
    String name;
    Adress adress;
    public Person(String name, Adress adress ) {
        this.name = name;
        this.adress=adress;
    }
    @Override
    public String toString() {
        return String.format("%s %s", name, adress);
    }

}
