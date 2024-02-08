public class EncapsulationExample {
    private int age;

    public void setAge(int age) {
        this.age = age;
        if(age<6){
            System.out.println("You are too young");
        }else{
            System.out.println("Welcome to Hogwarts!");
        }
    }

    public int getAge() {
        return age;
    }
}
