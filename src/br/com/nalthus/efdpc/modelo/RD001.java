package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RD001 {

	private String REG = "D001";
	private String IND_MOV;

	private Collection listaRD010 = new ArrayList();

	public String getIND_MOV() {
		return IND_MOV;
	}

	public void setIND_MOV(String ind_mov) {
		IND_MOV = ind_mov;
	}

	public Collection getListaRD010() {
		return listaRD010;
	}

	public void setListaRD010(Collection listaRD010) {
		this.listaRD010 = listaRD010;
	}

	public String getREG() {
		return REG;
	}

	public void setREG(String reg) {
		REG = reg;
	}

}
