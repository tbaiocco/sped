package br.com.nalthus.sped.arquivo;

import java.util.Iterator;

import br.com.nalthus.sped.modelo.DetRI510;
import br.com.nalthus.sped.modelo.R0000;
import br.com.nalthus.sped.modelo.R0001;
import br.com.nalthus.sped.modelo.R0007;
import br.com.nalthus.sped.modelo.R0020;
import br.com.nalthus.sped.modelo.R0150;
import br.com.nalthus.sped.modelo.R0180;
import br.com.nalthus.sped.modelo.R0990;
import br.com.nalthus.sped.modelo.R9001;
import br.com.nalthus.sped.modelo.R9900;
import br.com.nalthus.sped.modelo.R9990;
import br.com.nalthus.sped.modelo.R9999;
import br.com.nalthus.sped.modelo.RI001;
import br.com.nalthus.sped.modelo.RI010;
import br.com.nalthus.sped.modelo.RI012;
import br.com.nalthus.sped.modelo.RI015;
import br.com.nalthus.sped.modelo.RI020;
import br.com.nalthus.sped.modelo.RI030;
import br.com.nalthus.sped.modelo.RI050;
import br.com.nalthus.sped.modelo.RI051;
import br.com.nalthus.sped.modelo.RI052;
import br.com.nalthus.sped.modelo.RI075;
import br.com.nalthus.sped.modelo.RI100;
import br.com.nalthus.sped.modelo.RI150;
import br.com.nalthus.sped.modelo.RI151;
import br.com.nalthus.sped.modelo.RI155;
import br.com.nalthus.sped.modelo.RI200;
import br.com.nalthus.sped.modelo.RI250;
import br.com.nalthus.sped.modelo.RI300;
import br.com.nalthus.sped.modelo.RI310;
import br.com.nalthus.sped.modelo.RI350;
import br.com.nalthus.sped.modelo.RI355;
import br.com.nalthus.sped.modelo.RI500;
import br.com.nalthus.sped.modelo.RI510;
import br.com.nalthus.sped.modelo.RI550;
import br.com.nalthus.sped.modelo.RI555;
import br.com.nalthus.sped.modelo.RI990;
import br.com.nalthus.sped.modelo.RJ001;
import br.com.nalthus.sped.modelo.RJ005;
import br.com.nalthus.sped.modelo.RJ100;
import br.com.nalthus.sped.modelo.RJ150;
import br.com.nalthus.sped.modelo.RJ800;
import br.com.nalthus.sped.modelo.RJ900;
import br.com.nalthus.sped.modelo.RJ930;
import br.com.nalthus.sped.modelo.RJ990;
import br.com.nalthus.sped.modelo.RM0000;
import br.com.nalthus.sped.modelo.RM0001;
import br.com.nalthus.sped.modelo.RM0050;
import br.com.nalthus.sped.modelo.RM0100;
import br.com.nalthus.sped.modelo.RM0990;
import br.com.nalthus.sped.modelo.RMI005;
import br.com.nalthus.sped.modelo.RMI150;
import br.com.nalthus.sped.modelo.RMI200;
import br.com.nalthus.sped.modelo.RMI250;
import br.com.nalthus.sped.util.StringUtil;

public class MontagemLinhas {

	private final static String DELIMITADOR = "|";

