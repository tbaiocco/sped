package br.com.nalthus.sped.modelo;

public class RJ930 {
	private String REG = "J930";
	private String IDENT_NOM;
	private String IDENT_CPF;
	private String IDENT_QUALIF;
	private String COD_ASSIM;
	private String IND_CRC;
	public String getCOD_ASSIM() {
		return COD_ASSIM;
	}
	public void setCOD_ASSIM(String cod_assim) {
		COD_ASSIM = cod_assim;
	}
	public String getIDENT_CPF() {
		return IDENT_CPF;
	}
	public void setIDENT_CPF(String ident_cpf) {
		IDENT_CPF = ident_cpf;
	}
	public String getIDENT_NOM() {
		return IDENT_NOM;
	}
	public void setIDENT_NOM(String ident_nom) {
		IDENT_NOM = ident_nom;
	}
	public String getIDENT_QUALIF() {
		return IDENT_QUALIF;
	}
	public void setIDENT_QUALIF(String ident_qualif) {
		IDENT_QUALIF = ident_qualif;
	}
	public String getIND_CRC() {
		return IND_CRC;
	}
	public void setIND_CRC(String ind_crc) {
		IND_CRC = ind_crc;
	}
	public String getREG() {
		return REG;
	}
	public void setREG(String reg) {
		REG = reg;
	}

}
