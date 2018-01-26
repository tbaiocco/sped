package br.com.nalthus.sped.modelo;

public class ArquivoContabil {
	private R0000 bloco0;
	private RI blocoI;
	private RJ blocoJ;
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

	public RI getBlocoI() {
		return blocoI;
	}

	public void setBlocoI(RI blocoI) {
		this.blocoI = blocoI;
	}

	public RJ getBlocoJ() {
		return blocoJ;
	}

	public void setBlocoJ(RJ blocoJ) {
		this.blocoJ = blocoJ;
	}

}
