package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RM0001 {
	private String REG = "0001";
	private String IND_DAD;

	private Collection listaRM0050 = new ArrayList();
	private Collection listaRM0100 = new ArrayList();

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
	public Collection getListaRM0050() {
		return listaRM0050;
	}
	public void setListaRM0050(Collection listaRM0050) {
		this.listaRM0050 = listaRM0050;
	}
	public Collection getListaRM0100() {
		return listaRM0100;
	}
	public void setListaRM0100(Collection listaRM0100) {
		this.listaRM0100 = listaRM0100;
	}


}
