package Employee.Database;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int mobile;

    private int salary;

    public Employee() {
    }

    public Employee(Long id, String name, int mobile, int salary) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.salary = salary;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile=" + mobile +
                ", salary=" + salary +
                '}';
    }
}
