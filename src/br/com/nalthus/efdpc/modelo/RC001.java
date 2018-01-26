package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RC001 {

	private String REG = "C001";
	private String IND_MOV;

	private Collection listaRC010 = new ArrayList();

	public String getIND_MOV() {
		return IND_MOV;
	}

	public void setIND_MOV(String ind_mov) {
		IND_MOV = ind_mov;
	}

	public Collection getListaRC010() {
		return listaRC010;
	}

	public void setListaRC010(Collection listaRC010) {
		this.listaRC010 = listaRC010;
	}

	public String getREG() {
		return REG;
	}

	public void setREG(String reg) {
		REG = reg;
	}

}
