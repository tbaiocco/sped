package br.com.nalthus.sped.modelo;

public class RMI250 {

	private String REG = "I250";
	private String DT_RES;
	private String COD_GRP_CTA;
	private String VL_GRP_CTA;
	private String SLD_FIN; //D ou C

	public String getCOD_GRP_CTA() {
		return COD_GRP_CTA;
	}
	public void setCOD_GRP_CTA(String cod_grp_cta) {
		COD_GRP_CTA = cod_grp_cta;
	}
	public String getDT_RES() {
		return DT_RES;
	}
	public void setDT_RES(String dt_res) {
		DT_RES = dt_res;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getSLD_FIN() {
		return SLD_FIN;
	}
	public void setSLD_FIN(String sld_fin) {
		SLD_FIN = sld_fin;
	}
	public String getVL_GRP_CTA() {
		return VL_GRP_CTA;
	}
	public void setVL_GRP_CTA(String vl_grp_cta) {
		VL_GRP_CTA = vl_grp_cta;
	}

}
