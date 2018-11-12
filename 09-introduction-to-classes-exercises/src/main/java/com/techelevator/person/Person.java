package com.techelevator.person;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person(){
	}

	public String getFullName() {
		return (this.lastName + ", " + this.firstName);
	}
	
	public boolean isAdult() {
		if(this.age < 18) {
			return false;
		}else {
			return true;
		}			
	}	
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
/*| Attribute | Data Type | Get | Set | Description |
|----------|-----------|-----|-----|-------------|
| firstName | String | X | X | The first name of the person.  |
| lastName | String | X | X | The last name of the person. |
| age | int | X | X | The age of the person. |

### Methods

    public String getFullName()
    public boolean isAdult()

**Notes**
- `getFullName()` returns the `lastName` + ", " + `firstName`.
- `isAdult()` returns `true` if the person is 18 or older.

### Constructors

The `Person` class uses the default constructor.*/