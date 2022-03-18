public class Dog {
   private String name;
   private int age;
  private int counter;

   public Dog(String name,int age,int counter){
       this.name=name;
       this.age=age;
       this.counter++;
   }
   public String getName(){
       return name;
   }
   public int getAge(){
       return age;
   }
   public String setName(){
       return name;
   }
   public int setAge(){
       if (age<0) {
           return 0;
       }
       return age;
   }
   public int getCounter(){
       return counter;

   }
   public int setCounter(){
       return counter;
   }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", counter=" + counter +
                '}';
    }
}
