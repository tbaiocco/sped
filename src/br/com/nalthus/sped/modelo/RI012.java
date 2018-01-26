package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RI012 {
	private String REG = "I012";
	private String NUM_ORD;
	private String NAT_LIVR;
	private String TIPO;
	private String COD_HASH_AUX;

	private Collection rI015 = new ArrayList();

	public String getCOD_HASH_AUX() {
		return COD_HASH_AUX;
	}
	public void setCOD_HASH_AUX(String cod_hash_aux) {
		COD_HASH_AUX = cod_hash_aux;
	}
	public String getNAT_LIVR() {
		return NAT_LIVR;
	}
	public void setNAT_LIVR(String nat_livr) {
		NAT_LIVR = nat_livr;
	}
	public String getNUM_ORD() {
		return NUM_ORD;
	}
	public void setNUM_ORD(String num_ord) {
		NUM_ORD = num_ord;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getTIPO() {
		return TIPO;
	}
	public void setTIPO(String tipo) {
		TIPO = tipo;
	}
	public Collection getRI015() {
		return rI015;
	}
	public void setRI015(Collection ri015) {
		rI015 = ri015;
	}

}
