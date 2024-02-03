public class GettersAndSetters {
    private int age;
    GettersAndSetters gettersAndSetters = new GettersAndSetters();
    public int getAge() {
        // getter method
        return  age;
    }
    public void setAge(int age) {
        //setter method
        this.age = age;
    }
    public void message(String name, int age){
        if(age<0){
            System.out.println("Invalid age");
            gettersAndSetters.setAge(0);
        }else{
            gettersAndSetters.setAge(age);
        }
        System.out.println("Name of person is: "+name);
        System.out.println("Age of person is: "+gettersAndSetters.getAge());
    }
}