	public static String montaLinha0000(R0000 r0000){
		String linha = DELIMITADOR;
		linha+= r0000.getREG() + DELIMITADOR;
		linha+= r0000.getLECD() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getDT_INI(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getDT_FIN(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getUF(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getIE()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(StringUtil.alinhaNumeroDireita(r0000.getCOD_MUN(),7),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getIM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getIND_SIT_ESP(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaM0000(RM0000 r0000){
		String linha = DELIMITADOR;
		linha+= r0000.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getCPF(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getCEI(),12) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getNIT(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getUF(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getIE()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(StringUtil.alinhaNumeroDireita(r0000.getCOD_MUN(),7),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getIM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getSUFRAMA(),9) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getIND_CENTR()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getDT_INI(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getDT_FIN(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getCOD_VER()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getCOD_FIN()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0000.getIND_ED());
		return linha;
	}
	public static String montaLinha0001(R0001 r0001){
		String linha = DELIMITADOR;
		linha+= r0001.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(r0001.getIND_DAD(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaM0001(RM0001 r0001){
		String linha = DELIMITADOR;
		linha+= r0001.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(r0001.getIND_DAD(),1);
		return linha;
	}
	public static String montaLinha0007(R0007 r0007){
		String linha = DELIMITADOR;
		linha+= r0007.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0007.getCOD_ENT_REF()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0007.getCOD_INSCR()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0020(R0020 r0020){
		String linha = DELIMITADOR;
		linha+= r0020.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0020.getIND_DEC(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0020.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0020.getUF(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0020.getIE()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0020.getCOD_MUN(),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0020.getIM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0020.getNIRE(),11) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaM0050(RM0050 r0050){
		String linha = DELIMITADOR;
		linha+= r0050.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getCPF(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getCRC(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getDT_INI(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getDT_FIN(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getEND()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getNUM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getCOMPL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getBAIRRO()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getCEP(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getCP()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getCEP_CP(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getFONE()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getFAX()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0050.getEMAIL());
		return linha;
	}
	public static String montaLinhaM0100(RM0100 r0100){
		String linha = DELIMITADOR;
		linha+= r0100.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0100.getEMP_TEC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0100.getCARGO()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0100.getDT_INI_SERV_INF(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0100.getDT_FIN_SERV_INF(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0100.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0100.getCPF(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0100.getFONE()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0100.getFAX()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0100.getEMAIL());
		return linha;
	}
	public static String montaLinha0150(R0150 r0150){
		String linha = DELIMITADOR;
		linha+= r0150.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getCOD_PART()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getCOD_PAIS(),5) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getCPF(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getNIT(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getUF(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getIE()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getIE_ST()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getCOD_MUN(),7) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getIM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0150.getSUFRAMA(),9) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0180(R0180 r0180){
		String linha = DELIMITADOR;
		linha+= r0180.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0180.getCOD_REL(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0180.getDT_INI_REL(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0180.getDT_FIN_REL(),8) + DELIMITADOR;
		return linha;
	}
	public static String montaLinha0990(R0990 r0990){
		String linha = DELIMITADOR;
		linha+= r0990.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0990.getQTD_LIN_0()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaM0990(RM0990 r0990){
		String linha = DELIMITADOR;
		linha+= r0990.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r0990.getQTD_LIN_0());
		return linha;
	}
	public static String montaLinhaI001(RI001 rI001){
		String linha = DELIMITADOR;
		linha+= rI001.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(rI001.getIND_DAD(),1);
		return linha;
	}
	public static String montaLinhaMI005(RMI005 rmI005){
		String linha = DELIMITADOR;
		linha+= rmI005.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI005.getIND_ESC(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI005.getCOD_CTA());
		return linha;
	}
	public static String montaLinhaI010(RI010 rI010){
		String linha = DELIMITADOR;
		linha+= rI010.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI010.getIND_ESC(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI010.getCOD_VER_LC()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI012(RI012 rI012){
		String linha = DELIMITADOR;
		linha+= rI012.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI012.getNUM_ORD()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI012.getNAT_LIVR(),80) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI012.getTIPO(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI012.getCOD_HASH_AUX(),40) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI015(RI015 rI015){
		String linha = DELIMITADOR;
		linha+= rI015.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI015.getCOD_CTA_RES()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI020(RI020 rI020){
		String linha = DELIMITADOR;
		linha+= rI020.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI020.getREG_COD(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI020.getNUM_AD()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI020.getCAMPO()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI020.getDESCRICAO()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI020.getTIPO()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI030(RI030 rI030){
		String linha = DELIMITADOR;
		linha+= rI030.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI030.getDNRC_ABERT(),17) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI030.getNUM_ORD()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI030.getNAT_LIVR(),80) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI030.getQTD_LIN()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI030.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI030.getNIRE(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI030.getCNPJ(),14) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI030.getDT_ARQ(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI030.getDT_ARQ_CONV(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI030.getDESC_MUN()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI050(RI050 rI050){
		String linha = DELIMITADOR;
		linha+= rI050.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getDT_ALT(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getCOD_NAT(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getIND_CTA(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getNIVEL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getCOD_CTA_SUP()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getCTA()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaMI050(RI050 rI050){
		String linha = DELIMITADOR;
		linha+= rI050.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getDT_ALT(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getCOD_NAT(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getIND_CTA(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getNIVEL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getCOD_CTA_SUP()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI050.getCTA());
		return linha;
	}
	public static String montaLinhaI051(RI051 rI051){
		String linha = DELIMITADOR;
		linha+= rI051.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI051.getCOD_ENT_REF(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI051.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI051.getCOD_CTA_REF()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI052(RI052 rI052){
		String linha = DELIMITADOR;
		linha+= rI052.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI052.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI052.getCOD_AGL()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI075(RI075 rI075){
		String linha = DELIMITADOR;
		linha+= rI075.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI075.getCOD_HIST()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI075.getDESCR_HIST()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI100(RI100 rI100){
		String linha = DELIMITADOR;
		linha+= rI100.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI100.getDT_ALT(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI100.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI100.getCCUS());
		return linha;
	}
	public static String montaLinhaI150(RI150 rI150){
		String linha = DELIMITADOR;
		linha+= rI150.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI150.getDT_INI(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI150.getDT_FIN(),8) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaMI150(RMI150 rmI150){
		String linha = DELIMITADOR;
		linha+= rmI150.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI150.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI150.getCOMP_SALDO(),6) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rmI150.getVL_SLD_INI()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI150.getIND_DC_INI(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rmI150.getVL_DEB()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rmI150.getVL_CRED()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rmI150.getVL_SLD_FIN()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI150.getIND_DC_FIN(),1);
		return linha;
	}
	public static String montaLinhaI151(RI151 rI151){
		String linha = DELIMITADOR;
		linha+= rI151.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI151.getASSIM_DIG()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI155(RI155 rI155){
		String linha = DELIMITADOR;
		linha+= rI155.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI155.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI155.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rI155.getVL_SLD_INI()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI155.getIND_DC_INI(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rI155.getVL_DEB()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rI155.getVL_CRED()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rI155.getVL_SLD_FIN()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI155.getIND_DC_FIN(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI200(RI200 rI200){
		String linha = DELIMITADOR;
		linha+= rI200.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI200.getNUM_LCTO()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI200.getDT_LCTO(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rI200.getVL_LCTO()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI200.getIND_LCTO(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI250(RI250 rI250){
		String linha = DELIMITADOR;
		linha+= rI250.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI250.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI250.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rI250.getVL_DC()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI250.getIND_DC(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI250.getNUM_ARQ()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI250.getCOD_HIST_PAD()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI250.getHIST()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI250.getCOD_PART()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaMI200(RMI200 rmI200){
		String linha = DELIMITADOR;
		linha+= rmI200.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI200.getDT_LCTO(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI200.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI200.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI200.getCOD_CP()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rmI200.getVL_DEB_CRED()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI200.getIND_DEB_CRED(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI200.getNUM_ARQ()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI200.getNUM_LCTO()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI200.getIND_LCTO(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI200.getHIST_LCTO());
		return linha;
	}
	public static String montaLinhaMI250(RMI250 rmI250){
		String linha = DELIMITADOR;
		linha+= rmI250.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI250.getDT_RES(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI250.getCOD_GRP_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rmI250.getVL_GRP_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rmI250.getSLD_FIN(),1);
		return linha;
	}
	public static String montaLinhaI300(RI300 rI300){
		String linha = DELIMITADOR;
		linha+= rI300.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI300.getDT_BCTE(),8) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI310(RI310 rI310){
		String linha = DELIMITADOR;
		linha+= rI310.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI310.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI310.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI310.getVAL_DEBD()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI310.getVAL_CRED()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI350(RI350 rI350){
		String linha = DELIMITADOR;
		linha+= rI350.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI350.getDT_RES(),8) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI355(RI355 rI355){
		String linha = DELIMITADOR;
		linha+= rI355.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI355.getCOD_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI355.getCOD_CCUS()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI355.getVL_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI355.getIND_DC()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI500(RI500 rI500){
		String linha = DELIMITADOR;
		linha+= rI500.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI500.getTAM_FONTE(),2) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI510(RI510 rI510){
		String linha = DELIMITADOR;
		linha+= rI510.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI510.getNM_CAMPO(),16) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI510.getDESC_CAMPO(),50) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI510.getTIPO_CAMPO(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI510.getTAM_CAMPO(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI510.getDEC_CAMPO(),2) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI510.getCOL_CAMPO(),3) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI550(RI550 rI550){
		String linha = DELIMITADOR;
		linha+= rI550.getREG() + DELIMITADOR;
		Iterator campos = rI550.getRZ_CONT().iterator();
		while(campos.hasNext()){
			linha += montaLinhaDet510((DetRI510)campos.next());
		}
		return linha;
	}
	public static String montaLinhaI555(RI555 rI555){
		String linha = DELIMITADOR;
		linha+= rI555.getREG() + DELIMITADOR;
		Iterator campos = rI555.getRZ_CONT_TOT().iterator();
		while(campos.hasNext()){
			linha += montaLinhaDet510((DetRI510)campos.next());
		}
		return linha;
	}
	public static String montaLinhaDet510(DetRI510 det){
		String linha = DELIMITADOR;
		linha = det.getCONT_CAMPO() + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaI990(RI990 rI990){
		String linha = DELIMITADOR;
		linha+= rI990.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rI990.getQTD_LIN_I());
		return linha;
	}

	public static String montaLinhaJ001(RJ001 rJ001){
		String linha = DELIMITADOR;
		linha+= rJ001.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(rJ001.getIND_DAD(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaJ005(RJ005 rJ005){
		String linha = DELIMITADOR;
		linha+= rJ005.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ005.getDT_INI(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ005.getDT_FIN(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ005.getID_DEM(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ005.getCAB_DEM()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaJ100(RJ100 rJ100){
		String linha = DELIMITADOR;
		linha+= rJ100.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ100.getCOD_AGL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ100.getNIVEL_AGL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ100.getIND_GRP_BAL(),1) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ100.getDESCR_COD_AGL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ100.getVL_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ100.getIND_DC_BAL(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaJ150(RJ150 rJ150){
		String linha = DELIMITADOR;
		linha+= rJ150.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ150.getCOD_AGL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ150.getNIVEL_AGL()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ150.getDESCR_COD_AGL()) + DELIMITADOR;
		linha+= StringUtil.retornaValor(rJ150.getVL_CTA()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ150.getIND_VL(),1) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaJ800(RJ800 rJ800){
		String linha = DELIMITADOR;
		linha+= rJ800.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ800.getARQ_RTF()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ800.getIND_FIM_RTF()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaJ900(RJ900 rJ900){
		String linha = DELIMITADOR;
		linha+= rJ900.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ900.getDNRC_ENCER(),21) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ900.getNUM_ORD()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ900.getNAT_LIVR(),80) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ900.getNOME()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ900.getQTD_LIN()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ900.getDT_INI_ESCR(),8) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ900.getDT_FIN_ESCR(),8) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaJ930(RJ930 rJ930){
		String linha = DELIMITADOR;
		linha+= rJ930.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ930.getIDENT_NOM()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ930.getIDENT_CPF(),11) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ930.getIDENT_QUALIF()) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ930.getCOD_ASSIM(),3) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ930.getIND_CRC()) + DELIMITADOR;
		return linha;
	}
	public static String montaLinhaJ990(RJ990 rJ990){
		String linha = DELIMITADOR;
		linha+= rJ990.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(rJ990.getQTD_LIN_J()) + DELIMITADOR;
		return linha;
	}

	public static String montaLinha9001(R9001 r9001){
		String linha = DELIMITADOR;
		linha+= r9001.getREG() + DELIMITADOR;
		linha+= StringUtil.trunc(r9001.getIND_DAD(),1);
		return linha;
	}
	public static String montaLinha9900(R9900 r9900){
		String linha = DELIMITADOR;
		linha+= r9900.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r9900.getREG_BLC(),4) + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r9900.getQTD_REG_BLC());
		return linha;
	}
	public static String montaLinha9990(R9990 r9990){
		String linha = DELIMITADOR;
		linha+= r9990.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r9990.getQTD_LIN_9());
		return linha;
	}
	public static String montaLinha9999(R9999 r9999){
		String linha = DELIMITADOR;
		linha+= r9999.getREG() + DELIMITADOR;
		linha+= StringUtil.retornaValidado(r9999.getQTD_LIN());
		return linha;
	}

}
