package booksManagement;

public class Author {
    private int id;
    private String firstName;
    private String lastName;
    
    
    //constructors:
    public Author(int id, String firstName, String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Author() {
	}
    
    
    //getters and setters:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
	
	//ToString method:
		@Override
		public String toString() {
			return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
		}

		
 
}
