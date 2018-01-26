package br.com.nalthus.efdpc.modelo;

public class R0110 {

	private String REG = "0110";
	private String COD_INC_TRIB = "1";
	private String IND_APRO_CRED = "2";
	private String COD_TIPO_CONT = "1";
	private String IND_REG_CUM = ""; //apartir de jul/12

	private R0111 r0111;

	public String getCOD_INC_TRIB() {
		return COD_INC_TRIB;
	}

	public void setCOD_INC_TRIB(String cod_inc_trib) {
		COD_INC_TRIB = cod_inc_trib;
	}

	public String getCOD_TIPO_CONT() {
		return COD_TIPO_CONT;
	}

	public void setCOD_TIPO_CONT(String cod_tipo_cont) {
		COD_TIPO_CONT = cod_tipo_cont;
	}

	public String getIND_APRO_CRED() {
		return IND_APRO_CRED;
	}

	public void setIND_APRO_CRED(String ind_apro_cred) {
		IND_APRO_CRED = ind_apro_cred;
	}

	public String getIND_REG_CUM() {
		return IND_REG_CUM;
	}

	public void setIND_REG_CUM(String ind_reg_cum) {
		IND_REG_CUM = ind_reg_cum;
	}

	public R0111 getR0111() {
		return r0111;
	}

	public void setR0111(R0111 r0111) {
		this.r0111 = r0111;
	}

	public String getREG() {
		return REG;
	}

	public void setREG(String reg) {
		REG = reg;
	}

}
