package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RD200 {

	private String REG = "D200";
	private String COD_MOD;
	private String COD_SIT;
	private String SER;
	private String SUB;
	private String NUM_DOC_INI;
	private String NUM_DOC_FIM;
	private String CFOP;
	private String DT_REF;
	private String VL_DOC;
	private String VL_DESC;

	private Collection listaRD201 = new ArrayList();
	private Collection listaRD205 = new ArrayList();
	public String getCFOP() {
		return CFOP;
	}
	public void setCFOP(String cfop) {
		CFOP = cfop;
	}
	public String getCOD_MOD() {
		return COD_MOD;
	}
	public void setCOD_MOD(String cod_mod) {
		COD_MOD = cod_mod;
	}
	public String getCOD_SIT() {
		return COD_SIT;
	}
	public void setCOD_SIT(String cod_sit) {
		COD_SIT = cod_sit;
	}
	public String getDT_REF() {
		return DT_REF;
	}
	public void setDT_REF(String dt_ref) {
		DT_REF = dt_ref;
	}
	public Collection getListaRD201() {
		return listaRD201;
	}
	public void setListaRD201(Collection listaRD201) {
		this.listaRD201 = listaRD201;
	}
	public Collection getListaRD205() {
		return listaRD205;
	}
	public void setListaRD205(Collection listaRD205) {
		this.listaRD205 = listaRD205;
	}
	public String getNUM_DOC_FIM() {
		return NUM_DOC_FIM;
	}
	public void setNUM_DOC_FIM(String num_doc_fim) {
		NUM_DOC_FIM = num_doc_fim;
	}
	public String getNUM_DOC_INI() {
		return NUM_DOC_INI;
	}
	public void setNUM_DOC_INI(String num_doc_ini) {
		NUM_DOC_INI = num_doc_ini;
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
}
