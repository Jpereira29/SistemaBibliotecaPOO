import java.util.Date;

public abstract class Person {
    private String firstname;
    private String lastName;
    private Date dateOfBirth;

    public Person(String firstname, String lastName, Date dateOfBirth) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
