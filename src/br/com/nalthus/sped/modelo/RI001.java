package br.com.nalthus.sped.modelo;

public class RI001 {
	private String REG = "I001";
	private String IND_DAD;

	private RI010 rI010;

	public String getIND_DAD() {
		return IND_DAD;
	}
	public void setIND_DAD(String ind_dad) {
		IND_DAD = ind_dad;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public RI010 getRI010() {
		return rI010;
	}
	public void setRI010(RI010 ri010) {
		rI010 = ri010;
	}

}
