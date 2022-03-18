import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Butch",8,1);
        Dog dog2= new Dog("Charly",2,2);
        Dog dog3= new Dog("Spenser",5,3);
        Dog[] dogs={dog1,dog2,dog3};
        System.out.println(dog3.setCounter());
        System.out.println(Arrays.toString(dogs) );


        System.out.println("------------------");
        Adress adress1=new Adress("Schrobenhausenerstr.",14);
        Adress adress2=new Adress("Hitlstr.",13);
        Adress adress3=new Adress("Wolfratshausenerstr.",9);

        Person person1= new Person("Gena",adress1);
        Person person2= new Person("Vasya",adress2);
        Person person3= new Person("Katy",adress3);
        Person[] people={person1,person2,person3};
        System.out.println(Arrays.toString(people));




    }
}
