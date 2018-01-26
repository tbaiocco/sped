package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class R0001 {
	private String REG = "0001";
	private String IND_DAD;

	private Collection listaR0007 = new ArrayList();
	private Collection listaR0020 = new ArrayList();
	private Collection listaR0150 = new ArrayList();

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
	public Collection getListaR0007() {
		return listaR0007;
	}
	public void setListaR0007(Collection listaR0007) {
		this.listaR0007 = listaR0007;
	}
	public Collection getListaR0020() {
		return listaR0020;
	}
	public void setListaR0020(Collection listaR0020) {
		this.listaR0020 = listaR0020;
	}
	public Collection getListaR0150() {
		return listaR0150;
	}
	public void setListaR0150(Collection listaR0150) {
		this.listaR0150 = listaR0150;
	}

}
