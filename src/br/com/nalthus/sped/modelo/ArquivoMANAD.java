package br.com.nalthus.sped.modelo;

public class ArquivoMANAD {
	private RM0000 bloco0;
	private RMI blocoI;
	private String K_linha1 = "K001|1";
	private String K_linha2 = "K990|2";
	private String L_linha1 = "L001|1";
	private String L_linha2 = "L990|2";
	private R9999 bloco9;

	public RM0000 getBloco0() {
		return bloco0;
	}

	public void setBloco0(RM0000 bloco0) {
		this.bloco0 = bloco0;
	}

	public R9999 getBloco9() {
		return bloco9;
	}

	public void setBloco9(R9999 bloco9) {
		this.bloco9 = bloco9;
	}

	public RMI getBlocoI() {
		return blocoI;
	}

	public void setBlocoI(RMI blocoI) {
		this.blocoI = blocoI;
	}

	public String getK_linha1() {
		return K_linha1;
	}

	public void setK_linha1(String k_linha1) {
		K_linha1 = k_linha1;
	}

	public String getK_linha2() {
		return K_linha2;
	}

	public void setK_linha2(String k_linha2) {
		K_linha2 = k_linha2;
	}

	public String getL_linha1() {
		return L_linha1;
	}

	public void setL_linha1(String l_linha1) {
		L_linha1 = l_linha1;
	}

	public String getL_linha2() {
		return L_linha2;
	}

	public void setL_linha2(String l_linha2) {
		L_linha2 = l_linha2;
	}


}
