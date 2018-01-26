package br.com.nalthus.sped.arquivo;

import java.util.Iterator;

import br.com.nalthus.sped.modelo.ArquivoContabil;
import br.com.nalthus.sped.modelo.ArquivoMANAD;
import br.com.nalthus.sped.modelo.R0007;
import br.com.nalthus.sped.modelo.R0020;
import br.com.nalthus.sped.modelo.R0150;
import br.com.nalthus.sped.modelo.R0180;
import br.com.nalthus.sped.modelo.R0990;
import br.com.nalthus.sped.modelo.R9900;
import br.com.nalthus.sped.modelo.R9990;
import br.com.nalthus.sped.modelo.R9999;
import br.com.nalthus.sped.modelo.RI;
import br.com.nalthus.sped.modelo.RI012;
import br.com.nalthus.sped.modelo.RI015;
import br.com.nalthus.sped.modelo.RI020;
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
import br.com.nalthus.sped.modelo.RI510;
import br.com.nalthus.sped.modelo.RI550;
import br.com.nalthus.sped.modelo.RI555;
import br.com.nalthus.sped.modelo.RI990;
import br.com.nalthus.sped.modelo.RJ;
import br.com.nalthus.sped.modelo.RJ005;
import br.com.nalthus.sped.modelo.RJ100;
import br.com.nalthus.sped.modelo.RJ150;
import br.com.nalthus.sped.modelo.RJ800;
import br.com.nalthus.sped.modelo.RJ900;
import br.com.nalthus.sped.modelo.RJ930;
import br.com.nalthus.sped.modelo.RJ990;
import br.com.nalthus.sped.modelo.RM0050;
import br.com.nalthus.sped.modelo.RM0100;
import br.com.nalthus.sped.modelo.RM0990;
import br.com.nalthus.sped.modelo.RMI;
import br.com.nalthus.sped.modelo.RMI150;
import br.com.nalthus.sped.modelo.RMI200;
import br.com.nalthus.sped.modelo.RMI250;
import br.com.nalthus.sped.util.ManipulaArquivo;
import br.com.nalthus.sped.util.StringUtil;

/**
 * Classe responsavel por gerar o arquivo e retorna-lo pronto para envio
 * para a Receita.
 * @author teo
 *
 */
public class GeraArquivoMANAD {
	private final static String DUAS_CASAS_DEC = "#0.00";
	private final static String TRES_CASAS_DEC = "#0.000";
	private final static String QUATRO_CASAS_DEC = "#0.0000";
	private final static String CINCO_CASAS_DEC = "#0.00000";
	private final static String SEIS_CASAS_DEC = "#0.000000";

	private final static String DELIMITADOR = "|";

	private String tipo_geracao; //TXT ou XML

	public String getTipo_geracao() {
		return tipo_geracao;
	}
	public void setTipo_geracao(String tipo_geracao) {
		this.tipo_geracao = tipo_geracao;
	}

