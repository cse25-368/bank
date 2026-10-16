public class Individual extends Customer{
    private String surname;
    private double salary;
private Employer employer;

    public Individual(String surname, Employer employer) {
        super();
        this.surname = surname;
        this.employer = new Employer(employer.getName(), employer.getContact());
    }

    public String getSurname() {
        return surname;
    }

public void setSurname(String surname) {
        this.surname= surname;;
    }

    public double getSalary() {
        return salary;
    }

    
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }
}
