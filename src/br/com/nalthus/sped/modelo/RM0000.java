package br.com.nalthus.sped.modelo;

public class RM0000 {

	private String REG = "0000";
	private String NOME;
	private String CNPJ;
	private String CPF;
	private String CEI;
	private String NIT;
	private String UF;
	private String IE;
	private String COD_MUN;
	private String IM;
	private String SUFRAMA;
	private String IND_CENTR = "1";
	private String DT_INI;
	private String DT_FIN;
	private String COD_VER = "003";
	private String COD_FIN = "61";
	private String IND_ED = "2";

	private RM0001 rm0001;
	private RM0990 rm0990;

	public String getCEI() {
		return CEI;
	}
	public void setCEI(String cei) {
		CEI = cei;
	}
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
	public String getIND_CENTR() {
		return IND_CENTR;
	}
	public void setIND_CENTR(String ind_centr) {
		IND_CENTR = ind_centr;
	}
	public String getIND_ED() {
		return IND_ED;
	}
	public void setIND_ED(String ind_ed) {
		IND_ED = ind_ed;
	}
	public String getNIT() {
		return NIT;
	}
	public void setNIT(String nit) {
		NIT = nit;
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
	public RM0001 getRm0001() {
		return rm0001;
	}
	public void setRm0001(RM0001 rm0001) {
		this.rm0001 = rm0001;
	}
	public RM0990 getRm0990() {
		return rm0990;
	}
	public void setRm0990(RM0990 rm0990) {
		this.rm0990 = rm0990;
	}


}
