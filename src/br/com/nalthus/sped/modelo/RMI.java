package br.com.nalthus.sped.modelo;

import java.util.ArrayList;
import java.util.Collection;

public class RMI {

	private RI001 rmI001;
	private RMI005 rmI005;
	private Collection rmI050 = new ArrayList();
	private Collection rmI100 = new ArrayList();
	private Collection rmI150 = new ArrayList();
	private Collection rmI200 = new ArrayList();
	private Collection rmI250 = new ArrayList();
	private RI990 rmI990;

	public RI001 getRmI001() {
		return rmI001;
	}
	public void setRmI001(RI001 rmI001) {
		this.rmI001 = rmI001;
	}
	public RMI005 getRmI005() {
		return rmI005;
	}
	public void setRmI005(RMI005 rmI005) {
		this.rmI005 = rmI005;
	}
	public RI990 getRmI990() {
		return rmI990;
	}
	public void setRmI990(RI990 rmI990) {
		this.rmI990 = rmI990;
	}
	public Collection getRmI050() {
		return rmI050;
	}
	public void setRmI050(Collection rmI050) {
		this.rmI050 = rmI050;
	}
	public Collection getRmI100() {
		return rmI100;
	}
	public void setRmI100(Collection rmI100) {
		this.rmI100 = rmI100;
	}
	public Collection getRmI150() {
		return rmI150;
	}
	public void setRmI150(Collection rmI150) {
		this.rmI150 = rmI150;
	}
	public Collection getRmI200() {
		return rmI200;
	}
	public void setRmI200(Collection rmI200) {
		this.rmI200 = rmI200;
	}
	public Collection getRmI250() {
		return rmI250;
	}
	public void setRmI250(Collection rmI250) {
		this.rmI250 = rmI250;
	}

}
