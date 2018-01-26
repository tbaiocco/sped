package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RC010 {

	private String REG = "C010";
	private String CNPJ;
	private String IND_ESCRI = "";

	private Collection listaRC100 = new ArrayList();
	private Collection listaRC180 = new ArrayList();
	private Collection listaRC190 = new ArrayList();
	private Collection listaRC500 = new ArrayList();
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}
	public String getIND_ESCRI() {
		return IND_ESCRI;
	}
	public void setIND_ESCRI(String ind_escri) {
		IND_ESCRI = ind_escri;
	}
	public Collection getListaRC100() {
		return listaRC100;
	}
	public void setListaRC100(Collection listaRC100) {
		this.listaRC100 = listaRC100;
	}
	public Collection getListaRC180() {
		return listaRC180;
	}
	public void setListaRC180(Collection listaRC180) {
		this.listaRC180 = listaRC180;
	}
	public Collection getListaRC190() {
		return listaRC190;
	}
	public void setListaRC190(Collection listaRC190) {
		this.listaRC190 = listaRC190;
	}
	public Collection getListaRC500() {
		return listaRC500;
	}
	public void setListaRC500(Collection listaRC500) {
		this.listaRC500 = listaRC500;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}

}
