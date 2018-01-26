package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RF010 {

	private String REG = "F010";
	private String CNPJ;

	private Collection listaRF100 = new ArrayList();
	private Collection listaRF120 = new ArrayList();
	private Collection listaRF130 = new ArrayList();

	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getListaRF100() {
		return listaRF100;
	}
	public void setListaRF100(Collection listaRF100) {
		this.listaRF100 = listaRF100;
	}
	public Collection getListaRF120() {
		return listaRF120;
	}
	public void setListaRF120(Collection listaRF120) {
		this.listaRF120 = listaRF120;
	}
	public Collection getListaRF130() {
		return listaRF130;
	}
	public void setListaRF130(Collection listaRF130) {
		this.listaRF130 = listaRF130;
	}

}
