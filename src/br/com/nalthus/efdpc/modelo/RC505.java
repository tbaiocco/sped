package br.com.nalthus.efdpc.modelo;

import br.com.nalthus.efdpc.arquivo.MontagemLinhas;
import br.com.nalthus.sped.util.StringUtil;

public class RC505 {

	public String REG = "C505";
	public String CST_COFINS;
	public String VL_ITEM;
	public String NAT_BC_CRED;
	public String VL_BC_COFINS;
	public String ALIQ_COFINS;
	public String VL_COFINS;
	public String COD_CTA;
	public String getALIQ_COFINS() {
		return ALIQ_COFINS;
	}
	public void setALIQ_COFINS(String aliq_cofins) {
		ALIQ_COFINS = aliq_cofins;
	}
	public String getCOD_CTA() {
		return COD_CTA;
	}
	public void setCOD_CTA(String cod_cta) {
		COD_CTA = cod_cta;
	}
	public String getCST_COFINS() {
		return CST_COFINS;
	}
	public void setCST_COFINS(String cst_cofins) {
		CST_COFINS = cst_cofins;
	}
	public String getNAT_BC_CRED() {
		return NAT_BC_CRED;
	}
	public void setNAT_BC_CRED(String nat_bc_cred) {
		NAT_BC_CRED = nat_bc_cred;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public String getVL_BC_COFINS() {
		return VL_BC_COFINS;
	}
	public void setVL_BC_COFINS(String vl_bc_cofins) {
		VL_BC_COFINS = vl_bc_cofins;
	}
	public String getVL_COFINS() {
		return VL_COFINS;
	}
	public void setVL_COFINS(String vl_cofins) {
		VL_COFINS = vl_cofins;
	}
	public String getVL_ITEM() {
		return VL_ITEM;
	}
	public void setVL_ITEM(String vl_item) {
		VL_ITEM = vl_item;
	}

	public String toString() {
		String linha = MontagemLinhas.DELIMITADOR;
		linha+= this.getREG() + MontagemLinhas.DELIMITADOR;
		linha+= StringUtil.retornaValidado(this.getCST_COFINS(),2) + MontagemLinhas.DELIMITADOR;
		linha+= StringUtil.retornaValor(this.getVL_ITEM()) + MontagemLinhas.DELIMITADOR;
		linha+= StringUtil.retornaValidado(this.getNAT_BC_CRED(),2) + MontagemLinhas.DELIMITADOR;
		linha+= StringUtil.retornaValor(this.getVL_BC_COFINS()) + MontagemLinhas.DELIMITADOR;
		linha+= StringUtil.retornaValor(this.getALIQ_COFINS()) + MontagemLinhas.DELIMITADOR;
		linha+= StringUtil.retornaValor(this.getVL_COFINS()) + MontagemLinhas.DELIMITADOR;
		linha+= StringUtil.retornaValidado(this.getCOD_CTA()) + MontagemLinhas.DELIMITADOR;
		return linha;
	}

}
