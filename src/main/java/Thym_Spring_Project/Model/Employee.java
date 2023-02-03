package Thym_Spring_Project.Model;

import jakarta.persistence.*;

@Entity


public class Employee {
@jakarta.persistence.Id
    @GeneratedValue
    private long Id;

    @Column ( name = "First_name")

    private String Firstname;

    @Column ( name = "Last_name")
    private String Lastname;

    @Column( name = "Email")
    private String Email;

    public Employee() {

    }


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Employee(long id, String firstname, String lastname, String email) {

        Id = id;
        Firstname = firstname;
        Lastname = lastname;
        Email = email;
    }
}
