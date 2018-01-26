package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RD500 {

	public String REG = "D500";
	public String IND_OPER = "0";
	public String IND_EMIT = "1";
	public String COD_PART;
	public String COD_MOD;
	public String COD_SIT;
	public String SER;
	public String SUB;
	public String NUM_DOC;
	public String DT_DOC;
	public String DT_A_P;
	public String VL_DOC;
	public String VL_DESC;
	public String VL_SERV;
	public String VL_SERV_NT;
	public String VL_TERC;
	public String VL_DA;
	public String VL_BC_ICMS;
	public String VL_ICMS;
	public String COD_INF;
	public String VL_PIS;
	public String VL_COFINS;

	private Collection listaRD501 = new ArrayList();
	private Collection listaRD505 = new ArrayList();
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
	public String getDT_A_P() {
		return DT_A_P;
	}
	public void setDT_A_P(String dt_a_p) {
		DT_A_P = dt_a_p;
	}
	public String getDT_DOC() {
		return DT_DOC;
	}
	public void setDT_DOC(String dt_doc) {
		DT_DOC = dt_doc;
	}
	public String getIND_EMIT() {
		return IND_EMIT;
	}
	public void setIND_EMIT(String ind_emit) {
		IND_EMIT = ind_emit;
	}
	public String getIND_OPER() {
		return IND_OPER;
	}
	public void setIND_OPER(String ind_oper) {
		IND_OPER = ind_oper;
	}
	public Collection getListaRD501() {
		return listaRD501;
	}
	public void setListaRD501(Collection listaRD501) {
		this.listaRD501 = listaRD501;
	}
	public Collection getListaRD505() {
		return listaRD505;
	}
	public void setListaRD505(Collection listaRD505) {
		this.listaRD505 = listaRD505;
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
	public String getVL_BC_ICMS() {
		return VL_BC_ICMS;
	}
	public void setVL_BC_ICMS(String vl_bc_icms) {
		VL_BC_ICMS = vl_bc_icms;
	}
	public String getVL_COFINS() {
		return VL_COFINS;
	}
	public void setVL_COFINS(String vl_cofins) {
		VL_COFINS = vl_cofins;
	}
	public String getVL_DA() {
		return VL_DA;
	}
	public void setVL_DA(String vl_da) {
		VL_DA = vl_da;
	}
	public String getVL_DESC() {
		return VL_DESC;
	}
	public void setVL_DESC(String vl_desc) {
		VL_DESC = vl_desc;
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
	public String getVL_SERV() {
		return VL_SERV;
	}
	public void setVL_SERV(String vl_serv) {
		VL_SERV = vl_serv;
	}
	public String getVL_SERV_NT() {
		return VL_SERV_NT;
	}
	public void setVL_SERV_NT(String vl_serv_nt) {
		VL_SERV_NT = vl_serv_nt;
	}
	public String getVL_TERC() {
		return VL_TERC;
	}
	public void setVL_TERC(String vl_terc) {
		VL_TERC = vl_terc;
	}

}
