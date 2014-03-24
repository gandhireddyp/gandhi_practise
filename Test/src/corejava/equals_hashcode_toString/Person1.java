package corejava.equals_hashcode_toString;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Person1 {

	private int id;
	private String name;
	private String place;
	private float salary;

	public Person1() {
		
	}

	public Person1(int id, String name, String place, float salary) {
		this.id = id;
		this.name = name;
		this.place = place;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(id).append(name).append(place)
				.append(salary).hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person1) {
			Person1 user = (Person1) obj;
			return new EqualsBuilder().append(this.id, user.getId())
					.append(this.name, user.name)
					.append(this.place, user.getPlace())
					.append(this.salary, user.getSalary()).isEquals();
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append(this.id).append(this.name)
				.append(this.place).append(salary).toString();
	}

}
