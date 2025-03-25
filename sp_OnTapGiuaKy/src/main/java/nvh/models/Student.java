package nvh.models;

import java.util.Objects;

public class Student {
    private String id;
    private String name;
    private String address;
    
    public Student() {}
    
    public Student(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    
    // Getters and Setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return Objects.equals(id, student.id) && 
               Objects.equals(name, student.name) && 
               Objects.equals(address, student.address);
    }
    
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", address=" + address + '}';
    }
}