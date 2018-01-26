package br.com.nalthus.efdpc.modelo;

public class R9999 {
	private String REG = "9999";
	private String QTD_LIN;

	private R9001 r9001;
	private R9990 r9990;

	public String getQTD_LIN() {
		return QTD_LIN;
	}
	public void setQTD_LIN(String qtd_lin) {
		QTD_LIN = qtd_lin;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}
	public R9001 getR9001() {
		return r9001;
	}
	public void setR9001(R9001 r9001) {
		this.r9001 = r9001;
	}
	public R9990 getR9990() {
		return r9990;
	}
	public void setR9990(R9990 r9990) {
		this.r9990 = r9990;
	}

}
