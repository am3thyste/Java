package booksManagement;

public class Publisher {
	private int id;
	private String publisherName;
	
	//constructors:
	public Publisher(int id, String publisherName){
		this.id = id;
		this.publisherName = publisherName;
	}

	public Publisher() {
	}
	
	//getters and setters:
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPublisherName() {
		return publisherName;
	}

	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	
	//toString method:
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + "]";
	}
	
}
