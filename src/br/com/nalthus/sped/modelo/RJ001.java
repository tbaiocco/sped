package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RJ001 {
	private String REG = "J001";
	private String IND_DAD;

	private Collection rJ005 = new ArrayList();
	private RJ900 rJ900;

	public String getIND_DAD() {
		return IND_DAD;
	}
	public void setIND_DAD(String ind_dad) {
		IND_DAD = ind_dad;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getRJ005() {
		return rJ005;
	}
	public void setRJ005(Collection rj005) {
		rJ005 = rj005;
	}
	public RJ900 getRJ900() {
		return rJ900;
	}
	public void setRJ900(RJ900 rj900) {
		rJ900 = rj900;
	}

}
