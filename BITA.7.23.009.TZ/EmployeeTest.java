public class EmployeeTest{
    public static void main(String[]args){
        Employee employee1=new Employee("fatma","mohd",12000);
        Employee employee2=new Employee("Zainab","kassim",13000);
        System.out.println("the year Salary of employee1 is " + employee1.getMonthlySalary()*12);
        System.out.println("the year Salary of employee2 is " + employee2.getMonthlySalary()*12);
        int p1=(int)(employee1.getMonthlySalary()*12*0.1)+employee1.getMonthlySalary();
        int p2=(int)(employee2.getMonthlySalary()*12*0.1)+employee2.getMonthlySalary();
        employee1.setMonthlySalary(p1);
        employee2.setMonthlySalary(p2);
        System.out.println("the year Salary of employee1 raise 10% is " + employee1.getMonthlySalary());
        System.out.println("the year Salary of employee2 raise 10% is " + employee2.getMonthlySalary());
    }
}