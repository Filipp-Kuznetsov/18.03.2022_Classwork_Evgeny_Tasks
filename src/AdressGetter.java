import java.util.Arrays;

public class AdressGetter {
    Person[] people;

    public AdressGetter(Person[] people){
        this.people=people;

    }

    @Override
    public String toString() {
        return String.format("%s ",Arrays.toString(people));

    }

}
