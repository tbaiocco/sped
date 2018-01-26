package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RJ005 {
	private String REG = "J005";
	private String DT_INI;
	private String DT_FIN;
	private String ID_DEM;
	private String CAB_DEM;

	private Collection rJ100 = new ArrayList();
	private Collection rJ150 = new ArrayList();
	private Collection rJ800 = new ArrayList();

	public String getCAB_DEM() {
		return CAB_DEM;
	}
	public void setCAB_DEM(String cab_dem) {
		CAB_DEM = cab_dem;
	}
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
	public String getID_DEM() {
		return ID_DEM;
	}
	public void setID_DEM(String id_dem) {
		ID_DEM = id_dem;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getRJ100() {
		return rJ100;
	}
	public void setRJ100(Collection rj100) {
		rJ100 = rj100;
	}
	public Collection getRJ150() {
		return rJ150;
	}
	public void setRJ150(Collection rj150) {
		rJ150 = rj150;
	}
	public Collection getRJ800() {
		return rJ800;
	}
	public void setRJ800(Collection rj800) {
		rJ800 = rj800;
	}

}
