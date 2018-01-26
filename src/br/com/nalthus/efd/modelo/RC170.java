package br.com.nalthus.efd.modelo;

public class RC170 {

	private String REG = "C170";
	private String NUM_ITEM;
    private String COD_ITEM;
    private String DESCR_COMPL;
    private String QTD;
    private String UNID;
    private String VL_ITEM;
    private String VL_DESC;
    private String IND_MOV = "0";
    private String CST_ICMS = "";
    private String CFOP = "";
    private String COD_NAT = "";
    private String VL_BC_ICMS;
    private String ALIQ_ICMS;
    private String VL_ICMS;
    private String VL_BC_ICMS_ST;
    private String ALIQ_ST;
    private String VL_ICMS_ST;
    private String IND_APUR = "0";
    private String CST_IPI = "";
    private String COD_ENQ = "";
    private String VL_BC_IPI;
    private String ALIQ_IPI;
    private String VL_IPI;
    private String CST_PIS;
    private String VL_BC_PIS;
    private String ALIQ_PIS;
    private String QUANT_BC_PIS;
    private String ALIQ_PIS_REAIS;
    private String VL_PIS;
    private String CST_COFINS;
    private String VL_BC_COFINS;
    private String ALIQ_COFINS;
    private String QUANT_BC_COFINS;
    private String ALIQ_COFINS_REAIS;
    private String VL_COFINS;
    private String COD_CTA;
	public String getALIQ_COFINS() {
		return ALIQ_COFINS;
	}
	public void setALIQ_COFINS(String aliq_cofins) {
		ALIQ_COFINS = aliq_cofins;
	}
	public String getALIQ_COFINS_REAIS() {
		return ALIQ_COFINS_REAIS;
	}
	public void setALIQ_COFINS_REAIS(String aliq_cofins_quant) {
		ALIQ_COFINS_REAIS = aliq_cofins_quant;
	}
	public String getALIQ_ICMS() {
		return ALIQ_ICMS;
	}
	public void setALIQ_ICMS(String aliq_icms) {
		ALIQ_ICMS = aliq_icms;
	}
	public String getALIQ_IPI() {
		return ALIQ_IPI;
	}
	public void setALIQ_IPI(String aliq_ipi) {
		ALIQ_IPI = aliq_ipi;
	}
	public String getALIQ_PIS() {
		return ALIQ_PIS;
	}
	public void setALIQ_PIS(String aliq_pis) {
		ALIQ_PIS = aliq_pis;
	}
	public String getALIQ_PIS_REAIS() {
		return ALIQ_PIS_REAIS;
	}
	public void setALIQ_PIS_REAIS(String aliq_pis_quant) {
		ALIQ_PIS_REAIS = aliq_pis_quant;
	}
	public String getALIQ_ST() {
		return ALIQ_ST;
	}
	public void setALIQ_ST(String aliq_st) {
		ALIQ_ST = aliq_st;
	}
	public String getCFOP() {
		return CFOP;
	}
	public void setCFOP(String cfop) {
		CFOP = cfop;
	}
	public String getCOD_CTA() {
		return COD_CTA;
	}
	public void setCOD_CTA(String cod_cta) {
		COD_CTA = cod_cta;
	}
	public String getCOD_ENQ() {
		return COD_ENQ;
	}
	public void setCOD_ENQ(String cod_enq) {
		COD_ENQ = cod_enq;
	}
	public String getCOD_ITEM() {
		return COD_ITEM;
	}
	public void setCOD_ITEM(String cod_item) {
		COD_ITEM = cod_item;
	}
	public String getCOD_NAT() {
		return COD_NAT;
	}
	public void setCOD_NAT(String cod_nat) {
		COD_NAT = cod_nat;
	}
	public String getCST_COFINS() {
		return CST_COFINS;
	}
	public void setCST_COFINS(String cst_cofins) {
		CST_COFINS = cst_cofins;
	}
	public String getCST_ICMS() {
		return CST_ICMS;
	}
	public void setCST_ICMS(String cst_icms) {
		CST_ICMS = cst_icms;
	}
	public String getCST_IPI() {
		return CST_IPI;
	}
	public void setCST_IPI(String cst_ipi) {
		CST_IPI = cst_ipi;
	}
	public String getCST_PIS() {
		return CST_PIS;
	}
	public void setCST_PIS(String cst_pis) {
		CST_PIS = cst_pis;
	}
	public String getDESCR_COMPL() {
		return DESCR_COMPL;
	}
	public void setDESCR_COMPL(String descr_compl) {
		DESCR_COMPL = descr_compl;
	}
	public String getIND_APUR() {
		return IND_APUR;
	}
	public void setIND_APUR(String ind_apur) {
		IND_APUR = ind_apur;
	}
	public String getIND_MOV() {
		return IND_MOV;
	}
	public void setIND_MOV(String ind_mov) {
		IND_MOV = ind_mov;
	}
	public String getNUM_ITEM() {
		return NUM_ITEM;
	}
	public void setNUM_ITEM(String num_item) {
		NUM_ITEM = num_item;
	}
	public String getQTD() {
		return QTD;
	}
	public void setQTD(String qtd) {
		QTD = qtd;
	}
	public String getQUANT_BC_COFINS() {
		return QUANT_BC_COFINS;
	}
	public void setQUANT_BC_COFINS(String quant_bc_cofins) {
		QUANT_BC_COFINS = quant_bc_cofins;
	}
	public String getQUANT_BC_PIS() {
		return QUANT_BC_PIS;
	}
	public void setQUANT_BC_PIS(String quant_bc_pis) {
		QUANT_BC_PIS = quant_bc_pis;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getUNID() {
		return UNID;
	}
	public void setUNID(String unid) {
		UNID = unid;
	}
	public String getVL_BC_COFINS() {
		return VL_BC_COFINS;
	}
	public void setVL_BC_COFINS(String vl_bc_cofins) {
		VL_BC_COFINS = vl_bc_cofins;
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
	public String getVL_BC_IPI() {
		return VL_BC_IPI;
	}
	public void setVL_BC_IPI(String vl_bc_ipi) {
		VL_BC_IPI = vl_bc_ipi;
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
	public String getVL_DESC() {
		return VL_DESC;
	}
	public void setVL_DESC(String vl_desc) {
		VL_DESC = vl_desc;
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
	public String getVL_ITEM() {
		return VL_ITEM;
	}
	public void setVL_ITEM(String vl_item) {
		VL_ITEM = vl_item;
	}
	public String getVL_PIS() {
		return VL_PIS;
	}
	public void setVL_PIS(String vl_pis) {
		VL_PIS = vl_pis;
	}


}
