package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RI200 {
	private String REG = "I200";
	private String NUM_LCTO;
	private String DT_LCTO;
	private String VL_LCTO;
	private String IND_LCTO; // N-NORMAL e E-ENCERRAMENTO DE CTAS RESULTADO

	private Collection rI250 = new ArrayList();

	public String getDT_LCTO() {
		return DT_LCTO;
	}
	public void setDT_LCTO(String dt_lcto) {
		DT_LCTO = dt_lcto;
	}
	public String getIND_LCTO() {
		return IND_LCTO;
	}
	public void setIND_LCTO(String ind_lcto) {
		IND_LCTO = ind_lcto;
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
	public String getVL_LCTO() {
		return VL_LCTO;
	}
	public void setVL_LCTO(String vl_lcto) {
		VL_LCTO = vl_lcto;
	}
	public Collection getRI250() {
		return rI250;
	}
	public void setRI250(Collection ri250) {
		rI250 = ri250;
	}

}
