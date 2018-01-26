package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class R0150 {
	private String REG = "0150";
	private String COD_PART;
	private String NOME;
	private String COD_PAIS;
	private String CNPJ;
	private String CPF;
	private String NIT;
	private String UF;
	private String IE;
	private String IE_ST;
	private String COD_MUN;
	private String IM;
	private String SUFRAMA;

	private Collection listaR0180 = new ArrayList();

	public String getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}
	public String getCOD_MUN() {
		return COD_MUN;
	}
	public void setCOD_MUN(String cod_mun) {
		COD_MUN = cod_mun;
	}
	public String getCOD_PAIS() {
		return COD_PAIS;
	}
	public void setCOD_PAIS(String cod_pais) {
		COD_PAIS = cod_pais;
	}
	public String getCOD_PART() {
		return COD_PART;
	}
	public void setCOD_PART(String cod_part) {
		COD_PART = cod_part;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cpf) {
		CPF = cpf;
	}
	public String getIE() {
		return IE;
	}
	public void setIE(String ie) {
		IE = ie;
	}
	public String getIE_ST() {
		return IE_ST;
	}
	public void setIE_ST(String ie_st) {
		IE_ST = ie_st;
	}
	public String getIM() {
		return IM;
	}
	public void setIM(String im) {
		IM = im;
	}
	public String getNIT() {
		return NIT;
	}
	public void setNIT(String nit) {
		NIT = nit;
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
	public Collection getListaR0180() {
		return listaR0180;
	}
	public void setListaR0180(Collection listaR0180) {
		this.listaR0180 = listaR0180;
	}

}
