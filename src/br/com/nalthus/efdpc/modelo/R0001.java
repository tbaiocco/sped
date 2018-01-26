package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class R0001 {
	private String REG = "0001";
	private String IND_MOV;

	private R0110 r0110;

	private Collection listaR0100 = new ArrayList();
	private Collection listaR0140 = new ArrayList();
	private Collection listaR0500 = new ArrayList();
	private Collection listaR0600 = new ArrayList();

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
	public Collection getListaR0100() {
		return listaR0100;
	}
	public void setListaR0100(Collection listaR0100) {
		this.listaR0100 = listaR0100;
	}
	public Collection getListaR0140() {
		return listaR0140;
	}
	public void setListaR0140(Collection listaR0140) {
		this.listaR0140 = listaR0140;
	}
	public Collection getListaR0500() {
		return listaR0500;
	}
	public void setListaR0500(Collection listaR0500) {
		this.listaR0500 = listaR0500;
	}
	public Collection getListaR0600() {
		return listaR0600;
	}
	public void setListaR0600(Collection listaR0600) {
		this.listaR0600 = listaR0600;
	}
	public R0110 getR0110() {
		return r0110;
	}
	public void setR0110(R0110 r0110) {
		this.r0110 = r0110;
	}

}
