package br.com.nalthus.sped.modelo;

public class R0000 {
	private String REG = "0000";
	private String LECD = "LECD";
	private String DT_INI;
	private String DT_FIN;
	private String NOME;
	private String CNPJ;
	private String UF;
	private String IE;
	private String COD_MUN;
	private String IM;
	private String IND_SIT_ESP; //VER TAB. SPED

	private R0001 r0001;
	private R0990 r0990;

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
	public String getDT_FIN() {
		return DT_FIN;
	}
	public void setDT_FIN(String dt_fin) {
		DT_FIN = dt_fin;
	}
	public String getDT_INI() {
		return DT_INI;
	}
	public void setDT_INI(String dt_ini) {
		DT_INI = dt_ini;
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
	public String getIND_SIT_ESP() {
		return IND_SIT_ESP;
	}
	public void setIND_SIT_ESP(String ind_sit_esp) {
		IND_SIT_ESP = ind_sit_esp;
	}
	public String getLECD() {
		return LECD;
	}
	public void setLECD(String lecd) {
		LECD = lecd;
	}
	public String getNOME() {
		return NOME;
	}
	public void setNOME(String nome) {
		NOME = nome;
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
	public R0001 getR0001() {
		return r0001;
	}
	public void setR0001(R0001 r0001) {
		this.r0001 = r0001;
	}
	public R0990 getR0990() {
		return r0990;
	}
	public void setR0990(R0990 r0990) {
		this.r0990 = r0990;
	}

}
