package satranc;

public abstract class Tas { //parent class
	protected boolean tehdit_altinda;
	protected char renk;
	public Tas(char r) {			//constructor tasın rengini input alır
		tehdit_altinda = false;	// default her tas tehdit altında = false 
		renk = r;
	}
	
	public char getRenk() {
		return renk;
	}

	public void setRenk(char renk) {
		this.renk = renk;
	}

	public void setTehditAltinda(boolean t) {
		tehdit_altinda=t;
	}
	public boolean getTehditAltinda() {
		return tehdit_altinda;
	}
	public abstract double puan();
	public abstract void tehditEt(int satir, int sutun, Board b);
}
