package domein;

public class Kluis {
    private final String code;

    public Kluis(String code) {
        controleerCode(code);
        this.code = code;
    }

    private void controleerCode(String code) {
        if (code == null)
            throw new IllegalArgumentException("De code mag niet leeg zijn.");
        if (code.length() != 4)
            throw new IllegalArgumentException("De code moet uit exact 4 karakters bestaan.");
        for (int teller = 0; teller < code.length(); teller++)
            if (code.charAt(teller)<'0' || code.charAt(teller)>'9')
                throw new IllegalArgumentException("De code bevat een teken dat geen cijfer is.");
        if (code.charAt(0) == code.charAt(1) && code.charAt(1) == code.charAt(2) && code.charAt(2) == code.charAt(3) )
            throw new IllegalArgumentException("De code mag niet uit 4 gelijke cijfers bestaan");
    }

    public boolean valideerCode(String code) {
//		if (code == null)
//			return false;
//		return code.equals(this.code);

        return this.code.equals(code);
    }

    public String getCode() {
        return code;
    }
}
