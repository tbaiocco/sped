package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RC100 {

	private String REG = "C100";
	private String IND_OPER;
	private String IND_EMIT;
	private String COD_PART;
	private String COD_MOD;
	private String COD_SIT;
	private String SER;
	private String NUM_DOC;
	private String CHV_NFE;
	private String DT_DOC;
	private String DT_E_S;
	private String VL_DOC;
	private String IND_PGTO = "1";
	private String VL_DESC;
	private String VL_ABAT_NT;
	private String VL_MERC;
	private String IND_FRT = "9";
	private String VL_FRT;
	private String VL_SEG;
	private String VL_OUT_DA;
	private String VL_BC_ICMS;
	private String VL_ICMS;
	private String VL_BC_ICMS_ST;
	private String VL_ICMS_ST;
	private String VL_IPI;
	private String VL_PIS;
	private String VL_COFINS;
	private String VL_PIS_ST;
	private String VL_COFINS_ST;

	private Collection listaRC170 = new ArrayList();

	public String getCHV_NFE() {
		return CHV_NFE;
	}

	public void setCHV_NFE(String chv_nfe) {
		CHV_NFE = chv_nfe;
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

	public String getIND_PGTO() {
		return IND_PGTO;
	}

	public void setIND_PGTO(String ind_pgto) {
		IND_PGTO = ind_pgto;
	}

	public Collection getListaRC170() {
		return listaRC170;
	}

	public void setListaRC170(Collection listaRC170) {
		this.listaRC170 = listaRC170;
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

	public String getVL_ABAT_NT() {
		return VL_ABAT_NT;
	}

	public void setVL_ABAT_NT(String vl_abat_nt) {
		VL_ABAT_NT = vl_abat_nt;
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

	public String getVL_COFINS_ST() {
		return VL_COFINS_ST;
	}

	public void setVL_COFINS_ST(String vl_cofins_st) {
		VL_COFINS_ST = vl_cofins_st;
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

	public String getVL_FRT() {
		return VL_FRT;
	}

	public void setVL_FRT(String vl_frt) {
		VL_FRT = vl_frt;
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

	public String getVL_IPI() {
		return VL_IPI;
	}

	public void setVL_IPI(String vl_ipi) {
		VL_IPI = vl_ipi;
	}

	public String getVL_MERC() {
		return VL_MERC;
	}

	public void setVL_MERC(String vl_merc) {
		VL_MERC = vl_merc;
	}

	public String getVL_OUT_DA() {
		return VL_OUT_DA;
	}

	public void setVL_OUT_DA(String vl_out_da) {
		VL_OUT_DA = vl_out_da;
	}

	public String getVL_PIS() {
		return VL_PIS;
	}

	public void setVL_PIS(String vl_pis) {
		VL_PIS = vl_pis;
	}

	public String getVL_PIS_ST() {
		return VL_PIS_ST;
	}

	public void setVL_PIS_ST(String vl_pis_st) {
		VL_PIS_ST = vl_pis_st;
	}

	public String getVL_SEG() {
		return VL_SEG;
	}

	public void setVL_SEG(String vl_seg) {
		VL_SEG = vl_seg;
	}

}
