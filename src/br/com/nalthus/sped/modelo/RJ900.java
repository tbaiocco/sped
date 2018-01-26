package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RJ900 {
	private String REG = "J900";
	private String DNRC_ENCER = "TERMO DE ENCERRAMENTO";
	private String NUM_ORD;
	private String NAT_LIVR;
	private String NOME;
	private String QTD_LIN;
	private String DT_INI_ESCR;
	private String DT_FIN_ESCR;

	private Collection rJ930 = new ArrayList();

	public String getDNRC_ENCER() {
		return DNRC_ENCER;
	}
	public void setDNRC_ENCER(String dnrc_encer) {
		DNRC_ENCER = dnrc_encer;
	}
	public String getDT_FIN_ESCR() {
		return DT_FIN_ESCR;
	}
	public void setDT_FIN_ESCR(String dt_fin_escr) {
		DT_FIN_ESCR = dt_fin_escr;
	}
	public String getDT_INI_ESCR() {
		return DT_INI_ESCR;
	}
	public void setDT_INI_ESCR(String dt_ini_escr) {
		DT_INI_ESCR = dt_ini_escr;
	}
	public String getNAT_LIVR() {
		return NAT_LIVR;
	}
	public void setNAT_LIVR(String nat_livr) {
		NAT_LIVR = nat_livr;
	}
	public String getNOME() {
		return NOME;
	}
	public void setNOME(String nome) {
		NOME = nome;
	}
	public String getNUM_ORD() {
		return NUM_ORD;
	}
	public void setNUM_ORD(String num_ord) {
		NUM_ORD = num_ord;
	}
	public String getQTD_LIN() {
		return QTD_LIN;
	}
	public void setQTD_LIN(String qtd_lin) {
		QTD_LIN = qtd_lin;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getRJ930() {
		return rJ930;
	}
	public void setRJ930(Collection rj930) {
		rJ930 = rj930;
	}

}
