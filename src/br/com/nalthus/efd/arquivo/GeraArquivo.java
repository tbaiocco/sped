package br.com.nalthus.efd.arquivo;

import java.util.Iterator;

import br.com.nalthus.efd.modelo.ArquivoSpedFiscal;
import br.com.nalthus.efd.modelo.*;
import br.com.nalthus.sped.util.ManipulaArquivo;

/**
 * Classe responsavel por gerar o arquivo e retorna-lo pronto para envio para a
 * Receita.
 *
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

	private String tipo_geracao; // TXT ou XML

	public String getTipo_geracao() {
		return tipo_geracao;
	}

	public void setTipo_geracao(String tipo_geracao) {
		this.tipo_geracao = tipo_geracao;
	}

	/**
	 * Metodo gerador do arquivo formato TXT. Cria o arquivo no filesystem, de
	 * acordo com o parametro no arquivo spedc.properties
	 *
	 * @param ArquivoSpedFiscal
	 *            sped - são os dados a serem gerados
	 * @return
	 */
	public static String geraTXT(ArquivoSpedFiscal sped){
		String toReturn = "";
		int counter = 1;
		int qtd_lin_0 = 0;
		int qtd_lin_C = 0;
		int qtd_lin_D = 0;
		int qtd_lin_E = 0;
		int qtd_lin_G = 0;
		int qtd_lin_H = 0;
		int qtd_lin_K = 0;
		int qtd_lin_1 = 0;
		int qtd_lin_9 = 0;
		int qtd_lin   = 0;

		String linha = "";
		String nrNF = "";

		System.out.println("inicia montagem EFD FISCAL...");

		try{
			ManipulaArquivo arq = new ManipulaArquivo(DELIMITADOR);
			// BLOCO 0
// R0000 r0000 = sped.getBloco0();
			System.out.println("Bloco 0... > Versao 2.0.11:"+sped.getBloco0().getCOD_VER());
			arq.insereLinha(MontagemLinhas.montaLinha0000(sped.getBloco0()));
			qtd_lin_0++;
			arq.insereLinha(MontagemLinhas.montaLinha0001(sped.getBloco0().getR0001()));
			qtd_lin_0++;
			arq.insereLinha(MontagemLinhas.montaLinha0005(sped.getBloco0().getR0001().getR0005()));
			qtd_lin_0++;
			arq.insereLinha(MontagemLinhas.montaLinha0100(sped.getBloco0().getR0001().getR0100()));
			qtd_lin_0++;

			Iterator it = sped.getBloco0().getR0001().getListaR0150().iterator();
			while(it.hasNext()){
				br.com.nalthus.efd.modelo.R0150 r0150 = (br.com.nalthus.efd.modelo.R0150)it.next();
				arq.insereLinha(MontagemLinhas.montaLinha0150(r0150));
				qtd_lin_0++;
			}
			it = sped.getBloco0().getR0001().getListaR0190().iterator();
			while(it.hasNext()){
				R0190 r0190 = (R0190)it.next();
				arq.insereLinha(MontagemLinhas.montaLinha0190(r0190));
				qtd_lin_0++;
			}
			it = sped.getBloco0().getR0001().getListaR0200().iterator();
			while(it.hasNext()){
				R0200 r0200 = (R0200)it.next();
				arq.insereLinha(MontagemLinhas.montaLinha0200(r0200));
				qtd_lin_0++;
			}
			it = sped.getBloco0().getR0001().getListaR0400().iterator();
			while(it.hasNext()){
				R0400 r0400 = (R0400)it.next();
				arq.insereLinha(MontagemLinhas.montaLinha0400(r0400));
				qtd_lin_0++;
			}
			it = sped.getBloco0().getR0001().getListaR0450().iterator();
			while(it.hasNext()){
				R0450 r0450 = (R0450)it.next();
				arq.insereLinha(MontagemLinhas.montaLinha0450(r0450));
				qtd_lin_0++;
			}
			it = sped.getBloco0().getR0001().getListaR0460().iterator();
			while(it.hasNext()){
				R0460 r0460 = (R0460)it.next();
				arq.insereLinha(MontagemLinhas.montaLinha0460(r0460));
				qtd_lin_0++;
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

			// BLOCO C
			System.out.println("Bloco C...");
			RC rC = sped.getBlocoC();
			arq.insereLinha(MontagemLinhas.montaLinhaC001(rC.getRC001()));
			qtd_lin_C++;

			Iterator it2 = rC.getRC001().getListaRC100().iterator();
			while(it2.hasNext()){
				RC100 rC100 = (RC100)it2.next();
				arq.insereLinha(MontagemLinhas.montaLinhaC100(rC100));
				qtd_lin_C++;
				Iterator it3 = rC100.getListaRC170().iterator();
				while(it3.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaC170((RC170)it3.next()));
					qtd_lin_C++;
				}
				it3 = rC100.getListaRC190().iterator();
				while(it3.hasNext()){
					RC190 rC190 = (RC190)it3.next();
					arq.insereLinha(MontagemLinhas.montaLinhaC190(rC190));
					qtd_lin_C++;
				}
				it3 = rC100.getListaRC195().iterator();
				while(it3.hasNext()){
					RC195 rC195 = (RC195)it3.next();
					arq.insereLinha(MontagemLinhas.montaLinhaC195(rC195));
					qtd_lin_C++;
					Iterator it4 = rC195.getListaRC197().iterator();
					while(it4.hasNext()){
						arq.insereLinha(MontagemLinhas.montaLinhaC197((RC197)it4.next()));
						qtd_lin_C++;
					}
				}
			}
			it2 = rC.getRC001().getListaRC500().iterator();
			while(it2.hasNext()){
				RC500 rC500 = (RC500)it2.next();
				arq.insereLinha(MontagemLinhas.montaLinhaC500(rC500));
				qtd_lin_C++;
				Iterator it3 = rC500.getListaRC510().iterator();
//				 while(it3.hasNext()){
//				 arq.insereLinha(MontagemLinhas.montaLinhaC510((RC510)it3.next()));
//				 qtd_lin_C++;
//				 }
				it3 = rC500.getListaRC590().iterator();
				while(it3.hasNext()){
					arq.insereLinha(MontagemLinhas.montaLinhaC590((RC590)it3.next()));
					qtd_lin_C++;
				}
			}
			RC990 rC990 = rC.getRC990();
			qtd_lin_C++;
			rC990.setQTD_LIN_C(String.valueOf(qtd_lin_C));
			arq.insereLinha(MontagemLinhas.montaLinhaC990(rC990));

			// BLOCO D
			System.out.println("Bloco D...");
			RD rD = sped.getBlocoD();
			arq.insereLinha(MontagemLinhas.montaLinhaD001(rD.getRD001()));
			qtd_lin_D++;
			it = rD.getRD001().getListaRD100().iterator();
			while(it.hasNext()){
				RD100 rD100 = (RD100)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaD100(rD100));
				qtd_lin_D++;
				if(rD100.getCOD_MOD().equals("08") && rD100.getCOD_SIT().equals("00")){
					arq.insereLinha(MontagemLinhas.montaLinhaD130(rD100.getRD130()));
					qtd_lin_D++;
				}
				Iterator it3 = rD100.getListaRD190().iterator();
				while(it3.hasNext()){
					RD190 rD190 = (RD190)it3.next();
					arq.insereLinha(MontagemLinhas.montaLinhaD190(rD190));
					qtd_lin_D++;
				}
			}
			it = rD.getRD001().getListaRD500().iterator();
			while(it.hasNext()){
				RD500 rD500 = (RD500)it.next();
				arq.insereLinha(MontagemLinhas.montaLinhaD500(rD500));
				qtd_lin_D++;
				Iterator it3 = rD500.getListaRD590().iterator();
				while(it3.hasNext()){
					RD590 rD590 = (RD590)it3.next();
					arq.insereLinha(MontagemLinhas.montaLinhaD590(rD590));
					qtd_lin_D++;
				}
			}
			RD990 rD990 = rD.getRD990();
			qtd_lin_D++;
			rD990.setQTD_LIN_D(String.valueOf(qtd_lin_D));
			arq.insereLinha(MontagemLinhas.montaLinhaD990(rD990));

			// BLOCO E
			System.out.println("Bloco E...");
			RE rE = sped.getBlocoE();
			arq.insereLinha(MontagemLinhas.montaLinhaE001(rE.getRE001()));
			qtd_lin_E++;

			RE990 rE990 = rE.getRE990();
			qtd_lin_E++;
			rE990.setQTD_LIN_E(String.valueOf(qtd_lin_E));
			arq.insereLinha(MontagemLinhas.montaLinhaE990(rE990));

			// BLOCO G
			System.out.println("Bloco G...");
			RG rG = sped.getBlocoG();
			arq.insereLinha(MontagemLinhas.montaLinhaG001(rG.getRG001()));
			qtd_lin_G++;

			RG990 rG990 = rG.getRG990();
			qtd_lin_G++;
			rG990.setQTD_LIN_G(String.valueOf(qtd_lin_G));
			arq.insereLinha(MontagemLinhas.montaLinhaG990(rG990));

			// BLOCO H
			System.out.println("Bloco H...");
			RH rH = sped.getBlocoH();
			arq.insereLinha(MontagemLinhas.montaLinhaH001(rH.getRH001()));
			qtd_lin_H++;

			RH990 rH990 = rH.getRH990();
			qtd_lin_H++;
			rH990.setQTD_LIN_H(String.valueOf(qtd_lin_H));
			arq.insereLinha(MontagemLinhas.montaLinhaH990(rH990));

//			 BLOCO K
			System.out.println("Bloco K...");
			RK rK = sped.getBlocoK();
			arq.insereLinha(MontagemLinhas.montaLinhaK001(rK.getRK001()));
			qtd_lin_K++;
//			arq.insereLinha(MontagemLinhas.montaLinha1010(rK.getRK001().getRK010()));
//			qtd_lin_1++;
			RK990 rK990 = rK.getRK990();
			qtd_lin_K++;
			rK990.setQTD_LIN_K(String.valueOf(qtd_lin_K));
			arq.insereLinha(MontagemLinhas.montaLinhaK990(rK990));

			// BLOCO 1
			System.out.println("Bloco 1...");
			R1 r1 = sped.getBloco1();
			arq.insereLinha(MontagemLinhas.montaLinha1001(r1.getR1001()));
			qtd_lin_1++;
			arq.insereLinha(MontagemLinhas.montaLinha1010(r1.getR1001().getR1010()));
			qtd_lin_1++;

			R1990 r1990 = r1.getR1990();
			qtd_lin_1++;
			r1990.setQTD_LIN_1(String.valueOf(qtd_lin_1));
			arq.insereLinha(MontagemLinhas.montaLinha1990(r1990));

			// BLOCO 9
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
			qtd_lin=qtd_lin_0+qtd_lin_C+qtd_lin_D+qtd_lin_E+qtd_lin_G+qtd_lin_H+qtd_lin_K+qtd_lin_1+qtd_lin_9;
			r9999.setQTD_LIN(String.valueOf(qtd_lin+1));
			arq.insereLinha(MontagemLinhas.montaLinha9999(r9999));
// arq.insereLinha("\r\n");

			// FIM do arquivo
// Escrever arquivo
			String filename = ("EFD"+"_"+sped.getBloco0().getCNPJ()+"_"+sped.getBloco0().getDT_INI().substring(2)).concat(".txt");
			System.out.println("vai escrever arq: "+filename);
			arq.escreveArquivo(ManipulaArquivo.getCaminhoPadrao(), filename);
			toReturn = ManipulaArquivo.getCaminhoPadrao()+filename;
		} catch (Exception e){
			e.printStackTrace();
			// do something...
		}

		return toReturn;
	}
}
