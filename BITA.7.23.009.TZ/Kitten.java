public class Kitten{
    private String name;
    private String owner;
    private int age;
    public Kitten(String name,String owner, int age){
        this.name=name;
        this.owner=owner;
        if(age<0){
            this.age=0;
        }else{
            this.age=age;
            System.out.println("Kitten's age ");
        }
    }
    public void haveBirthday(){
        age++;
    }
    public String toString(){
        return "Kitten name is " + name + " and age " + age + " and belongs to " +owner;
    }
}