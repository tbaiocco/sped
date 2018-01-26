package br.com.nalthus.sped.modelo;

import java.util.Collection;

public class RI555 {
	private String REG = "I555";
	private Collection RZ_CONT_TOT; //lista com DetRI510
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getRZ_CONT_TOT() {
		return RZ_CONT_TOT;
	}
	public void setRZ_CONT_TOT(Collection rz_cont_tot) {
		RZ_CONT_TOT = rz_cont_tot;
	}

}
