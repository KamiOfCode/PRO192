
package Part02;

public class Employee {
    String code;
    String fullName;
    int age;
    String address;
    long salary;

    public Employee(String code, String fullName, int age, String address, long salary) {
        this.code = code;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public String toString() {
        return code + " - " + fullName + " - " + age + " - " + address + " - " + salary;
    }
}
