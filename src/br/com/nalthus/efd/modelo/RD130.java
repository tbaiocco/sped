package br.com.nalthus.efd.modelo;

public class RD130 {

	private String REG="D130";
	private String COD_PART_CONSG;
	private String COD_PART_RED;
	private String IND_FRT_RED="0";
	private String COD_MUN_ORIG;
	private String COD_MUN_DEST;
	private String VEIC_ID;
	private String VL_LIQ_FRT;
	private String VL_SEC_CAT;
	private String VL_DESP;
	private String VL_PEDG;
	private String VL_OUT;
	private String VL_FRT;
	private String UF_ID;

	public String getCOD_MUN_DEST() {
		return COD_MUN_DEST;
	}
	public void setCOD_MUN_DEST(String cod_mun_dest) {
		COD_MUN_DEST = cod_mun_dest;
	}
	public String getCOD_MUN_ORIG() {
		return COD_MUN_ORIG;
	}
	public void setCOD_MUN_ORIG(String cod_mun_orig) {
		COD_MUN_ORIG = cod_mun_orig;
	}
	public String getCOD_PART_CONSG() {
		return COD_PART_CONSG;
	}
	public void setCOD_PART_CONSG(String cod_part_consg) {
		COD_PART_CONSG = cod_part_consg;
	}
	public String getCOD_PART_RED() {
		return COD_PART_RED;
	}
	public void setCOD_PART_RED(String cod_part_red) {
		COD_PART_RED = cod_part_red;
	}
	public String getIND_FRT_RED() {
		return IND_FRT_RED;
	}
	public void setIND_FRT_RED(String ind_frt_red) {
		IND_FRT_RED = ind_frt_red;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getUF_ID() {
		return UF_ID;
	}
	public void setUF_ID(String uf_id) {
		UF_ID = uf_id;
	}
	public String getVEIC_ID() {
		return VEIC_ID;
	}
	public void setVEIC_ID(String veic_id) {
		VEIC_ID = veic_id;
	}
	public String getVL_DESP() {
		return VL_DESP;
	}
	public void setVL_DESP(String vl_desp) {
		VL_DESP = vl_desp;
	}
	public String getVL_FRT() {
		return VL_FRT;
	}
	public void setVL_FRT(String vl_frt) {
		VL_FRT = vl_frt;
	}
	public String getVL_LIQ_FRT() {
		return VL_LIQ_FRT;
	}
	public void setVL_LIQ_FRT(String vl_liq_frt) {
		VL_LIQ_FRT = vl_liq_frt;
	}
	public String getVL_OUT() {
		return VL_OUT;
	}
	public void setVL_OUT(String vl_out) {
		VL_OUT = vl_out;
	}
	public String getVL_PEDG() {
		return VL_PEDG;
	}
	public void setVL_PEDG(String vl_pedg) {
		VL_PEDG = vl_pedg;
	}
	public String getVL_SEC_CAT() {
		return VL_SEC_CAT;
	}
	public void setVL_SEC_CAT(String vl_sec_cat) {
		VL_SEC_CAT = vl_sec_cat;
	}
}