	/**
	 * Metodo gerador do arquivo formato TXT.
	 * Cria o arquivo no filesystem, de acordo com o parametro no arquivo spedc.properties
	 * @param ArquivoContabil sped - são os dados a serem gerados
	 * @return
	 */
	public static String geraTXT(ArquivoMANAD sped){
		String toReturn = "";
		int counter = 1;
		int qtd_lin_0 = 0;
		int qtd_lin_I = 0;
		int qtd_lin_K = 2;
		int qtd_lin_L = 2;
		int qtd_lin_9 = 0;
		int qtd_lin   = 0;

		String linha = "";
		String nrNF = "";

		System.out.println("inicia montagem...");

		try{
			ManipulaArquivo arq = new ManipulaArquivo(DELIMITADOR);
			//BLOCO 0
//			R0000 r0000 = sped.getBloco0();
			System.out.println("Bloco 0...");
			arq.insereLinha(MontagemLinhas.montaLinhaM0000(sped.getBloco0()).substring(1));
			qtd_lin_0++;
			arq.insereLinha(MontagemLinhas.montaLinhaM0001(sped.getBloco0().getRm0001()).substring(1));
			qtd_lin_0++;
			Iterator it = sped.getBloco0().getRm0001().getListaRM0050().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinhaM0050((RM0050)it.next()).substring(1));
				qtd_lin_0++;
			}
			it = sped.getBloco0().getRm0001().getListaRM0100().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinhaM0100((RM0100)it.next()).substring(1));
				qtd_lin_0++;
			}
			RM0990 r0990 = sped.getBloco0().getRm0990();
			qtd_lin_0++;
			r0990.setQTD_LIN_0(String.valueOf(qtd_lin_0));
			arq.insereLinha(MontagemLinhas.montaLinhaM0990(r0990).substring(1));

			//BLOCO I
			System.out.println("Bloco I...");
			RMI rI = sped.getBlocoI();
			arq.insereLinha(MontagemLinhas.montaLinhaI001(rI.getRmI001()).substring(1));
			qtd_lin_I++;
			arq.insereLinha(MontagemLinhas.montaLinhaMI005(rI.getRmI005()).substring(1));
			qtd_lin_I++;
			it = rI.getRmI050().iterator();
			while(it.hasNext()){
				RI050 rI050 = (RI050)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaMI050(rI050).substring(1));
				qtd_lin_I++;
			}
			it = rI.getRmI100().iterator();
			while(it.hasNext()){
				RI100 rI100 = (RI100)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaI100(rI100).substring(1));
				qtd_lin_I++;
			}
			it = rI.getRmI150().iterator();
			while(it.hasNext()){
				RMI150 rmI150 = (RMI150)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaMI150(rmI150).substring(1));
				qtd_lin_I++;
			}
			it = rI.getRmI200().iterator();
			while(it.hasNext()){
				RMI200 rmI200 = (RMI200)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaMI200(rmI200).substring(1));
				qtd_lin_I++;
			}
			it = rI.getRmI250().iterator();
			while(it.hasNext()){
				RMI250 rmI250 = (RMI250)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaMI250(rmI250).substring(1));
				qtd_lin_I++;
			}
			RI990 rI990 = rI.getRmI990();
			qtd_lin_I++;
			rI990.setQTD_LIN_I(String.valueOf(qtd_lin_I));
			arq.insereLinha(MontagemLinhas.montaLinhaI990(rI990).substring(1));

			//BLOCO K
			System.out.println("Bloco K...");
			arq.insereLinha(sped.getK_linha1());
			qtd_lin_K++;
			arq.insereLinha(sped.getK_linha2());
			qtd_lin_K++;
			//BLOCO L
			System.out.println("Bloco L...");
			arq.insereLinha(sped.getL_linha1());
			qtd_lin_L++;
			arq.insereLinha(sped.getL_linha2());
			qtd_lin_L++;

			//BLOCO 9
			R9999 r9999 = sped.getBloco9();
			arq.insereLinha(MontagemLinhas.montaLinha9001(sped.getBloco9().getR9001()).substring(1));
			qtd_lin_9++;
			it = sped.getBloco9().getR9001().getR9900().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinha9900((R9900)it.next()).substring(1));
				qtd_lin_9++;
			}
			R9990 r9990 = sped.getBloco9().getR9990();
			qtd_lin_9++;
			r9990.setQTD_LIN_9(String.valueOf(qtd_lin_9+1));
			arq.insereLinha(MontagemLinhas.montaLinha9990(r9990).substring(1));
//			qtd_lin=new Integer(r9999.getQTD_LIN()).intValue();
			qtd_lin=qtd_lin_0+qtd_lin_I+qtd_lin_9;
			r9999.setQTD_LIN(String.valueOf(qtd_lin+1));
			arq.insereLinha(MontagemLinhas.montaLinha9999(r9999).substring(1));
//			arq.insereLinha("\r\n");

			//FIM do arquivo
