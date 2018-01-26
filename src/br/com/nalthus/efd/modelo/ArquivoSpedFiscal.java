package br.com.nalthus.efd.modelo;

public class ArquivoSpedFiscal {
	private R0000 bloco0;
	private RC blocoC;
	private RD blocoD;
	private RE blocoE;
	private RG blocoG;
	private RH blocoH;
	private R1 bloco1;
	private RK blocoK;
	private R9999 bloco9;
	public R0000 getBloco0() {
		return bloco0;
	}
	public void setBloco0(R0000 bloco0) {
		this.bloco0 = bloco0;
	}
	public R9999 getBloco9() {
		return bloco9;
	}
	public void setBloco9(R9999 bloco9) {
		this.bloco9 = bloco9;
	}
	public RC getBlocoC() {
		return blocoC;
	}
	public void setBlocoC(RC blocoC) {
		this.blocoC = blocoC;
	}
	public RD getBlocoD() {
		return blocoD;
	}
	public void setBlocoD(RD blocoD) {
		this.blocoD = blocoD;
	}
	public RE getBlocoE() {
		return blocoE;
	}
	public void setBlocoE(RE blocoE) {
		this.blocoE = blocoE;
	}
	public RG getBlocoG() {
		return blocoG;
	}
	public void setBlocoG(RG blocoG) {
		this.blocoG = blocoG;
	}
	public RH getBlocoH() {
		return blocoH;
	}
	public void setBlocoH(RH blocoH) {
		this.blocoH = blocoH;
	}
	public R1 getBloco1() {
		return bloco1;
	}
	public void setBloco1(R1 bloco1) {
		this.bloco1 = bloco1;
	}
	public RK getBlocoK() {
		if(blocoK == null)
			blocoK = new RK();
		return blocoK;
	}
	public void setBlocoK(RK blocoK) {
		this.blocoK = blocoK;
	}

}
