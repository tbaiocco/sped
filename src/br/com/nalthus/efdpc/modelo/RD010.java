package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RD010 {

	private String REG = "D010";
	private String CNPJ;

	private Collection listaRD200 = new ArrayList();
	private Collection listaRD500 = new ArrayList();
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}
	public Collection getListaRD200() {
		return listaRD200;
	}
	public void setListaRD200(Collection listaRD200) {
		this.listaRD200 = listaRD200;
	}
	public Collection getListaRD500() {
		return listaRD500;
	}
	public void setListaRD500(Collection listaRD500) {
		this.listaRD500 = listaRD500;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}

}
