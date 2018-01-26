package br.com.nalthus.efd.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RC001 {

	private String REG = "C001";
	private String IND_MOV;

	private Collection listaRC100 = new ArrayList();
	private Collection listaRC500 = new ArrayList();

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

	public Collection getListaRC100() {
		return listaRC100;
	}

	public void setListaRC100(Collection listaRC100) {
		this.listaRC100 = listaRC100;
	}

	public Collection getListaRC500() {
		return listaRC500;
	}

	public void setListaRC500(Collection listaRC500) {
		this.listaRC500 = listaRC500;
	}

}
