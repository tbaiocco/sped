package br.com.nalthus.sped.modelo;

public class RMI150 {

	private String REG = "I150";
	private String COD_CTA;
	private String COMP_SALDO;
	private String VL_SLD_INI;
	private String IND_DC_INI;
	private String VL_DEB;
	private String VL_CRED;
	private String VL_SLD_FIN;
	private String IND_DC_FIN;

	public String getCOD_CTA() {
		return COD_CTA;
	}
	public void setCOD_CTA(String cod_cta) {
		COD_CTA = cod_cta;
	}
	public String getCOMP_SALDO() {
		return COMP_SALDO;
	}
	public void setCOMP_SALDO(String comp_saldo) {
		COMP_SALDO = comp_saldo;
	}
	public String getIND_DC_FIN() {
		return IND_DC_FIN;
	}
	public void setIND_DC_FIN(String ind_dc_fin) {
		IND_DC_FIN = ind_dc_fin;
	}
	public String getIND_DC_INI() {
		return IND_DC_INI;
	}
	public void setIND_DC_INI(String ind_dc_ini) {
		IND_DC_INI = ind_dc_ini;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getVL_CRED() {
		return VL_CRED;
	}
	public void setVL_CRED(String vl_cred) {
		VL_CRED = vl_cred;
	}
	public String getVL_DEB() {
		return VL_DEB;
	}
	public void setVL_DEB(String vl_deb) {
		VL_DEB = vl_deb;
	}
	public String getVL_SLD_FIN() {
		return VL_SLD_FIN;
	}
	public void setVL_SLD_FIN(String vl_sld_fin) {
		VL_SLD_FIN = vl_sld_fin;
	}
	public String getVL_SLD_INI() {
		return VL_SLD_INI;
	}
	public void setVL_SLD_INI(String vl_sld_ini) {
		VL_SLD_INI = vl_sld_ini;
	}

}
