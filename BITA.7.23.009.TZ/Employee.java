public class Employee{
    private String FirstName;
    private String LastName;
    private int MonthlySalary;
    public Employee(String FirstName,String LastName,int MonthlySalary){
        if(MonthlySalary<0){
            this.MonthlySalary=0;
        }else{
            this.MonthlySalary=MonthlySalary;
        }
        this.FirstName=FirstName;
        this.LastName=LastName;
    }
    public void setMonthlySalary(int MonthlySalary){
        if(MonthlySalary<0){
            this.MonthlySalary=0;
        }else{
            this.MonthlySalary=MonthlySalary;
        }
    }
    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }
     public void setLastName(String LastName){
        this.LastName=LastName;
    }
    public int getMonthlySalary(){
        return MonthlySalary;
    }
     public String getFirstName(){
        return FirstName;
    }
     public String getLastName(){
        return LastName;
    }
}
