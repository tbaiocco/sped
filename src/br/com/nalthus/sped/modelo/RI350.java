package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RI350 {
	private String REG = "I350";
	private String DT_RES;

	private Collection rI355 = new ArrayList();

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
	public Collection getRI355() {
		return rI355;
	}
	public void setRI355(Collection ri355) {
		rI355 = ri355;
	}

}
