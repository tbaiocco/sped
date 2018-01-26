package br.com.nalthus.efdpc.modelo;

public class R0000 {
	private String REG = "0000";
	private String COD_VER = "003"; //apartir de jul/12
	private String TIPO_ESCRIT = "0";
	private String IND_SIT_ESP = "0";
	private String NUM_REC_ANTERIOR = "";
	private String DT_INI;
	private String DT_FIN;
	private String NOME;
	private String CNPJ;
	private String UF;
	private String COD_MUN;
	private String SUFRAMA = "";
	private String IND_NAT_PJ = "00";
	private String IND_ATIV = "1";

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

	public String getCOD_VER() {
		return COD_VER;
	}

	public void setCOD_VER(String cod_ver) {
		COD_VER = cod_ver;
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

	public String getIND_ATIV() {
		return IND_ATIV;
	}

	public void setIND_ATIV(String ind_ativ) {
		IND_ATIV = ind_ativ;
	}

	public String getIND_NAT_PJ() {
		return IND_NAT_PJ;
	}

	public void setIND_NAT_PJ(String ind_nat_pj) {
		IND_NAT_PJ = ind_nat_pj;
	}

	public String getIND_SIT_ESP() {
		return IND_SIT_ESP;
	}

	public void setIND_SIT_ESP(String ind_sit_esp) {
		IND_SIT_ESP = ind_sit_esp;
	}

	public String getNOME() {
		return NOME;
	}

	public void setNOME(String nome) {
		NOME = nome;
	}

	public String getNUM_REC_ANTERIOR() {
		return NUM_REC_ANTERIOR;
	}

	public void setNUM_REC_ANTERIOR(String num_rec_anterior) {
		NUM_REC_ANTERIOR = num_rec_anterior;
	}

	public R0001 getR0001() {
		return r0001;
	}

	public void setR0001(R0001 r0001) {
		this.r0001 = r0001;
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

	public String getTIPO_ESCRIT() {
		return TIPO_ESCRIT;
	}

	public void setTIPO_ESCRIT(String tipo_escrit) {
		TIPO_ESCRIT = tipo_escrit;
	}

	public String getUF() {
		return UF;
	}

	public void setUF(String uf) {
		UF = uf;
	}

	public R0990 getR0990() {
		return r0990;
	}

	public void setR0990(R0990 r0990) {
		this.r0990 = r0990;
	}

}
