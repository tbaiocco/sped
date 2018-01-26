package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class R0140 {
	private String REG = "0140";
	private String COD_EST;
	private String NOME;
	private String CNPJ;
	private String UF;
	private String IE;
	private String COD_MUN;
	private String IM;
	private String SUFRAMA;

	private Collection listaR0150 = new ArrayList();
	private Collection listaR0190 = new ArrayList();
	private Collection listaR0200 = new ArrayList();
	private Collection listaR0400 = new ArrayList();
	private Collection listaR0450 = new ArrayList();
	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}
	public String getCOD_EST() {
		return COD_EST;
	}
	public void setCOD_EST(String cod_est) {
		COD_EST = cod_est;
	}
	public String getCOD_MUN() {
		return COD_MUN;
	}
	public void setCOD_MUN(String cod_mun) {
		COD_MUN = cod_mun;
	}
	public String getIE() {
		return IE;
	}
	public void setIE(String ie) {
		IE = ie;
	}
	public String getIM() {
		return IM;
	}
	public void setIM(String im) {
		IM = im;
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
	public String getNOME() {
		return NOME;
	}
	public void setNOME(String nome) {
		NOME = nome;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getSUFRAMA() {
		return SUFRAMA;
	}
	public void setSUFRAMA(String suframa) {
		SUFRAMA = suframa;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uf) {
		UF = uf;
	}

}
