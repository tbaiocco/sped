package br.com.nalthus.sped.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Parametros {

	private static Parametros instancia;

	private static final String ARQUIVO_PROPRIEDADES = "spedc.properties";

	private String usuario = "";

	private String senha = "";

	private String local = "";

	private String path = "/tmp/";

	public static synchronized Parametros getInstancia() {
		if (instancia == null) {
			instancia = new Parametros();
			// Locale loc = new Locale("pt", "BR");
			// Locale.setDefault(loc);
		}
		return instancia;
	}

	public Parametros() {
		doSetPadrao();
	}

	private void doSetPadrao() {
		Properties props = new Properties();
		try {
			File file = new File(System.getProperty("pro_path")+ARQUIVO_PROPRIEDADES);
			System.out.println("ARQ PROPERTIES:"+file.getName());
//			InputStream is = this.getClass().getResourceAsStream(ARQUIVO_PROPRIEDADES);
//			props.load(is);
			props.load(new FileInputStream(file));

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
//		usuario = props.getProperty("usuario");
//		senha = props.getProperty("senha");
//		local = props.getProperty("local");
		path = props.getProperty("path");
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String temp_path) {
		this.path = temp_path;
	}

}
