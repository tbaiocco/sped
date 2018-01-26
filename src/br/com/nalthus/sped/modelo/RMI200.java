package br.com.nalthus.sped.modelo;

public class RMI200 {

	private String REG = "I200";
	private String DT_LCTO;
	private String COD_CTA;
	private String COD_CCUS;
	private String COD_CP;
	private String VL_DEB_CRED;
	private String IND_DEB_CRED;
	private String NUM_ARQ;
	private String NUM_LCTO;
	private String IND_LCTO; // N-NORMAL e E-ENCERRAMENTO DE CTAS RESULTADO
	private String HIST_LCTO;

	public String getCOD_CCUS() {
		return COD_CCUS;
	}
	public void setCOD_CCUS(String cod_ccus) {
		COD_CCUS = cod_ccus;
	}
	public String getCOD_CP() {
		return COD_CP;
	}
	public void setCOD_CP(String cod_cp) {
		COD_CP = cod_cp;
	}
	public String getCOD_CTA() {
		return COD_CTA;
	}
	public void setCOD_CTA(String cod_cta) {
		COD_CTA = cod_cta;
	}
	public String getDT_LCTO() {
		return DT_LCTO;
	}
	public void setDT_LCTO(String dt_lcto) {
		DT_LCTO = dt_lcto;
	}
	public String getHIST_LCTO() {
		return HIST_LCTO;
	}
	public void setHIST_LCTO(String hist_lcto) {
		HIST_LCTO = hist_lcto;
	}
	public String getIND_DEB_CRED() {
		return IND_DEB_CRED;
	}
	public void setIND_DEB_CRED(String ind_deb_cred) {
		IND_DEB_CRED = ind_deb_cred;
	}
	public String getIND_LCTO() {
		return IND_LCTO;
	}
	public void setIND_LCTO(String ind_lcto) {
		IND_LCTO = ind_lcto;
	}
	public String getNUM_ARQ() {
		return NUM_ARQ;
	}
	public void setNUM_ARQ(String num_arq) {
		NUM_ARQ = num_arq;
	}
	public String getNUM_LCTO() {
		return NUM_LCTO;
	}
	public void setNUM_LCTO(String num_lcto) {
		NUM_LCTO = num_lcto;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getVL_DEB_CRED() {
		return VL_DEB_CRED;
	}
	public void setVL_DEB_CRED(String vl_deb_cred) {
		VL_DEB_CRED = vl_deb_cred;
	}

}
