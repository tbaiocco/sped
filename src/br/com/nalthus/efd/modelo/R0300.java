package br.com.nalthus.efd.modelo;

public class R0300 {

	private String REG="0300";
	private String COD_IND_BEM;
	private String IDENT_MERC="1";
	private String DESCR_ITEM;
	private String COD_PRNC;
	private String COD_CTA;
	private String NR_PARC;

	private R0305 r0305;

	public String getCOD_CTA() {
		return COD_CTA;
	}
	public void setCOD_CTA(String cod_cta) {
		COD_CTA = cod_cta;
	}
	public String getCOD_IND_BEM() {
		return COD_IND_BEM;
	}
	public void setCOD_IND_BEM(String cod_ind_bem) {
		COD_IND_BEM = cod_ind_bem;
	}
	public String getCOD_PRNC() {
		return COD_PRNC;
	}
	public void setCOD_PRNC(String cod_prnc) {
		COD_PRNC = cod_prnc;
	}
	public String getDESCR_ITEM() {
		return DESCR_ITEM;
	}
	public void setDESCR_ITEM(String descr_item) {
		DESCR_ITEM = descr_item;
	}
	public String getIDENT_MERC() {
		return IDENT_MERC;
	}
	public void setIDENT_MERC(String ident_merc) {
		IDENT_MERC = ident_merc;
	}
	public String getNR_PARC() {
		return NR_PARC;
	}
	public void setNR_PARC(String nr_parc) {
		NR_PARC = nr_parc;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public R0305 getR0305() {
		return r0305;
	}
	public void setR0305(R0305 r0305) {
		this.r0305 = r0305;
	}

}
