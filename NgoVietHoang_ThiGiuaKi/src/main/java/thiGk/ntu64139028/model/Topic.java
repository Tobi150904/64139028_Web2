package thiGk.ntu64139028.model;

public class Topic {
	private int id;
    private String topicName;
    private String topicDescription;
    private int supervisorId;
    private String topicType;

    public Topic() {}

    public Topic(int id, String topicName, String topicDescription, int supervisorId, String topicType) {
        this.id = id;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
        this.supervisorId = supervisorId;
        this.topicType = topicType;
    }

    public int getId() { 
    	return id; 
    }
    
    public void setId(int id) { 
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
    
    public int getSupervisorId() { 
    	return supervisorId; 
    }
    
    public void setSupervisorId(int supervisorId) {
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
		result = prime * result + id;
		result = prime * result + ((topicDescription == null) ? 0 : topicDescription.hashCode());
		result = prime * result + ((topicName == null) ? 0 : topicName.hashCode());
		result = prime * result + ((topicType == null) ? 0 : topicType.hashCode());
		result = prime * result + supervisorId;
		return result;
	}
}
