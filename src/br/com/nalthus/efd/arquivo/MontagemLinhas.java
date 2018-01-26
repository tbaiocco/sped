package br.com.nalthus.efd.arquivo;

import br.com.nalthus.efd.modelo.R0000;
import br.com.nalthus.efd.modelo.R0001;
import br.com.nalthus.efd.modelo.R0005;
import br.com.nalthus.efd.modelo.R0100;
import br.com.nalthus.efd.modelo.R0150;
import br.com.nalthus.efd.modelo.R0190;
import br.com.nalthus.efd.modelo.R0200;
import br.com.nalthus.efd.modelo.R0400;
import br.com.nalthus.efd.modelo.R0450;
import br.com.nalthus.efd.modelo.R0460;
import br.com.nalthus.efd.modelo.R0500;
import br.com.nalthus.efd.modelo.R0600;
import br.com.nalthus.efd.modelo.R0990;
import br.com.nalthus.efd.modelo.R9001;
import br.com.nalthus.efd.modelo.R9900;
import br.com.nalthus.efd.modelo.R9990;
import br.com.nalthus.efd.modelo.R9999;
import br.com.nalthus.efd.modelo.RC001;
import br.com.nalthus.efd.modelo.RC100;
import br.com.nalthus.efd.modelo.RC170;
import br.com.nalthus.efd.modelo.RC190;
import br.com.nalthus.efd.modelo.RC195;
import br.com.nalthus.efd.modelo.RC197;
import br.com.nalthus.efd.modelo.RC500;
import br.com.nalthus.efd.modelo.RC590;
import br.com.nalthus.efd.modelo.RC990;
import br.com.nalthus.efd.modelo.RD001;
import br.com.nalthus.efd.modelo.RD100;
import br.com.nalthus.efd.modelo.RD130;
import br.com.nalthus.efd.modelo.RD190;
import br.com.nalthus.efd.modelo.RD500;
import br.com.nalthus.efd.modelo.RD590;
import br.com.nalthus.efd.modelo.RD990;
import br.com.nalthus.efd.modelo.RE001;
import br.com.nalthus.efd.modelo.RE990;
import br.com.nalthus.efd.modelo.RG001;
import br.com.nalthus.efd.modelo.RG990;
import br.com.nalthus.efd.modelo.RH001;
import br.com.nalthus.efd.modelo.RH990;
import br.com.nalthus.sped.util.StringUtil;

public class MontagemLinhas {

	public final static String DELIMITADOR = "|";

