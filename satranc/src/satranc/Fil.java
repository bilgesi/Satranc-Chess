package satranc;

public class Fil extends Tas {
	public Fil(char r) {
		super(r);
	}
	
	public double puan() {
		if (tehdit_altinda==true) {
			return 1.5;	
		} else {
			return 3.0;
		}
	}

	@Override
	public void tehditEt(int satir, int sutun, Board b) {
		b.setGostergec(satir, sutun);
		while (b.birAsagiiSola(renk)) {
			
		}
		b.setGostergec(satir, sutun);
		while (b.birAsagiSaga(renk)) {
			
		}
		b.setGostergec(satir, sutun);
		while (b.birYukariSola(renk)) {
			
		}
		b.setGostergec(satir, sutun);
		while (b.birYukariSaga(renk)) {
			
		}
		
	}
	

	

}