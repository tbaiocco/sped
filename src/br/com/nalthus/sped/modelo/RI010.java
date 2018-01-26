package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RI010 {
	private String REG = "I010";
	private String IND_ESC;
	private String COD_VER_LC = "1.00";

	private Collection rI012 = new ArrayList();
	private Collection rI020 = new ArrayList();
	private RI030 rI030;
	private Collection rI050 = new ArrayList();
	private Collection rI075 = new ArrayList();
	private Collection rI100 = new ArrayList();
	private Collection rI150 = new ArrayList();
	private Collection rI200 = new ArrayList();
	private Collection rI300 = new ArrayList();
	private Collection rI350 = new ArrayList();
	private RI500 rI500;
	private Collection rI510 = new ArrayList();
	private Collection rI550 = new ArrayList();

	public String getCOD_VER_LC() {
		return COD_VER_LC;
	}
	public void setCOD_VER_LC(String cod_ver_lc) {
		COD_VER_LC = cod_ver_lc;
	}
	public String getIND_ESC() {
		return IND_ESC;
	}
	public void setIND_ESC(String ind_esc) {
		IND_ESC = ind_esc;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public Collection getRI012() {
		return rI012;
	}
	public void setRI012(Collection ri012) {
		rI012 = ri012;
	}
	public Collection getRI020() {
		return rI020;
	}
	public void setRI020(Collection ri020) {
		rI020 = ri020;
	}
	public RI030 getRI030() {
		return rI030;
	}
	public void setRI030(RI030 ri030) {
		rI030 = ri030;
	}
	public Collection getRI050() {
		return rI050;
	}
	public void setRI050(Collection ri050) {
		rI050 = ri050;
	}
	public Collection getRI075() {
		return rI075;
	}
	public void setRI075(Collection ri075) {
		rI075 = ri075;
	}
	public Collection getRI100() {
		return rI100;
	}
	public void setRI100(Collection ri100) {
		rI100 = ri100;
	}
	public Collection getRI150() {
		return rI150;
	}
	public void setRI150(Collection ri150) {
		rI150 = ri150;
	}
	public Collection getRI200() {
		return rI200;
	}
	public void setRI200(Collection ri200) {
		rI200 = ri200;
	}
	public Collection getRI300() {
		return rI300;
	}
	public void setRI300(Collection ri300) {
		rI300 = ri300;
	}
	public Collection getRI350() {
		return rI350;
	}
	public void setRI350(Collection ri350) {
		rI350 = ri350;
	}
	public RI500 getRI500() {
		return rI500;
	}
	public void setRI500(RI500 ri500) {
		rI500 = ri500;
	}
	public Collection getRI510() {
		return rI510;
	}
	public void setRI510(Collection ri510) {
		rI510 = ri510;
	}
	public Collection getRI550() {
		return rI550;
	}
	public void setRI550(Collection ri550) {
		rI550 = ri550;
	}

}
