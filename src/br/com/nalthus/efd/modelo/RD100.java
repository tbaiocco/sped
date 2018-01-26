package br.com.nalthus.efd.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RD100 {

	private String REG="D100";
	private String IND_OPER="1";
	private String IND_EMIT="0";
	private String COD_PART;
	private String COD_MOD="57";
	private String COD_SIT;
	private String SER;
	private String SUB="";
	private String NUM_DOC;
	private String CHV_CTE;
	private String DT_DOC;
	private String DT_A_P;
	private String TP_CTE="0";
	private String CHV_CTE_REF;
	private String VL_DOC;
	private String VL_DESC;
	private String IND_FRT="1"; //SE CONSIGNATARIO EH 2
	private String VL_SERV;
	private String VL_BC_ICMS;
	private String VL_ICMS;
	private String VL_NT;
	private String COD_INF;
	private String COD_CTA;
	private String COD_MUN_ORIG;
	private String COD_MUN_DEST;

	private Collection listaRD190 = new ArrayList();
	private RD130 rD130 = new RD130();

	public String getCHV_CTE() {
		return CHV_CTE;
	}
	public void setCHV_CTE(String chv_cte) {
		CHV_CTE = chv_cte;
	}
	public String getCHV_CTE_REF() {
		return CHV_CTE_REF;
	}
	public void setCHV_CTE_REF(String chv_cte_ref) {
		CHV_CTE_REF = chv_cte_ref;
	}
	public String getCOD_CTA() {
		return COD_CTA;
	}
	public void setCOD_CTA(String cod_cta) {
		COD_CTA = cod_cta;
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
	public String getIND_FRT() {
		return IND_FRT;
	}
	public void setIND_FRT(String ind_frt) {
		IND_FRT = ind_frt;
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
	public String getTP_CTE() {
		return TP_CTE;
	}
	public void setTP_CTE(String tp_cte) {
		TP_CTE = tp_cte;
	}
	public String getVL_BC_ICMS() {
		return VL_BC_ICMS;
	}
	public void setVL_BC_ICMS(String vl_bc_icms) {
		VL_BC_ICMS = vl_bc_icms;
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
	public String getVL_NT() {
		return VL_NT;
	}
	public void setVL_NT(String vl_nt) {
		VL_NT = vl_nt;
	}
	public String getVL_SERV() {
		return VL_SERV;
	}
	public void setVL_SERV(String vl_serv) {
		VL_SERV = vl_serv;
	}
	public Collection getListaRD190() {
		return listaRD190;
	}
	public void setListaRD190(Collection listaRD190) {
		this.listaRD190 = listaRD190;
	}
	public RD130 getRD130() {
		return rD130;
	}
	public void setRD130(RD130 rd130) {
		rD130 = rd130;
	}
	public String getCOD_MUN_ORIG() {
		return COD_MUN_ORIG;
	}
	public void setCOD_MUN_ORIG(String cOD_MUN_ORIG) {
		COD_MUN_ORIG = cOD_MUN_ORIG;
	}
	public String getCOD_MUN_DEST() {
		return COD_MUN_DEST;
	}
	public void setCOD_MUN_DEST(String cOD_MUN_DEST) {
		COD_MUN_DEST = cOD_MUN_DEST;
	}


}
