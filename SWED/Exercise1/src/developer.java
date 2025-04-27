
public class developer {
	private String name;
	private int age;
	private String company;
	private String email;
	private int id;
	
	// Constructor
	public developer(String name, int age, String company, String email, int id) {
		setName(name);
		setAge(age);
		setCompany(company);
		setEmail(email);
		setId(id);
	}
	
	// Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty.");
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be above 18");
        }
		this.age = age;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
        if (company == null || company.isEmpty()) {
            throw new IllegalArgumentException("Company cannot be empty.");
        }
		this.company = company;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty.");
        }
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
        if (id < 1000) {
            throw new IllegalArgumentException("Id must have atleast 4 digits.");
        }
		this.id = id;
	}
}