//			Escrever arquivo
			String filename = ("SPED_CTB_manad_2008.txt");
			System.out.println("vai escrever arq: "+filename);
			arq.escreveArquivo(ManipulaArquivo.getCaminhoPadrao(), filename);
			toReturn = ManipulaArquivo.getCaminhoPadrao()+filename;
		} catch (Exception e){
			e.printStackTrace();
			//do something...
		}

		return toReturn;
	}

	/**
	 * Metodo gerador do arquivo formato TXT.
	 * Cria o arquivo no filesystem, de acordo com o parametro no arquivo spedc.properties
	 * @param ArquivoContabil sped - são os dados a serem gerados
	 * @return
	 */
	public static String geraTXTlinhaG(ArquivoContabil sped){
		String toReturn = "";
		int counter = 1;
		int qtd_lin_0 = 0;
		int qtd_lin_I = 0;
		int qtd_lin_J = 0;
		int qtd_lin_9 = 0;
		int qtd_lin   = 0;

		String linha = "";
		String nrNF = "";

		System.out.println("inicia montagem...");

		try{
			ManipulaArquivo arq = new ManipulaArquivo(DELIMITADOR);
			//BLOCO 0
//			R0000 r0000 = sped.getBloco0();
			arq.insereLinha(MontagemLinhas.montaLinha0000(sped.getBloco0()));
			qtd_lin_0++;
			arq.insereLinha(MontagemLinhas.montaLinha0001(sped.getBloco0().getR0001()));
			qtd_lin_0++;
			Iterator it = sped.getBloco0().getR0001().getListaR0007().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinha0007((R0007)it.next()));
				qtd_lin_0++;
			}
			it = sped.getBloco0().getR0001().getListaR0020().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinha0020((R0020)it.next()));
				qtd_lin_0++;
			}
			it = sped.getBloco0().getR0001().getListaR0150().iterator();
			while(it.hasNext()){
				R0150 r0150 = (R0150)it.next();
				arq.insereLinha(MontagemLinhas.montaLinha0150(r0150));
				qtd_lin_0++;
				Iterator it2 = r0150.getListaR0180().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinha0180((R0180)it2.next()));
					qtd_lin_0++;
				}
			}
			R0990 r0990 = sped.getBloco0().getR0990();
			qtd_lin_0++;
			r0990.setQTD_LIN_0(String.valueOf(qtd_lin_0));
			arq.insereLinha(MontagemLinhas.montaLinha0990(r0990));

			//BLOCO I
			RI rI = sped.getBlocoI();
			arq.insereLinha(MontagemLinhas.montaLinhaI001(rI.getRI001()));
			qtd_lin_I++;
			arq.insereLinha(MontagemLinhas.montaLinhaI010(rI.getRI001().getRI010()));
			qtd_lin_I++;
			it = rI.getRI001().getRI010().getRI012().iterator();
			while(it.hasNext()){
				RI012 rI012 = (RI012)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaI012(rI012));
				qtd_lin_I++;
				Iterator it2 = rI012.getRI015().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaI015((RI015)it2.next()));
					qtd_lin_I++;
				}
			}
			it = rI.getRI001().getRI010().getRI020().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinhaI020((RI020)it.next()));
				qtd_lin_I++;
			}
			arq.insereLinha(MontagemLinhas.montaLinhaI030(rI.getRI001().getRI010().getRI030()));
			qtd_lin_I++;
			it = rI.getRI001().getRI010().getRI050().iterator();
			while(it.hasNext()){
				RI050 rI050 = (RI050)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaI050(rI050));
				qtd_lin_I++;
				Iterator it2 = rI050.getRI051().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaI051((RI051)it2.next()));
					qtd_lin_I++;
				}
				it2 = rI050.getRI052().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaI052((RI052)it2.next()));
					qtd_lin_I++;
				}
			}
			it = rI.getRI001().getRI010().getRI075().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinhaI075((RI075)it.next()));
				qtd_lin_I++;
			}
			it = rI.getRI001().getRI010().getRI100().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinhaI100((RI100)it.next()));
				qtd_lin_I++;
			}
			it = rI.getRI001().getRI010().getRI150().iterator();
			while(it.hasNext()){
				RI150 rI150 = (RI150)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaI150(rI150));
				qtd_lin_I++;
				Iterator it2 = rI150.getRI151().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaI151((RI151)it2.next()));
					qtd_lin_I++;
				}
				it2 = rI150.getRI155().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaI155((RI155)it2.next()));
					qtd_lin_I++;
				}
			}
			it = rI.getRI001().getRI010().getRI200().iterator();
			while(it.hasNext()){
				RI200 rI200 = (RI200)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaI200(rI200));
				qtd_lin_I++;
				Iterator it2 = rI200.getRI250().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaI250((RI250)it2.next()));
					qtd_lin_I++;
				}
			}
			it = rI.getRI001().getRI010().getRI300().iterator();
			while(it.hasNext()){
				RI300 rI300 = (RI300)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaI300(rI300));
				qtd_lin_I++;
				Iterator it2 = rI300.getRI310().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaI310((RI310)it2.next()));
					qtd_lin_I++;
				}
			}
			it = rI.getRI001().getRI010().getRI350().iterator();
			while(it.hasNext()){
				RI350 rI350 = (RI350)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaI350(rI350));
				qtd_lin_I++;
				Iterator it2 = rI350.getRI355().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaI355((RI355)it2.next()));
					qtd_lin_I++;
				}
			}
