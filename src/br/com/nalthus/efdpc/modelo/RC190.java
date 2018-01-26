package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RC190 {

	private String REG = "C190";
	private String COD_MOD = "55";
	private String DT_DOC_INI;
	private String DT_DOC_FIN;
	private String COD_ITEM;
	private String COD_NCM;
	private String EX_IPI;
	private String VL_TOT_ITEM;

	private Collection listaRC191 = new ArrayList();
	private Collection listaRC195 = new ArrayList();
	public String getCOD_ITEM() {
		return COD_ITEM;
	}
	public void setCOD_ITEM(String cod_item) {
		COD_ITEM = cod_item;
	}
	public String getCOD_MOD() {
		return COD_MOD;
	}
	public void setCOD_MOD(String cod_mod) {
		COD_MOD = cod_mod;
	}
	public String getCOD_NCM() {
		return COD_NCM;
	}
	public void setCOD_NCM(String cod_ncm) {
		COD_NCM = cod_ncm;
	}
	public String getDT_DOC_FIN() {
		return DT_DOC_FIN;
	}
	public void setDT_DOC_FIN(String dt_doc_fin) {
		DT_DOC_FIN = dt_doc_fin;
	}
	public String getDT_DOC_INI() {
		return DT_DOC_INI;
	}
	public void setDT_DOC_INI(String dt_doc_ini) {
		DT_DOC_INI = dt_doc_ini;
	}
	public String getEX_IPI() {
		return EX_IPI;
	}
	public void setEX_IPI(String ex_ipi) {
		EX_IPI = ex_ipi;
	}
	public Collection getListaRC191() {
		return listaRC191;
	}
	public void setListaRC191(Collection listaRC191) {
		this.listaRC191 = listaRC191;
	}
	public Collection getListaRC195() {
		return listaRC195;
	}
	public void setListaRC195(Collection listaRC195) {
		this.listaRC195 = listaRC195;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getVL_TOT_ITEM() {
		return VL_TOT_ITEM;
	}
	public void setVL_TOT_ITEM(String vl_tot_item) {
		VL_TOT_ITEM = vl_tot_item;
	}

}
