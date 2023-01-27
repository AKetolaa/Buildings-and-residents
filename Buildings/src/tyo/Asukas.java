package tyo;

public class Asukas {
	private String name;
	private String sAika;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null) {
			this.name=name;
		}	
	}
	public String getSAika() {
		return sAika;
	}
	public void setSAika(String sAika) {
		if (sAika!=null) {
			this.sAika=sAika;
		}
	}
	@Override
	public String toString() {
		return "Asukas [name=" + name + ", sAika=" + sAika + "]";
	}
	
	

}
