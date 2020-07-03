package Practice;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaDay1Tasks {
    public static void main(String[] args) {
        JavaDay1Tasks tasks = new JavaDay1Tasks();
//        tasks.poundToKG();
        tasks.task1(6, 12);
        tasks.task2(0, 5);
        EmployeeDemo demo = new EmployeeDemo("John");
    }

    public void poundToKG(){
        double converter = 0.453592;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter pound: ");
        String pound = input.nextLine();
        int poundInt = Integer.parseInt(pound);
        System.out.println(pound + " pounds is " + poundInt*converter + "KG");
    }

    public int task1(int start, int end){
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = start + 1; i < end; i++){
            sb.append(i);
            sum += i;
            if (i != end -1){
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
        return sum;
    }

    public void task2(int start, int end){
        System.out.println("Sum of numbers: " + task1(start, end));

    }
}

class EmployeeDemo{
    public EmployeeDemo(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employee.sayHello();
    }

}

class Employee{
    String name;
    String company;
    String location;

    public void sayHello(){
        System.out.println("Hi, this is " + this.name);
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}