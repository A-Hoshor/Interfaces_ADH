
public class Process implements Comparable<Process>{

	private String processID;
	private int priority;
	
	public Process() {
		super();
		this.priority=1;
		this.processID = null;
	}//end empty argument constructor
	
	public Process(String processID, int priority) {
		super();
		this.processID = processID;
		this.priority = priority;
	}//end preferred argument constructor

	//Getters and Setters
	
	public int getPriority() {
		return priority;
	}//end getPriority

	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	public String getProcessID() {
		return processID;
	}//end getProcessID
	
	public void setProcessID(String processID) {
		if (this.processID != null) {
			return;
		}//end if
		else {
			this.processID = processID;
		}//end else
	}//end setProcessID

	public int compareTo(Process o) {
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

	@Override
	public String toString() {
		return "Process: ProcessID= " + processID + ", Priority= " + priority + "";
	}
	
	
	
	
}//end class
