package br.com.nalthus.efd.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RD001 {

	private String REG = "D001";
	private String IND_MOV;

	private Collection listaRD100 = new ArrayList();
	private Collection listaRD500 = new ArrayList();

	public String getIND_MOV() {
		return IND_MOV;
	}

	public void setIND_MOV(String ind_mov) {
		IND_MOV = ind_mov;
	}

	public String getREG() {
		return REG;
	}

	public void setREG(String reg) {
		REG = reg;
	}

	public Collection getListaRD100() {
		return listaRD100;
	}

	public void setListaRD100(Collection listaRD100) {
		this.listaRD100 = listaRD100;
	}

	public Collection getListaRD500() {
		return listaRD500;
	}

	public void setListaRD500(Collection listaRD500) {
		this.listaRD500 = listaRD500;
	}

}
