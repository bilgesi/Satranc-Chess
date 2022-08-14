package satranc;

public class Vezir extends Tas {
	public Vezir(char r) {
		super(r);
	}
	
	public double puan() {
		if (tehdit_altinda==true) {
			return 4.5;	
		} else {
			return 9.0;
		}
	}
	
	@Override
	public void tehditEt(int satir, int sutun, Board b) {
		b.setGostergec(satir, sutun);
		while (b.birYukari(renk)) {
			
		}
		b.setGostergec(satir, sutun);
		while (b.birAsagi(renk)) {
			
		}
		b.setGostergec(satir, sutun);
		while (b.birSola(renk)) {
			
		}
		b.setGostergec(satir, sutun);
		while (b.birSaga(renk)) {
			
		}
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