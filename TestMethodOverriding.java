class Employee{
    double currentSalary;
    double newSalary;
    void calculateNewSalary(double currentSalary){
        newSalary = currentSalary+currentSalary * .1;
    }
}
class Developer extends Employee{
    void calculateNewSalary(double currentSalary){
        newSalary = currentSalary+currentSalary * .2;
        System.out.println("New salary of developer:"+newSalary);
    }
}
class Manager extends Employee{
    void calculateNewSalary(double currentSalary){
        newSalary = currentSalary+currentSalary * .3;
        System.out.println("New salary of Manager:"+newSalary);
    }
}
public class TestMethodOverriding{
    public static void main(String[] ar){
        Developer d1=new Developer();
        d1.calculateNewSalary(10000);
        Manager m1=new Manager();
        m1.calculateNewSalary(20000);
    }
}