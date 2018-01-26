package br.com.nalthus.efdpc.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RA010 {

	private String REG = "A010";
	private String CNPJ;

	private Collection listaRA100 = new ArrayList();

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cnpj) {
		CNPJ = cnpj;
	}

	public Collection getListaRA100() {
		return listaRA100;
	}

	public void setListaRA100(Collection ra100) {
		listaRA100 = ra100;
	}

	public String getREG() {
		return REG;
	}

	public void setREG(String reg) {
		REG = reg;
	}
}
