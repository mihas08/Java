package kontrolno1;

public class Computer {
	private String processor;
	private String RAMsize;

		  Computer() {
		    System.out.println("Constructor of Computer class."); }
		  Computer(String p,String ram){
			  processor=p; RAMsize=ram;
		  }
		  
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public String getRAMsize() {
		return RAMsize;
	}
	public void setRAMsize(String RAMsize) {
		RAMsize = RAMsize;
	}
	public String toString() {
        return "Computer [Procesor  " + getProcessor() +"RAMsize" +getRAMsize() +", toString()=" + super.toString() + "]";
    }
	 public boolean equals(Object obj) {
			
			return RAMsize.equals(((Computer)obj).RAMsize);
		}
	
}
