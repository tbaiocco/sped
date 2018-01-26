package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RI150 {
	private String REG = "I150";
	private String DT_INI;
	private String DT_FIN;

	private Collection rI151 = new ArrayList();
	private Collection rI155 = new ArrayList();

	public String getDT_FIN() {
		return DT_FIN;
	}
	public void setDT_FIN(String dt_fin) {
		DT_FIN = dt_fin;
	}
	public String getDT_INI() {
		return DT_INI;
	}
	public void setDT_INI(String dt_ini) {
		DT_INI = dt_ini;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getRI155() {
		return rI155;
	}
	public void setRI155(Collection ri155) {
		rI155 = ri155;
	}
	public Collection getRI151() {
		return rI151;
	}
	public void setRI151(Collection ri151) {
		rI151 = ri151;
	}

}
