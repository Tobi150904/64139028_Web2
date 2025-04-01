package thiGk.ntu64139028.model;

public class Student {
	public int id;
	public String name;
	public String groupId;
	
	public Student() {
		super();
	}
	
	public Student(int id, String name, String groupId) {
		super();
		this.id = id;
		this.name = name;
		this.groupId = groupId;
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
	
	public String getGroupId() {
		return groupId;
	}
		
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", groupId=" + groupId + "]";
	}
	
	// HashCode
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupId == null) ? 0 : groupId.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
}
