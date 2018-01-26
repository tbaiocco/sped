package br.com.nalthus.efd.modelo;

public class R1001 {

	private String REG = "1001";
	private String IND_MOV = "1";

	private R1010 r1010;

	public String getIND_MOV() {
		return IND_MOV;
	}
	public void setIND_MOV(String ind_mov) {
		IND_MOV = ind_mov;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public R1010 getR1010() {
		return r1010;
	}
	public void setR1010(R1010 r1010) {
		this.r1010 = r1010;
	}
}
