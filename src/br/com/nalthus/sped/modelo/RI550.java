package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RI550 {
	private String REG = "I550";
	private Collection RZ_CONT; //lista com DetRI510

	private Collection rI555 = new ArrayList();

	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getRZ_CONT() {
		return RZ_CONT;
	}
	public void setRZ_CONT(Collection rz_cont) {
		RZ_CONT = rz_cont;
	}
	public Collection getRI555() {
		return rI555;
	}
	public void setRI555(Collection ri555) {
		rI555 = ri555;
	}

}
