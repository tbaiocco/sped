package br.com.nalthus.efd.modelo;

public class R0000 {
	private String REG = "0000";
	private String COD_VER = "006";
	private String COD_FIN = "0";
	private String DT_INI;
	private String DT_FIN;
	private String NOME;
	private String CNPJ;
	private String CPF;
	private String UF;
	private String IE = "";
	private String COD_MUN;
	private String IM = "";
	private String SUFRAMA = "";
	private String IND_PERFIL = "A";
	private String IND_ATIV = "1";

	private R0001 r0001;
	private R0990 r0990;

	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}
	public String getCOD_FIN() {
		return COD_FIN;
	}
	public void setCOD_FIN(String cod_fin) {
		COD_FIN = cod_fin;
	}
	public String getCOD_MUN() {
		return COD_MUN;
	}
	public void setCOD_MUN(String cod_mun) {
		COD_MUN = cod_mun;
	}
	public String getCOD_VER() {
		return COD_VER;
	}
	public void setCOD_VER(String cod_ver) {
		COD_VER = cod_ver;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		CPF = cpf;
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
	public String getIND_ATIV() {
		return IND_ATIV;
	}
	public void setIND_ATIV(String ind_ativ) {
		IND_ATIV = ind_ativ;
	}
	public String getIND_PERFIL() {
		return IND_PERFIL;
	}
	public void setIND_PERFIL(String ind_perfil) {
		IND_PERFIL = ind_perfil;
	}
	public String getNOME() {
		return NOME;
	}
	public void setNOME(String nome) {
		NOME = nome;
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
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getSUFRAMA() {
		return SUFRAMA;
	}
	public void setSUFRAMA(String suframa) {
		SUFRAMA = suframa;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uf) {
		UF = uf;
	}


}
