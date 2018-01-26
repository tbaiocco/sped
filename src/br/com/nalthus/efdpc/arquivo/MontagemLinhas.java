package br.com.nalthus.efdpc.arquivo;

import java.util.Iterator;

import br.com.nalthus.efdpc.modelo.R0000;
import br.com.nalthus.efdpc.modelo.R0100;
import br.com.nalthus.efdpc.modelo.R0110;
import br.com.nalthus.efdpc.modelo.R0111;
import br.com.nalthus.efdpc.modelo.R0140;
import br.com.nalthus.efdpc.modelo.R0190;
import br.com.nalthus.efdpc.modelo.R0200;
import br.com.nalthus.efdpc.modelo.R0400;
import br.com.nalthus.efdpc.modelo.R0450;
import br.com.nalthus.efdpc.modelo.R0500;
import br.com.nalthus.efdpc.modelo.R0600;
import br.com.nalthus.efdpc.modelo.R1001;
import br.com.nalthus.efdpc.modelo.R1990;
import br.com.nalthus.efdpc.modelo.RA001;
import br.com.nalthus.efdpc.modelo.RA010;
import br.com.nalthus.efdpc.modelo.RA100;
import br.com.nalthus.efdpc.modelo.RA170;
import br.com.nalthus.efdpc.modelo.RA990;
import br.com.nalthus.efdpc.modelo.RC001;
import br.com.nalthus.efdpc.modelo.RC010;
import br.com.nalthus.efdpc.modelo.RC100;
import br.com.nalthus.efdpc.modelo.RC170;
import br.com.nalthus.efdpc.modelo.RC180;
import br.com.nalthus.efdpc.modelo.RC181;
import br.com.nalthus.efdpc.modelo.RC185;
import br.com.nalthus.efdpc.modelo.RC190;
import br.com.nalthus.efdpc.modelo.RC191;
import br.com.nalthus.efdpc.modelo.RC195;
import br.com.nalthus.efdpc.modelo.RC500;
import br.com.nalthus.efdpc.modelo.RC501;
import br.com.nalthus.efdpc.modelo.RC505;
import br.com.nalthus.efdpc.modelo.RC990;
import br.com.nalthus.efdpc.modelo.RD001;
import br.com.nalthus.efdpc.modelo.RD010;
import br.com.nalthus.efdpc.modelo.RD200;
import br.com.nalthus.efdpc.modelo.RD201;
import br.com.nalthus.efdpc.modelo.RD205;
import br.com.nalthus.efdpc.modelo.RD500;
import br.com.nalthus.efdpc.modelo.RD501;
import br.com.nalthus.efdpc.modelo.RD505;
import br.com.nalthus.efdpc.modelo.RD990;
import br.com.nalthus.efdpc.modelo.RF001;
import br.com.nalthus.efdpc.modelo.RF010;
import br.com.nalthus.efdpc.modelo.RF100;
import br.com.nalthus.efdpc.modelo.RF120;
import br.com.nalthus.efdpc.modelo.RF130;
import br.com.nalthus.efdpc.modelo.RF990;
import br.com.nalthus.efdpc.modelo.RM001;
import br.com.nalthus.efdpc.modelo.RM990;
import br.com.nalthus.efdpc.modelo.R0001;
import br.com.nalthus.efdpc.modelo.R0150;
import br.com.nalthus.efdpc.modelo.R0990;
import br.com.nalthus.efdpc.modelo.R9001;
import br.com.nalthus.efdpc.modelo.R9900;
import br.com.nalthus.efdpc.modelo.R9990;
import br.com.nalthus.efdpc.modelo.R9999;

import br.com.nalthus.sped.util.StringUtil;

public class MontagemLinhas {

	public final static String DELIMITADOR = "|";

