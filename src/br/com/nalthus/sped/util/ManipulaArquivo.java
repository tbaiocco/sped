package br.com.nalthus.sped.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.LineNumberReader;
/**
 * Classe para Manipulação de Arquivos de Exportação
 * @author Teo - Nalthus
 */
public class ManipulaArquivo {

	private StringBuffer strBuf = new StringBuffer();

	private String delimitador = "|";

	public ManipulaArquivo() {
	}

	public ManipulaArquivo(String delimitador) {
		this.delimitador = delimitador;
	}

	public void insereLinha(String linha) {
		this.strBuf.append(linha);
		this.strBuf.append("\r\n");
	}

	public void insereValor(String valor) {
		this.strBuf.append(valor + this.delimitador);
	}

	public void insereValorDefault(String valor, String vldefault) {
		this.strBuf.append(StringUtil.getValueDef(valor, vldefault).trim()
				.toUpperCase()
				+ this.delimitador);
	}

	public void insereQuebra() {
		this.strBuf = new StringBuffer(this.strBuf.substring(0, this.strBuf
				.length() - 1));
		this.strBuf.append("\r\n");
	}

	public void clearArquivo() {
		if (this.strBuf.length() > 0)
			this.strBuf.delete(0, this.strBuf.length());
	}

	public void escreveArquivo(String caminho, String arquivo) {

		try {
			String filename = caminho + arquivo;
			File tmp = new File(filename);
			if(tmp.exists()){
				tmp.delete();
			}
			FileWriter file = new FileWriter(filename, true);
			file.write(this.strBuf.toString());
			file.flush();
			file.close();
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}

	public BufferedReader leArquivo(String arquivo) {

		BufferedReader buff = null;
		try {
			FileReader file = new FileReader(arquivo);
			buff = new BufferedReader(file);

		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return buff;
	}

	public LineNumberReader leLinha(String arquivo) {

		LineNumberReader line = null;
		try {
			FileReader file = new FileReader(arquivo);
			line = new LineNumberReader(file);

		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return line;
	}

	public static String getCaminhoPadrao(){
		String path = Parametros.getInstancia().getPath();
//		Properties props = new Properties();
//		try {
////			File file = new File("G:\\teo\\workspace\\spedc.properties");
//			props.load(new FileInputStream(file));
//			path = props.getProperty("path");
//
//		} catch (FileNotFoundException ex) {
//			ex.printStackTrace();
//		} catch (IOException ex) {
//			ex.printStackTrace();
//		}
		return path;
	}

	public String toString() {
		return this.strBuf.toString();
	}

}