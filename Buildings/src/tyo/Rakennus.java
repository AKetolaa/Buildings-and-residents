package tyo;

public class Rakennus {
	private double pintaalaR; //rakennuksen pinta-ala
	private double huoneMaara;
	private Asukas asukas ;
	
	public double getPintaalaR() {
		return pintaalaR;
	}
	public void setPintaalaR(double pintaalaR) {
		if(pintaalaR>0) {
			this.pintaalaR = pintaalaR;
		}
	}
	public double getHuoneMaara() {
		return huoneMaara;
	}
	public void setHuoneMaara(double huoneMaara) {
		if (huoneMaara<0) {
			this.huoneMaara = huoneMaara;
		}
	}
	public String getName() {
		return asukas.getName();
	}
	public void setName(String name) {
		asukas.setName(name);
		}
	public String getSAika() {
		return asukas.getSAika();
	}
	public void setSAika(String sAika) {
		asukas.setSAika(sAika);
		}

	public Rakennus(double pintaalaR, double huoneMaara,String name,String sAika) {
		this.pintaalaR=pintaalaR;
		this.huoneMaara=huoneMaara;
		this.asukas= new Asukas();
		asukas.setName(name);
		asukas.setSAika(sAika);
		
	}
	@Override
	public String toString() {
		return "Rakennus [pintaalaR=" + pintaalaR + ", huoneMaara=" + huoneMaara + ", asukas=" + asukas + "]";
	}
	

}
