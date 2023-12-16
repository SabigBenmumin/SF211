// Name (in English): Sabig Benmumin
// ID: 6510742197

import java.util.Random;

public class Q3 {
  public static void main(String[] args) {
    Employee e = new Employee(1, "John Doe");
    Employee m = new Manager(2, "Jane Dee", "HR");
    Manager n = new Manager(2, "Jane Dee", "HR");
    System.out.println(e);
    System.out.println(m);
    System.out.println(e.equals(m));
    System.out.println(n.equals(m));
    System.out.println(m.getSalary() - e.getSalary());
  }
}

class Employee {
  private static final double BASE_SALARY = new Random().nextInt(10000) + 10000;
  private int id;
  private String name;

  public Employee(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public double getSalary() {
    return BASE_SALARY;
  }

  public String toString() {
    return id + ": " + name;
  }

  public boolean equals(Object other) {
    if (!(other instanceof Employee))
      return false;
    Employee o = (Employee) other;
    return id == o.id && name.equals(o.name);
  }
}

class Manager extends Employee{
  private String department;
  public Manager(int id, String name, String department){
    super(id, name);
    this.department = department;
  }
  public double getSalary(){
    return super.getSalary() + 5000;
  }
  public String toString() {
    return super.toString() + " (Manager of " + department + ")";
  }
  public boolean equals(Object other){
    if (!(other instanceof Manager)) return false;
    Manager o = (Manager) other;
    return super.equals(other) && department.equals(o.department);
  }
}