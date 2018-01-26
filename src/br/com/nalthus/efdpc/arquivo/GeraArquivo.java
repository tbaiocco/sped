package br.com.nalthus.efdpc.arquivo;

import java.util.Iterator;

import br.com.nalthus.efdpc.modelo.*;
import br.com.nalthus.sped.util.ManipulaArquivo;

/**
 * Classe responsavel por gerar o arquivo e retorna-lo pronto para envio
 * para a Receita.
 * @author teo
 *
 */
public class GeraArquivo {
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
	 * @param ArquivoSpedFiscal sped - são os dados a serem gerados
	 * @return
	 */
	public static String geraTXT(ArquivoSpedPC sped){
		String toReturn = "";
		int counter = 1;
		int qtd_lin_0 = 0;
		int qtd_lin_A = 0;
		int qtd_lin_C = 0;
		int qtd_lin_D = 0;
		int qtd_lin_F = 0;
		int qtd_lin_M = 0;
		int qtd_lin_1 = 0;
		int qtd_lin_9 = 0;
		int qtd_lin   = 0;

		String linha = "";
		String nrNF = "";

		System.out.println("inicia montagem...");

		try{
			ManipulaArquivo arq = new ManipulaArquivo(DELIMITADOR);
			//BLOCO 0
//			R0000 r0000 = sped.getBloco0();
			System.out.println("Bloco 0... > Versao 2.01A:"+sped.getBloco0().getCOD_VER());
			arq.insereLinha(MontagemLinhas.montaLinha0000(sped.getBloco0()));
			qtd_lin_0++;
			arq.insereLinha(MontagemLinhas.montaLinha0001(sped.getBloco0().getR0001()));
			qtd_lin_0++;
			Iterator it = sped.getBloco0().getR0001().getListaR0100().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinha0100((R0100)it.next()));
				qtd_lin_0++;
			}
			R0110 r0110 = sped.getBloco0().getR0001().getR0110();
			arq.insereLinha(MontagemLinhas.montaLinha0110(r0110));
			qtd_lin_0++;
			arq.insereLinha(MontagemLinhas.montaLinha0111(r0110.getR0111()));
			qtd_lin_0++;

