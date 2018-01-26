package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RA100 {

	private String REG = "A100";
	private String IND_OPER = "1";
	private String IND_EMIT = "0";
	private String COD_PART;
	private String COD_SIT;
	private String SER;
	private String SUB;
	private String NUM_DOC;
	private String CHV_NFSE;
	private String DT_DOC;
	private String DT_EXE_SERV;
	private String VL_DOC;
	private String IND_PGTO = "1";
	private String VL_DESC;
	private String VL_BC_PIS;
	private String VL_PIS;
	private String VL_BC_COFINS;
	private String VL_COFINS;
	private String VL_PIS_RET;
	private String VL_COFINS_RET;
	private String VL_ISS;

	private Collection listaRA170 = new ArrayList();

	public String getCHV_NFSE() {
		return CHV_NFSE;
	}

	public void setCHV_NFSE(String chv_nfse) {
		CHV_NFSE = chv_nfse;
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

	public String getDT_EXE_SERV() {
		return DT_EXE_SERV;
	}

	public void setDT_EXE_SERV(String dt_exe_serv) {
		DT_EXE_SERV = dt_exe_serv;
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

	public String getIND_PGTO() {
		return IND_PGTO;
	}

	public void setIND_PGTO(String ind_pgto) {
		IND_PGTO = ind_pgto;
	}

	public Collection getListaRA170() {
		return listaRA170;
	}

	public void setListaRA170(Collection listaRA170) {
		this.listaRA170 = listaRA170;
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

	public String getVL_BC_COFINS() {
		return VL_BC_COFINS;
	}

	public void setVL_BC_COFINS(String vl_bc_cofins) {
		VL_BC_COFINS = vl_bc_cofins;
	}

	public String getVL_BC_PIS() {
		return VL_BC_PIS;
	}

	public void setVL_BC_PIS(String vl_bc_pis) {
		VL_BC_PIS = vl_bc_pis;
	}

	public String getVL_COFINS() {
		return VL_COFINS;
	}

	public void setVL_COFINS(String vl_cofins) {
		VL_COFINS = vl_cofins;
	}

	public String getVL_COFINS_RET() {
		return VL_COFINS_RET;
	}

	public void setVL_COFINS_RET(String vl_cofins_ret) {
		VL_COFINS_RET = vl_cofins_ret;
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

	public String getVL_ISS() {
		return VL_ISS;
	}

	public void setVL_ISS(String vl_iss) {
		VL_ISS = vl_iss;
	}

	public String getVL_PIS() {
		return VL_PIS;
	}

	public void setVL_PIS(String vl_pis) {
		VL_PIS = vl_pis;
	}

	public String getVL_PIS_RET() {
		return VL_PIS_RET;
	}

	public void setVL_PIS_RET(String vl_pis_ret) {
		VL_PIS_RET = vl_pis_ret;
	}

}
