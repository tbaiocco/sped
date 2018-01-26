package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RI050 {
	private String REG = "I050";
	private String DT_ALT;
	private String COD_NAT;
	private String IND_CTA; //S-SINTETICA e A-ANALITICA
	private String NIVEL;
	private String COD_CTA;
	private String COD_CTA_SUP;
	private String CTA;

	private Collection rI051 = new ArrayList();
	private Collection rI052 = new ArrayList();

	public String getCOD_CTA() {
		return COD_CTA;
	}
	public void setCOD_CTA(String cod_cta) {
		COD_CTA = cod_cta;
	}
	public String getCOD_CTA_SUP() {
		return COD_CTA_SUP;
	}
	public void setCOD_CTA_SUP(String cod_cta_sup) {
		COD_CTA_SUP = cod_cta_sup;
	}
	public String getCOD_NAT() {
		return COD_NAT;
	}
	public void setCOD_NAT(String cod_nat) {
		COD_NAT = cod_nat;
	}
	public String getCTA() {
		return CTA;
	}
	public void setCTA(String cta) {
		CTA = cta;
	}
	public String getDT_ALT() {
		return DT_ALT;
	}
	public void setDT_ALT(String dt_alt) {
		DT_ALT = dt_alt;
	}
	public String getIND_CTA() {
		return IND_CTA;
	}
	public void setIND_CTA(String ind_cta) {
		IND_CTA = ind_cta;
	}
	public String getNIVEL() {
		return NIVEL;
	}
	public void setNIVEL(String nivel) {
		NIVEL = nivel;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getRI051() {
		return rI051;
	}
	public void setRI051(Collection ri051) {
		rI051 = ri051;
	}
	public Collection getRI052() {
		return rI052;
	}
	public void setRI052(Collection ri052) {
		rI052 = ri052;
	}

}
