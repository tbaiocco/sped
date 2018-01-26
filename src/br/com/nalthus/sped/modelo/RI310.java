package br.com.nalthus.sped.modelo;

public class RI310 {
	private String REG = "I310";
	private String COD_CTA;
	private String COD_CCUS;
	private String VAL_DEBD;
	private String VAL_CRED;
	public String getCOD_CCUS() {
		return COD_CCUS;
	}
	public void setCOD_CCUS(String cod_ccus) {
		COD_CCUS = cod_ccus;
	}
	public String getCOD_CTA() {
		return COD_CTA;
	}
	public void setCOD_CTA(String cod_cta) {
		COD_CTA = cod_cta;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getVAL_CRED() {
		return VAL_CRED;
	}
	public void setVAL_CRED(String val_cred) {
		VAL_CRED = val_cred;
	}
	public String getVAL_DEBD() {
		return VAL_DEBD;
	}
	public void setVAL_DEBD(String val_debd) {
		VAL_DEBD = val_debd;
	}

}
