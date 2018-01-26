package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class R9001 {
	private String REG = "9001";
	private String IND_MOV;

	private Collection r9900 = new ArrayList();

	public String getIND_MOV() {
		return IND_MOV;
	}
	public void setIND_MOV(String ind_dad) {
		IND_MOV = ind_dad;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getR9900() {
		return r9900;
	}
	public void setR9900(Collection r9900) {
		this.r9900 = r9900;
	}

}