	public static String montaLinha0000(R0000 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= reg.getCOD_VER() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getTIPO_ESCRIT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_SIT_ESP(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_REC_ANTERIOR(),41) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_INI(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_FIN(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getUF(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(StringUtil.alinhaNumeroDireita(reg.getCOD_MUN(),7),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUFRAMA(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_NAT_PJ(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_ATIV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0001(R0001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0100(R0100 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCPF(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCRC(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCEP(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEND()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOMPL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getBAIRRO()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getFONE()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getFAX()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEMAIL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(StringUtil.alinhaNumeroDireita(reg.getCOD_MUN(),7),7) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0110(R0110 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_INC_TRIB(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_APRO_CRED(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_TIPO_CONT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_REG_CUM(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0111(R0111 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getREC_BRU_NCUM_TRIB_MI()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getREC_BRU_NCUM_NT_MI()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getREC_BRU_NCUM_EXP()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getREC_BRU_CUM()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getREC_BRU_TOTAL()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0140(R0140 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_EST()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getUF(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIE(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(StringUtil.alinhaNumeroDireita(reg.getCOD_MUN(),7),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUFRAMA(),9) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0150(R0150 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PAIS(),5) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCPF(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIE(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(StringUtil.alinhaNumeroDireita(reg.getCOD_MUN(),7),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUFRAMA(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEND()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOMPL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getBAIRRO()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0190(R0190 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getUNID()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESCR()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0200(R0200 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESCR_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_BARRA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ANT_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getUNID_INV()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getTIPO_ITEM(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_NCM(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEX_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_GEN(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_LST(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ICMS()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0400(R0400 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_NAT()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESCR_NAT()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0450(R0450 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_INF()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getTXT()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0500(R0500 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_ALT(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_NAT_CC(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_CTA(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNIVEL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNOME_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA_REF()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ_EST()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0600(R0600 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_ALT(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCCUS()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0990(R0990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_0()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaA001(RA001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaA010(RA010 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(reg.getCNPJ(),14) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaA100(RA100 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_OPER(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_EMIT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_SIT(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSER()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUB()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_DOC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCHV_NFSE()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_EXE_SERV(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_DOC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_PGTO(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_DESC()) + DELIMITADOR;
		if(reg.getCOD_SIT().equals("02")){
			linha+= StringUtil.retornaValorBranco(reg.getVL_BC_PIS()) + DELIMITADOR;
			linha+= StringUtil.retornaValorBranco(reg.getVL_PIS()) + DELIMITADOR;
			linha+= StringUtil.retornaValorBranco(reg.getVL_BC_COFINS()) + DELIMITADOR;
			linha+= StringUtil.retornaValorBranco(reg.getVL_COFINS()) + DELIMITADOR;
		} else {
			linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
			linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
			linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
			linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		}

		linha+= StringUtil.retornaValorBranco(reg.getVL_PIS_RET()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_COFINS_RET()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_ISS()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaA170(RA170 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_ITEM(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESCR_COMPL()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNAT_BC_CRED(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_ORIG_CRED(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CCUS()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaA990(RA990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_A()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC001(RC001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC010(RC010 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_ESCRI(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC100(RC100 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_OPER(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_EMIT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MOD(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_SIT(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSER()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_DOC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCHV_NFE()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_E_S(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DOC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_PGTO(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ABAT_NT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_MERC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_FRT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_FRT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_SEG()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_OUT_DA()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS_ST()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC170(RC170 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_ITEM(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESCR_COMPL()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getQTD()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getUNID()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_MOV(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_ICMS(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_NAT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_APUR()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ENQ(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQUANT_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getALIQ_PIS_QUANT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQUANT_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getALIQ_COFINS_QUANT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA(),3) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC180(RC180 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MOD(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC_INI(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC_FIN(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_NCM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEX_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_TOT_ITEM()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC181(RC181 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getQUANT_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS_QUANT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC185(RC185 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getQUANT_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS_QUANT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC190(RC190 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MOD(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC_INI(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC_FIN(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_NCM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEX_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_TOT_ITEM()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC191(RC191 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ_CPF_PART(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getQUANT_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS_QUANT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC195(RC195 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ_CPF_PART(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getQUANT_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS_QUANT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC500(RC500 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MOD(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_SIT(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSER()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUB()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_DOC(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_ENT(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DOC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_INF()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC501(RC501 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNAT_BC_CRED(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC505(RC505 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNAT_BC_CRED(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC990(RC990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_C()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD001(RD001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD010(RD010 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ(),14) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD200(RD200 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MOD(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_SIT(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSER()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUB()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_DOC_INI(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_DOC_FIM(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_REF(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DOC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD201(RD201 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD205(RD205 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD500(RD500 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_OPER()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_EMIT()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MOD(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_SIT(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSER()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUB()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_DOC(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_A_P(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DOC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_SERV()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_SERV_NT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_TERC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DA()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_INF()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD501(RD501 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNAT_BC_CRED(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD505(RD505 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNAT_BC_CRED(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD990(RD990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_D()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaF001(RF001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaF010(RF010 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ(),14) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaF100(RF100 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_OPER(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_OPER(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_OPER()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNAT_BC_CRED(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_ORIG_CRED(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESC_DOC_OPER()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaF120(RF120 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNAT_BC_CRED(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIDENT_BEM_IMOB()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_ORIG_CRED()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_UTIL_BEM_IMOB()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_OPER_DEP()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getPARC_OPER_NAO_BC_CRED()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESC_BEM_IMOB()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaF130(RF130 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNAT_BC_CRED(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIDENT_BEM_IMOB()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_ORIG_CRED()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_UTIL_BEM_IMOB()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getMES_OPER_AQUIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_OPER_AQUIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getPARC_OPER_NAO_BC_CRED()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_CRED()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_NR_PARC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESC_BEM_IMOB()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaF990(RF990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_F()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaM001(RM001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaM990(RM990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_M()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha1001(R1001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha1990(R1990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_1()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha9001(R9001 r9001){
		String linha = DELIMITADOR;
		linha+= r9001.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(r9001.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha9900(R9900 r9900){
		String linha = DELIMITADOR;
		linha+= r9900.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r9900.getREG_BLC(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r9900.getQTD_REG_BLC()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha9990(R9990 r9990){
		String linha = DELIMITADOR;
		linha+= r9990.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r9990.getQTD_LIN_9()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha9999(R9999 r9999){
		String linha = DELIMITADOR;
		linha+= r9999.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r9999.getQTD_LIN()) + DELIMITADOR;
		return linha;
	}

}
