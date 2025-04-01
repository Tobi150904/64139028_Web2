package thiGk.ntu64139028.model;

public class Topic {
	public String id;
	public String topicName;
	public String topicDescription;
	public String supervisorId;
	public String topicType;
	
	public Topic() {
		super();
	}
	
	public Topic(String id, String topicName, String topicDescription, String supervisorId, String topicType) {
		super();
		this.id = id;
		this.topicName = topicName;
		this.topicDescription = topicDescription;
		this.supervisorId = supervisorId;
		this.topicType = topicType;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getTopicName() {
		return topicName;
	}
	
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
	public String getTopicDescription() {
		return topicDescription;
	}
	
	public void setTopicDescription(String topicDescription) {
		this.topicDescription = topicDescription;
	}
	
	public String getSupervisorId() {
		return supervisorId;
	}
	
	public void setSupervisorId(String supervisorId) {
		this.supervisorId = supervisorId;
	}
	
	public String getTopicType() {
		return topicType;
	}
	
	public void setTopicType(String topicType) {
		this.topicType = topicType;
	}
	
	@Override
	public String toString() {
		return "Topic [id=" + id + ", topicName=" + topicName + ", topicDescription=" + topicDescription
				+ ", supervisorId=" + supervisorId + ", topicType=" + topicType + "]";
	}
	
	// Hashcode 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((supervisorId == null) ? 0 : supervisorId.hashCode());
		result = prime * result + ((topicDescription == null) ? 0 : topicDescription.hashCode());
		result = prime * result + ((topicName == null) ? 0 : topicName.hashCode());
		result = prime * result + ((topicType == null) ? 0 : topicType.hashCode());
		return result;
	}
}
