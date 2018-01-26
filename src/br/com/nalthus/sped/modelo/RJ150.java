package br.com.nalthus.sped.modelo;

public class RJ150 {
	private String REG = "J150";
	private String COD_AGL;
	private String NIVEL_AGL;
	private String DESCR_COD_AGL;
	private String VL_CTA;
	private String IND_VL;

	public String getCOD_AGL() {
		return COD_AGL;
	}
	public void setCOD_AGL(String cod_agl) {
		COD_AGL = cod_agl;
	}
	public String getDESCR_COD_AGL() {
		return DESCR_COD_AGL;
	}
	public void setDESCR_COD_AGL(String descr_cod_agl) {
		DESCR_COD_AGL = descr_cod_agl;
	}
	public String getIND_VL() {
		return IND_VL;
	}
	public void setIND_VL(String ind_vl) {
		IND_VL = ind_vl;
	}
	public String getNIVEL_AGL() {
		return NIVEL_AGL;
	}
	public void setNIVEL_AGL(String nivel_agl) {
		NIVEL_AGL = nivel_agl;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getVL_CTA() {
		return VL_CTA;
	}
	public void setVL_CTA(String vl_cta) {
		VL_CTA = vl_cta;
	}

}