			it = sped.getBloco0().getR0001().getListaR0140().iterator();
			while(it.hasNext()){
				R0140 r0140 = (R0140)it.next();
				arq.insereLinha(MontagemLinhas.montaLinha0140(r0140));
				qtd_lin_0++;
				Iterator it2 = r0140.getListaR0150().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinha0150((R0150)it2.next()));
					qtd_lin_0++;
				}
				it2 = r0140.getListaR0190().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinha0190((R0190)it2.next()));
					qtd_lin_0++;
				}
				it2 = r0140.getListaR0200().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinha0200((R0200)it2.next()));
					qtd_lin_0++;
				}
				it2 = r0140.getListaR0400().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinha0400((R0400)it2.next()));
					qtd_lin_0++;
				}
				it2 = r0140.getListaR0450().iterator();
				while(it2.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinha0450((R0450)it2.next()));
					qtd_lin_0++;
				}
			}
			it = sped.getBloco0().getR0001().getListaR0500().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinha0500((R0500)it.next()));
				qtd_lin_0++;
			}
			it = sped.getBloco0().getR0001().getListaR0600().iterator();
			while(it.hasNext()){
				arq.insereLinha(MontagemLinhas.montaLinha0600((R0600)it.next()));
				qtd_lin_0++;
			}
			R0990 r0990 = sped.getBloco0().getR0990();
			qtd_lin_0++;
			r0990.setQTD_LIN_0(String.valueOf(qtd_lin_0));
			arq.insereLinha(MontagemLinhas.montaLinha0990(r0990));

			//BLOCO A
			System.out.println("Bloco A...");
			RA rA = sped.getBlocoA();
			arq.insereLinha(MontagemLinhas.montaLinhaA001(rA.getRA001()));
			qtd_lin_A++;
			it = rA.getRA001().getListaRA010().iterator();
			while(it.hasNext()){
				RA010 rA010 = (RA010)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaA010(rA010));
				qtd_lin_A++;
				Iterator it2 = rA010.getListaRA100().iterator();
				while(it2.hasNext()){
					RA100 rA100 = (RA100)it2.next();
					arq.insereLinha(MontagemLinhas.montaLinhaA100(rA100));
					qtd_lin_A++;
					Iterator it3 = rA100.getListaRA170().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaA170((RA170)it3.next()));
						qtd_lin_A++;
					}
				}
			}
			RA990 rA990 = rA.getRA990();
			qtd_lin_A++;
			rA990.setQTD_LIN_A(String.valueOf(qtd_lin_A));
			arq.insereLinha(MontagemLinhas.montaLinhaA990(rA990));

			//BLOCO C
			System.out.println("Bloco C...");
			RC rC = sped.getBlocoC();
			arq.insereLinha(MontagemLinhas.montaLinhaC001(rC.getRC001()));
			qtd_lin_C++;
			it = rC.getRC001().getListaRC010().iterator();
			while(it.hasNext()){
				RC010 rC010 = (RC010)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaC010(rC010));
				qtd_lin_C++;
				Iterator it2 = rC010.getListaRC100().iterator();
				while(it2.hasNext()){
					RC100 rC100 = (RC100)it2.next();
					arq.insereLinha(MontagemLinhas.montaLinhaC100(rC100));
					qtd_lin_C++;
					Iterator it3 = rC100.getListaRC170().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaC170((RC170)it3.next()));
						qtd_lin_C++;
					}
				}
				it2 = rC010.getListaRC180().iterator();
				while(it2.hasNext()){
					RC180 rC180 = (RC180)it2.next();
					arq.insereLinha(MontagemLinhas.montaLinhaC180(rC180));
					qtd_lin_C++;
					Iterator it3 = rC180.getListaRC181().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaC181((RC181)it3.next()));
						qtd_lin_C++;
					}
					it3 = rC180.getListaRC185().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaC185((RC185)it3.next()));
						qtd_lin_C++;
					}
				}
				it2 = rC010.getListaRC190().iterator();
				while(it2.hasNext()){
					RC190 rC190 = (RC190)it2.next();
					arq.insereLinha(MontagemLinhas.montaLinhaC190(rC190));
					qtd_lin_C++;
					Iterator it3 = rC190.getListaRC191().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaC191((RC191)it3.next()));
						qtd_lin_C++;
					}
					it3 = rC190.getListaRC195().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaC195((RC195)it3.next()));
						qtd_lin_C++;
					}
				}
				it2 = rC010.getListaRC500().iterator();
				while(it2.hasNext()){
					RC500 rC500 = (RC500)it2.next();
					arq.insereLinha(MontagemLinhas.montaLinhaC500(rC500));
					qtd_lin_C++;
					Iterator it3 = rC500.getListaRC501().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaC501((RC501)it3.next()));
						qtd_lin_C++;
					}
					it3 = rC500.getListaRC505().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaC505((RC505)it3.next()));
						qtd_lin_C++;
					}
				}
			}
			RC990 rC990 = rC.getRC990();
			qtd_lin_C++;
			rC990.setQTD_LIN_C(String.valueOf(qtd_lin_C));
			arq.insereLinha(MontagemLinhas.montaLinhaC990(rC990));

			//BLOCO D
			System.out.println("Bloco D...");
			RD rD = sped.getBlocoD();
			arq.insereLinha(MontagemLinhas.montaLinhaD001(rD.getRD001()));
			qtd_lin_D++;
			it = rD.getRD001().getListaRD010().iterator();
			while(it.hasNext()){
				RD010 rD010 = (RD010)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaD010(rD010));
				qtd_lin_D++;
				Iterator it2 = rD010.getListaRD200().iterator();
				while(it2.hasNext()){
					RD200 rD200 = (RD200)it2.next();
					arq.insereLinha(MontagemLinhas.montaLinhaD200(rD200));
					qtd_lin_D++;
					Iterator it3 = rD200.getListaRD201().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaD201((RD201)it3.next()));
						qtd_lin_D++;
					}
					it3 = rD200.getListaRD205().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaD205((RD205)it3.next()));
						qtd_lin_D++;
					}
				}
				it2 = rD010.getListaRD500().iterator();
				while(it2.hasNext()){
					RD500 rD500 = (RD500)it2.next();
					arq.insereLinha(MontagemLinhas.montaLinhaD500(rD500));
					qtd_lin_D++;
					Iterator it3 = rD500.getListaRD501().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaD501((RD501)it3.next()));
						qtd_lin_D++;
					}
					it3 = rD500.getListaRD505().iterator();
					while(it3.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaD505((RD505)it3.next()));
						qtd_lin_D++;
					}
				}
			}
			RD990 rD990 = rD.getRD990();
			qtd_lin_D++;
			rD990.setQTD_LIN_D(String.valueOf(qtd_lin_D));
			arq.insereLinha(MontagemLinhas.montaLinhaD990(rD990));

			//BLOCO F
			System.out.println("Bloco F...");
			RF rF = sped.getBlocoF();
			arq.insereLinha(MontagemLinhas.montaLinhaF001(rF.getRF001()));
			qtd_lin_F++;
			it = rF.getRF001().getListaRF010().iterator();
			while(it.hasNext()){
				RF010 rF010 = (RF010)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaF010(rF010));
				qtd_lin_F++;
				//DEMAIS DOCUMENTOS
				Iterator it2 = rF010.getListaRF100().iterator();
				while(it2.hasNext()){
					RF100 rF100 = (RF100)it2.next();
					arq.insereLinha(MontagemLinhas.montaLinhaF100(rF100));
					qtd_lin_F++;
				}
				//AMORTIZAÇOES DE PATRIMONIO
				it2 = rF010.getListaRF120().iterator();
				while(it2.hasNext()){
					RF120 rF120 = (RF120)it2.next();
					arq.insereLinha(MontagemLinhas.montaLinhaF120(rF120));
					qtd_lin_F++;
				}
				//AQUISIÇOES DE PATRIMONIO
				it2 = rF010.getListaRF130().iterator();
				while(it2.hasNext()){
					RF130 rF130 = (RF130)it2.next();
					arq.insereLinha(MontagemLinhas.montaLinhaF130(rF130));
					qtd_lin_F++;
				}
			}
			RF990 rF990 = rF.getRF990();
			qtd_lin_F++;
			rF990.setQTD_LIN_F(String.valueOf(qtd_lin_F));
			arq.insereLinha(MontagemLinhas.montaLinhaF990(rF990));

			//BLOCO M
			System.out.println("Bloco M...");
			RM rM = sped.getBlocoM();
			arq.insereLinha(MontagemLinhas.montaLinhaM001(rM.getRM001()));
			qtd_lin_M++;

			RM990 rM990 = rM.getRM990();
			qtd_lin_M++;
			rM990.setQTD_LIN_M(String.valueOf(qtd_lin_M));
			arq.insereLinha(MontagemLinhas.montaLinhaM990(rM990));

			//BLOCO 1
			System.out.println("Bloco 1...");
			R1 r1 = sped.getBloco1();
			arq.insereLinha(MontagemLinhas.montaLinha1001(r1.getR1001()));
			qtd_lin_1++;

			R1990 r1990 = r1.getR1990();
			qtd_lin_1++;
			r1990.setQTD_LIN_1(String.valueOf(qtd_lin_1));
			arq.insereLinha(MontagemLinhas.montaLinha1990(r1990));

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
			r9990.setQTD_LIN_9(String.valueOf(qtd_lin_9+1));
			arq.insereLinha(MontagemLinhas.montaLinha9990(r9990));
			qtd_lin=new Integer(r9999.getQTD_LIN()).intValue();
			qtd_lin=qtd_lin_0+qtd_lin_A+qtd_lin_C+qtd_lin_D+qtd_lin_F+qtd_lin_M+qtd_lin_1+qtd_lin_9;
			r9999.setQTD_LIN(String.valueOf(qtd_lin+1));
			arq.insereLinha(MontagemLinhas.montaLinha9999(r9999));
//			arq.insereLinha("\r\n");

			//FIM do arquivo
//			Escrever arquivo
			String filename = ("EFD_PIS_COFINS_"+sped.getBloco0().getDT_INI().substring(2)).concat(".txt");
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
