package br.com.nalthus.sped.modelo;

public class R0020 {
	private String REG = "0020";
	private String IND_DEC; //0-MATRIZ e 1-FILIAL
	private String CNPJ;
	private String UF;
	private String IE;
	private String COD_MUN;
	private String IM;
	private String NIRE;
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}
	public String getCOD_MUN() {
		return COD_MUN;
	}
	public void setCOD_MUN(String cod_mun) {
		COD_MUN = cod_mun;
	}
	public String getIE() {
		return IE;
	}
	public void setIE(String ie) {
		IE = ie;
	}
	public String getIM() {
		return IM;
	}
	public void setIM(String im) {
		IM = im;
	}
	public String getIND_DEC() {
		return IND_DEC;
	}
	public void setIND_DEC(String ind_dec) {
		IND_DEC = ind_dec;
	}
	public String getNIRE() {
		return NIRE;
	}
	public void setNIRE(String nire) {
		NIRE = nire;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uf) {
		UF = uf;
	}

}
