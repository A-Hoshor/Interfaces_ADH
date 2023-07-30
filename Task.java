
public class Task implements Priority, Comparable<Task> {
	
	private String name;
	private int priority;
	Status status;
	
	public Task() {
		this.name="";
		this.priority=0;
	}//end empty argument constructor
	
	public Task(String name, int priority, Status status) {
		this.name=name;
		this.priority=priority;
		this.status=status;
	}//end preferred argument constructor

	@Override
	public int getPriority() {
		return priority;
	}//end getPriority

	@Override
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	public String getName() {
		return name;
	}//end get Name

	public void setName(String name) {
		this.name = name;
	}//end set name

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	public String toString() {
		return "Task: " + name + " Priority: " + priority + " Status: " + status;
	}//end toString

	public int compareTo(Task o) {
			int result=0;
			if (this.priority == o.getPriority()) {
				result =0;
			}//end if
			else if (this.priority < o.getPriority()) {
				result= -1;
			}//end else if
			else if (this.priority > o.getPriority()) {
				result = 1;
			}//end else
			return result;
			}//end compareTo

	
}//end class
