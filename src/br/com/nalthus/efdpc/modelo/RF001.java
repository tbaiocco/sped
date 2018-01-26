package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RF001 {

	private String REG = "F001";
	private String IND_MOV = "1";

	private Collection listaRF010 = new ArrayList();

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
	public Collection getListaRF010() {
		return listaRF010;
	}
	public void setListaRF010(Collection listaRF010) {
		this.listaRF010 = listaRF010;
	}

}
