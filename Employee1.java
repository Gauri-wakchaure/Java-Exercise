class Employee1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(101, "Gauri", 40000);
        System.out.println(emp1.id);
        System.out.println(emp1.name);
        System.out.println(emp1.salary);       
    }                   
 }

class Employee {
    int id;
    String name;
    float salary;

    Employee(int id, String name, float salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}