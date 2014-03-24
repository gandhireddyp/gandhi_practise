package corejava.collections.compare;

public class Employee implements Comparable<Employee> {

    private String name;

    private int id;

    private String company;

    private float salary;

    @Override
    public int compareTo(final Employee o) {
        return name.compareTo(o.getName());
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the salary
     */
    public float getSalary() {
        return salary;
    }

    /**
     * @param salary
     *            the salary to set
     */
    public void setSalary(final float salary) {
        this.salary = salary;
    }

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company
     *            the company to set
     */
    public void setCompany(final String company) {
        this.company = company;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {

        return name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final int id) {
        this.id = id;
    }

}
