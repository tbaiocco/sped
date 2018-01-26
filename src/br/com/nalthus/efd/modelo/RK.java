package br.com.nalthus.efd.modelo;

public class RK {
	private RK001 rK001;
	private RK990 rK990;

	public RK001 getRK001() {
		if(rK001 == null)
			rK001 = new RK001();
		return rK001;
	}
	public void setRK001(RK001 rk001) {
		rK001 = rk001;
	}
	public RK990 getRK990() {
		if(rK990 == null)
			rK990 = new RK990();
		return rK990;
	}
	public void setRK990(RK990 rk990) {
		rK990 = rk990;
	}

}
