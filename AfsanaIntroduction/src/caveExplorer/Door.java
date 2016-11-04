package caveExplorer;

public class Door {
	private boolean open;
	private boolean locked;
	private String description;
	private String details;
	
	
	public Door(){
		open = true;
		locked = false;
		description = "passage";
		details = "";
	}
	public void setLock(boolean b){
		this.locked = b;
	}
	
	public boolean isLocked(){
		return locked;
	}

	public boolean isOpen() {
		return open;
	}
	
	public void setOpen(boolean open) {
		this.open = open;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setDetails(String details) {
		this.details = details;
	}
	public String getDescription() {
		return description;
	}
	public String getDetails() {
		return details;
	}
	public void setLocked(boolean locked) {
		this.locked = locked;
	}
}