	public static String montaLinha0000(R0000 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= reg.getCOD_VER() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_FIN(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_INI(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_FIN(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCPF(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getUF(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIE(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(StringUtil.alinhaNumeroDireita(reg.getCOD_MUN(),7),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUFRAMA(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_PERFIL(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_ATIV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0001(R0001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0005(R0005 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getFANTASIA(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCEP(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEND(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM(),10) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOMPL(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getBAIRRO(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getFONE(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getFAX(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEMAIL()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0100(R0100 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCPF(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCRC(),15) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCEP(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEND(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM(),10) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOMPL(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getBAIRRO(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getFONE(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getFAX(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEMAIL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(StringUtil.alinhaNumeroDireita(reg.getCOD_MUN(),7),7) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0150(R0150 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNOME(),100) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PAIS(),5) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCPF(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIE(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(StringUtil.alinhaNumeroDireita(reg.getCOD_MUN(),7),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUFRAMA(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEND(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM(),10) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOMPL(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getBAIRRO(),60) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0190(R0190 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getUNID(),6) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESCR()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0200(R0200 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ITEM(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESCR_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_BARRA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ANT_ITEM(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getUNID_INV(),6) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getTIPO_ITEM(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_NCM(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getEX_IPI(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_GEN(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_LST(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ICMS()) + DELIMITADOR;
		linha+= "" + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0400(R0400 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_NAT(),10) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESCR_NAT()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0450(R0450 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_INF(),6) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getTXT()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0460(R0460 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_OBS(),6) + DELIMITADOR;
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
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNOME_CTA(),60) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0600(R0600 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_ALT(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CCUS(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCCUS(),60) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0990(R0990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_0()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC001(RC001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_MOV(),1) + DELIMITADOR;
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
		linha+= StringUtil.retornaValidado(reg.getSER(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_DOC(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCHV_NFE(),44) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_E_S(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_DOC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_PGTO(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_ABAT_NT()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_MERC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_FRT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_FRT()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_SEG()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_OUT_DA()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_BC_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_PIS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_COFINS_ST()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC170(RC170 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_ITEM(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ITEM(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESCR_COMPL()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getQTD()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getUNID(),6) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ITEM()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_MOV(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_ICMS(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_NAT(),10) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_APUR(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_IPI(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ENQ(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_PIS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQUANT_BC_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getALIQ_PIS_REAIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_COFINS(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQUANT_BC_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getALIQ_COFINS_REAIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA(),3) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC190(RC190 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_ICMS(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_OPR()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_RED_BC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_IPI()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_OBS(),6) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC195(RC195 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_OBS(),6) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getTXT_COMPL()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC197(RC197 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_AJ(),10) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDESCR_COMPL_AJ()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_ITEM(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_OUTROS()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC500(RC500 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_OPER(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_EMIT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MOD(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_SIT(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSER(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUB(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CONS(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_DOC(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_E_S(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DOC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_FORN()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_SERV_NT()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_TERC()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_DA()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_INF(),6) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getTP_LIGACAO(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_GRUPO_TENSAO(),2) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC590(RC590 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_ICMS(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_OPR()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_RED_BC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_OBS(),6) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaC990(RC990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_C()) + DELIMITADOR;
		return linha;
	}
	//terminei aqui 09/01/13
	public static String montaLinhaD001(RD001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD100(RD100 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_OPER(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_EMIT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MOD(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_SIT(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSER(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUB(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getNUM_DOC(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCHV_CTE(),44) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_DOC(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getDT_A_P(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getTP_CTE(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCHV_CTE_REF(),44) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_DOC()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_DESC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_FRT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_SERV()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_NT()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_INF(),6) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MUN_ORIG(),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MUN_DEST(),7) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD130(RD130 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART_CONSG(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART_RED(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_FRT_RED(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MUN_ORIG(),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MUN_DEST(),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getVEIC_ID(),7) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_LIQ_FRT()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_SEC_CAT()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_DESP()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_PEDG()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_OUT()) + DELIMITADOR;
		linha+= StringUtil.retornaValorBranco(reg.getVL_FRT()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getUF_ID(),2) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD190(RD190 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_ICMS(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_OPR()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_RED_BC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_OBS()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD500(RD500 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_OPER(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_EMIT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_PART(),60) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_MOD(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_SIT(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSER(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getSUB(),3) + DELIMITADOR;
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
		linha+= StringUtil.retornaValidado(reg.getCOD_INF(),6) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_PIS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_COFINS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getTP_ASSINANTE(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD590(RD590 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCST_ICMS(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCFOP(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getALIQ_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_OPR()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_BC_ICMS_UF()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_ICMS_UF()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(reg.getVL_RED_BC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getCOD_OBS(),6) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaD990(RD990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_D()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaE001(RE001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaE990(RE990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_E()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaG001(RG001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaG990(RG990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_G()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaH001(RH001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaH990(RH990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_H()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaK001(br.com.nalthus.efd.modelo.RK001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaK990(br.com.nalthus.efd.modelo.RK990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_K()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha1001(br.com.nalthus.efd.modelo.R1001 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(reg.getIND_MOV(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha1010(br.com.nalthus.efd.modelo.R1010 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_EXP(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_CCRF(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_COMB(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_USINA(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_VA(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_EE(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_CART(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_FORM(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getIND_AER(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha1990(br.com.nalthus.efd.modelo.R1990 reg){
		String linha = DELIMITADOR;
		linha+= reg.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(reg.getQTD_LIN_1()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha9001(R9001 r9001){
		String linha = DELIMITADOR;
		linha+= r9001.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r9001.getIND_MOV(),1) + DELIMITADOR;
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
