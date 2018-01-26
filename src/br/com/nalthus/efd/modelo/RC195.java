package br.com.nalthus.efd.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RC195 {

	private String REG = "C195";
	private String COD_OBS;
	private String TXT_COMPL;

	private Collection listaRC197 = new ArrayList();

	public String getCOD_OBS() {
		return COD_OBS;
	}

	public void setCOD_OBS(String cod_obs) {
		COD_OBS = cod_obs;
	}

	public Collection getListaRC197() {
		return listaRC197;
	}

	public void setListaRC197(Collection listaRC197) {
		this.listaRC197 = listaRC197;
	}

	public String getREG() {
		return REG;
	}

	public void setREG(String reg) {
		REG = reg;
	}

	public String getTXT_COMPL() {
		return TXT_COMPL;
	}

	public void setTXT_COMPL(String txt_compl) {
		TXT_COMPL = txt_compl;
	}

}
