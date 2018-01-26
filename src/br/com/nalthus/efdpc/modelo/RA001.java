package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RA001 {

	private String REG = "A001";
	private String IND_MOV;

	private Collection listaRA010 = new ArrayList();

	public String getIND_MOV() {
		return IND_MOV;
	}

	public void setIND_MOV(String ind_mov) {
		IND_MOV = ind_mov;
	}

	public Collection getListaRA010() {
		return listaRA010;
	}

	public void setListaRA010(Collection ra010) {
		listaRA010 = ra010;
	}

	public String getREG() {
		return REG;
	}

	public void setREG(String reg) {
		REG = reg;
	}

}
