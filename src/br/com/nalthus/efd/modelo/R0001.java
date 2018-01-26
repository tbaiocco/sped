package br.com.nalthus.efd.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class R0001 {
	private String REG = "0001";
	private String IND_MOV;

	private R0100 r0100;
	private R0005 r0005;

	private Collection listaR0150 = new ArrayList();
	private Collection listaR0190 = new ArrayList();
	private Collection listaR0200 = new ArrayList();
	private Collection listaR0300 = new ArrayList();
	private Collection listaR0400 = new ArrayList();
	private Collection listaR0450 = new ArrayList();
	private Collection listaR0460 = new ArrayList();
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
	public Collection getListaR0150() {
		return listaR0150;
	}
	public void setListaR0150(Collection listaR0150) {
		this.listaR0150 = listaR0150;
	}
	public Collection getListaR0190() {
		return listaR0190;
	}
	public void setListaR0190(Collection listaR0190) {
		this.listaR0190 = listaR0190;
	}
	public Collection getListaR0200() {
		return listaR0200;
	}
	public void setListaR0200(Collection listaR0200) {
		this.listaR0200 = listaR0200;
	}
	public Collection getListaR0400() {
		return listaR0400;
	}
	public void setListaR0400(Collection listaR0400) {
		this.listaR0400 = listaR0400;
	}
	public Collection getListaR0450() {
		return listaR0450;
	}
	public void setListaR0450(Collection listaR0450) {
		this.listaR0450 = listaR0450;
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
	public R0005 getR0005() {
		return r0005;
	}
	public void setR0005(R0005 r0005) {
		this.r0005 = r0005;
	}
	public R0100 getR0100() {
		return r0100;
	}
	public void setR0100(R0100 r0100) {
		this.r0100 = r0100;
	}
	public Collection getListaR0300() {
		return listaR0300;
	}
	public void setListaR0300(Collection listaR0300) {
		this.listaR0300 = listaR0300;
	}
	public Collection getListaR0460() {
		return listaR0460;
	}
	public void setListaR0460(Collection listaR0460) {
		this.listaR0460 = listaR0460;
	}

}
