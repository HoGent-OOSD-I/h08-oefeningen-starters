package domein;

public class OccasieWagen {

	private final String merk;
	private double kilometerstand;
	private final int aantalDeuren;
	
	private static final int MIN_LENGTE_MERK = 3;
	private static final int MIN_AANTALDEUREN = 2;
	private static final int MAX_AANTALDEUREN = 4;
	private static final double MIN_KILOMETERSTAND = 0.0;
	private static final double MAX_KILOMETERSTAND = 200000.0;

	public OccasieWagen(String merk, double kilometerstand, int aantalDeuren) {
		// TODO
		throw new UnsupportedOperationException();
	}

	private void controleerAantalDeuren(int aantalDeuren) {
		// TODO
		throw new UnsupportedOperationException();
	}

	private void controleerMerk(String merk) {
		// TODO
		throw new UnsupportedOperationException();
	}

	//Afspraak: foutboodschap met 1 cijfer na de komma afbeelden
	private final void setKilometerstand(double kilometerstand) {
		// TODO
		throw new UnsupportedOperationException();
	}

	public String getMerk() {
		return merk;
	}
	public double getKilometerstand() {
		return kilometerstand;
	}
	public int getAantalDeuren() {
		return aantalDeuren;
	}



}