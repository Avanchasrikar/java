class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age; // this.age is instane variable , age is local
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class ThisFunction {

    public static void main(String[] args) {
        // this function is used to declear instance variable
        // if there are instance and local variable ex- age = age in a method then the
        // first
        // preference will be given to local variable so, to show difference we use
        // this.age
        // if we use this it means it is instance variable

        Human obj = new Human();
        obj.setAge(20);
        obj.setName("srikar");

        System.out.println(obj.getAge() + " :" + obj.getName());

    }
}