//			arq.insereLinha(MontagemLinhas.montaLinhaI500(rI.getRI001().getRI010().getRI500()));
//			qtd_lin_I++;
//			it = rI.getRI001().getRI010().getRI510().iterator();
//			while(it.hasNext()){
//				arq.insereLinha(MontagemLinhas.montaLinhaI510((RI510)it.next()));
//				qtd_lin_I++;
//			}
//			it = rI.getRI001().getRI010().getRI550().iterator();
//			while(it.hasNext()){
//				RI550 rI550 = (RI550)it.next();
//				arq.insereLinha(MontagemLinhas.montaLinhaI550(rI550));
//				qtd_lin_I++;
//				Iterator it2 = rI550.getRI555().iterator();
//				while(it2.hasNext()){
//					arq.insereLinha(MontagemLinhas.montaLinhaI555((RI555)it2.next()));
//					qtd_lin_I++;
//				}
//			}
			RI990 rI990 = rI.getRI990();
			qtd_lin_I++;
			rI990.setQTD_LIN_I(String.valueOf(qtd_lin_I));
			arq.insereLinha(MontagemLinhas.montaLinhaI990(rI990));

			//BLOCO J
			RJ rJ = sped.getBlocoJ();
			arq.insereLinha(MontagemLinhas.montaLinhaJ001(rJ.getRJ001()));
			qtd_lin_J++;
			it = rJ.getRJ001().getRJ005().iterator();
			while(it.hasNext()){
				RJ005 rJ005 = (RJ005)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaJ005(rJ005));
				qtd_lin_J++;
				Iterator it2 = rJ005.getRJ100().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaJ100((RJ100)it2.next()));
					qtd_lin_J++;
				}
				it2 = rJ005.getRJ150().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaJ150((RJ150)it2.next()));
					qtd_lin_J++;
				}
				it2 = rJ005.getRJ800().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaJ800((RJ800)it2.next()));
					qtd_lin_J++;
				}
			}
			RJ900 rj900 = rJ.getRJ001().getRJ900();
			arq.insereLinha(MontagemLinhas.montaLinhaJ900(rj900));
			qtd_lin_J++;
			Iterator it2 = rj900.getRJ930().iterator();
			while(it2.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinhaJ930((RJ930)it2.next()));
				qtd_lin_J++;
			}

			RJ990 rJ990 = rJ.getRJ990();
			qtd_lin_J++;
			rJ990.setQTD_LIN_J(String.valueOf(qtd_lin_J));
			arq.insereLinha(MontagemLinhas.montaLinhaJ990(rJ990));

			//BLOCO 9
			R9999 r9999 = sped.getBloco9();
			arq.insereLinha(MontagemLinhas.montaLinha9001(sped.getBloco9().getR9001()));
			qtd_lin_9++;
			it = sped.getBloco9().getR9001().getR9900().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinha9900((R9900)it.next()));
				qtd_lin_9++;
			}
			R9990 r9990 = sped.getBloco9().getR9990();
			qtd_lin_9++;
			r9990.setQTD_LIN_9(String.valueOf(qtd_lin_9));
			arq.insereLinha(MontagemLinhas.montaLinha9990(r9990));
			qtd_lin=qtd_lin_0+qtd_lin_I+qtd_lin_J+qtd_lin_9;
			r9999.setQTD_LIN(String.valueOf(qtd_lin));
			arq.insereLinha(MontagemLinhas.montaLinha9999(r9999));

			//FIM do arquivo
//			Escrever arquivo
			String filename = ("SPED_CTB_"+StringUtil.getDataYMD().substring(0,6)).concat(".txt");
			System.out.println("vai escrever arq: "+filename);
			arq.escreveArquivo(ManipulaArquivo.getCaminhoPadrao(), filename);
			toReturn = ManipulaArquivo.getCaminhoPadrao()+filename;
		} catch (Exception e){
			e.printStackTrace();
			//do something...
		}

		return toReturn;
	}
}
