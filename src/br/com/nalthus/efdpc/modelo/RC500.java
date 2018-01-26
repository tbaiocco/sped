package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RC500 {

	public String REG = "C500";
	public String COD_PART;
	public String COD_MOD;
	public String COD_SIT;
	public String SER;
	public String SUB;
	public String NUM_DOC;
	public String DT_DOC;
	public String DT_ENT;
	public String VL_DOC;
	public String VL_ICMS;
	public String COD_INF;
	public String VL_PIS;
	public String VL_COFINS;

	private Collection listaRC501 = new ArrayList();
	private Collection listaRC505 = new ArrayList();
	public String getCOD_INF() {
		return COD_INF;
	}
	public void setCOD_INF(String cod_inf) {
		COD_INF = cod_inf;
	}
	public String getCOD_MOD() {
		return COD_MOD;
	}
	public void setCOD_MOD(String cod_mod) {
		COD_MOD = cod_mod;
	}
	public String getCOD_PART() {
		return COD_PART;
	}
	public void setCOD_PART(String cod_part) {
		COD_PART = cod_part;
	}
	public String getCOD_SIT() {
		return COD_SIT;
	}
	public void setCOD_SIT(String cod_sit) {
		COD_SIT = cod_sit;
	}
	public String getDT_DOC() {
		return DT_DOC;
	}
	public void setDT_DOC(String dt_doc) {
		DT_DOC = dt_doc;
	}
	public String getDT_ENT() {
		return DT_ENT;
	}
	public void setDT_ENT(String dt_ent) {
		DT_ENT = dt_ent;
	}
	public Collection getListaRC501() {
		return listaRC501;
	}
	public void setListaRC501(Collection listaRC501) {
		this.listaRC501 = listaRC501;
	}
	public Collection getListaRC505() {
		return listaRC505;
	}
	public void setListaRC505(Collection listaRC505) {
		this.listaRC505 = listaRC505;
	}
	public String getNUM_DOC() {
		return NUM_DOC;
	}
	public void setNUM_DOC(String num_doc) {
		NUM_DOC = num_doc;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getSER() {
		return SER;
	}
	public void setSER(String ser) {
		SER = ser;
	}
	public String getSUB() {
		return SUB;
	}
	public void setSUB(String sub) {
		SUB = sub;
	}
	public String getVL_COFINS() {
		return VL_COFINS;
	}
	public void setVL_COFINS(String vl_cofins) {
		VL_COFINS = vl_cofins;
	}
	public String getVL_DOC() {
		return VL_DOC;
	}
	public void setVL_DOC(String vl_doc) {
		VL_DOC = vl_doc;
	}
	public String getVL_ICMS() {
		return VL_ICMS;
	}
	public void setVL_ICMS(String vl_icms) {
		VL_ICMS = vl_icms;
	}
	public String getVL_PIS() {
		return VL_PIS;
	}
	public void setVL_PIS(String vl_pis) {
		VL_PIS = vl_pis;
	}

}
