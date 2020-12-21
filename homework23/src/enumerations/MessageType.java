package enumerations;

public enum MessageType {
	A(Priority.HIGH), B(Priority.MEDIUM), C(Priority.LOW), D(Priority.LOW);
	
	private Priority priorityMessage;
	
	private MessageType(Priority priorityMessage) {
		this.priorityMessage = priorityMessage;
	}

	public Priority getPriority() {
		return this.priorityMessage; 
	}
}
