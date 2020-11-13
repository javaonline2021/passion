package basics;

public class Student {

	// fields or variables

	private int id;
	private String name;
	private String cname;
	
	public Student() {
		
	}
	
	

	public Student(int id, String name, String cname) {
		super();
		this.id = id;
		this.name = name;
		this.cname = cname;
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

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

}
