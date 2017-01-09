package corejava.equals_hashcode_toString;

public class Person {

    private String name;

    private int Id;

    private float salary;

    public Person(final String name, final int id) {
        this.name = name;
        Id = id;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(final int id) {
        Id = id;
    }

    /**
     * Overriding hashCode has below steps 1.Always multiply hashcode with prime
     * number
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Id;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + Float.floatToIntBits(salary);
        return result;
    }

    /**
     * Overriding equals method has below steps 1. Compare objects using "=="
     * operator 2. Check for null 3.compare the object class 4.Cast the object
     * to required class. 5.Compare the attributes
     */
    @Override
    public final boolean equals(final Object obj) {
    	
    	if(!(obj instanceof Person)){
    		return false;
    	}

        if (this == obj) {
            return true;
        }

        

        // here we have used class comparison instead of "instaceof" operation.
        // Because, "instanceof" operation returns true even for sub classes. So
        // usage of "instanceof" operator is appropriate only in case of mutable
        // classes.
        /*if (!(obj.getClass() == this.getClass())) {
            return false;
        }*/

        final Person other = (Person) obj;
        // After casting the object, compare the numeric attributes first.
        // Because comparing numeric attributes is fast
        if (other.getId() != Id) {
            return false;
        }

        if (name == null) {
            if (other.getName() != null) {
                return false;
            }
        } else if (!name.equals(other.getName())) {
            return false;
        }

        if (!checkStringEquality(name, other.getName())) {
            return false;
        }

        return true;
    }

    /**
     * Overriding toString. Always use StringBuffer/StringBuilder to append
     * strings.
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Person[ID=").append(Id);
        builder.append(", Name=").append(name);
        builder.append("]");
        return builder.toString();
    }

    private boolean checkStringEquality(final String str1, final String str2) {

        if (str1 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str1.equals(str2)) {
            return false;
        }
        return true;
    }

}
