package tyo;

public class Tontti {
	private String nimi;
	private String sijainti;
	private double pintaala; //pinta-ala
	private Rakennus rakennus;
	
	public Tontti(String nimi, String sijainti, double pintaala,double pintaalaR, double huoneMaara,String name,String sAika) {
		this.nimi=nimi;
		this.sijainti=sijainti;
		this.pintaala=pintaala;
		rakennus = new Rakennus(pintaalaR, huoneMaara, name, sAika);
		
	}


	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getSijainti() {
		return sijainti;
	}
	public void setSijainti(String sijainti) {
		this.sijainti = sijainti;
	}
	public double getPintaala() {
		return pintaala;
	}
	public void setPintaala(double pintaala) {
		if (pintaala>0) {
			this.pintaala = pintaala;
		}
	}
	public Rakennus getRakennus() {
		return rakennus;
	}
	public void setRakennus(Rakennus rakennus) {
		this.rakennus = rakennus;
	}


	@Override
	public String toString() {
		return "Tontti [nimi=" + nimi + ", sijainti=" + sijainti + ", pintaala=" + pintaala + ", rakennus=" + rakennus
				+ "]";
	}

}	
