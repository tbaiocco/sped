package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RI300 {
	private String REG = "I300";
	private String DT_BCTE;

	private Collection rI310 = new ArrayList();

	public String getDT_BCTE() {
		return DT_BCTE;
	}
	public void setDT_BCTE(String dt_bcte) {
		DT_BCTE = dt_bcte;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getRI310() {
		return rI310;
	}
	public void setRI310(Collection ri310) {
		rI310 = ri310;
	}

}
