package br.com.nalthus.efd.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RC500 {

	public String REG = "C500";
	public String IND_OPER="0";
	public String IND_EMIT="1";
	public String COD_PART;
	public String COD_MOD;
	public String COD_SIT;
	public String SER;
	public String SUB;
	public String COD_CONS="01";
	public String NUM_DOC;
	public String DT_DOC;
	public String DT_E_S;
	public String VL_DOC;
	public String VL_DESC;
	public String VL_FORN;
	public String VL_SERV_NT;
	public String VL_TERC;
	public String VL_DA;
	public String VL_BC_ICMS;
	public String VL_ICMS;
	public String VL_BC_ICMS_ST;
	public String VL_ICMS_ST;
	public String COD_INF;
	public String VL_PIS;
	public String VL_COFINS;
	public String TP_LIGACAO="";
	public String COD_GRUPO_TENSAO="";

	private Collection listaRC510 = new ArrayList();
	private Collection listaRC590 = new ArrayList();

	public String getCOD_CONS() {
		return COD_CONS;
	}
	public void setCOD_CONS(String cod_cons) {
		COD_CONS = cod_cons;
	}
	public String getCOD_GRUPO_TENSAO() {
		return COD_GRUPO_TENSAO;
	}
	public void setCOD_GRUPO_TENSAO(String cod_grupo_tensao) {
		COD_GRUPO_TENSAO = cod_grupo_tensao;
	}
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
	public String getDT_E_S() {
		return DT_E_S;
	}
	public void setDT_E_S(String dt_e_s) {
		DT_E_S = dt_e_s;
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
	public String getTP_LIGACAO() {
		return TP_LIGACAO;
	}
	public void setTP_LIGACAO(String tp_ligacao) {
		TP_LIGACAO = tp_ligacao;
	}
	public String getVL_BC_ICMS() {
		return VL_BC_ICMS;
	}
	public void setVL_BC_ICMS(String vl_bc_icms) {
		VL_BC_ICMS = vl_bc_icms;
	}
	public String getVL_BC_ICMS_ST() {
		return VL_BC_ICMS_ST;
	}
	public void setVL_BC_ICMS_ST(String vl_bc_icms_st) {
		VL_BC_ICMS_ST = vl_bc_icms_st;
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
	public String getVL_FORN() {
		return VL_FORN;
	}
	public void setVL_FORN(String vl_forn) {
		VL_FORN = vl_forn;
	}
	public String getVL_ICMS() {
		return VL_ICMS;
	}
	public void setVL_ICMS(String vl_icms) {
		VL_ICMS = vl_icms;
	}
	public String getVL_ICMS_ST() {
		return VL_ICMS_ST;
	}
	public void setVL_ICMS_ST(String vl_icms_st) {
		VL_ICMS_ST = vl_icms_st;
	}
	public String getVL_PIS() {
		return VL_PIS;
	}
	public void setVL_PIS(String vl_pis) {
		VL_PIS = vl_pis;
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
	public Collection getListaRC510() {
		return listaRC510;
	}
	public void setListaRC510(Collection listaRC510) {
		this.listaRC510 = listaRC510;
	}
	public Collection getListaRC590() {
		return listaRC590;
	}
	public void setListaRC590(Collection listaRC590) {
		this.listaRC590 = listaRC590;
	}


}
