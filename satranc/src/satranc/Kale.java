package satranc;

public class Kale extends Tas {
	public Kale(char r) {
		super(r);
	}
	
	public double puan() {
		if (tehdit_altinda==true) {
			return 2.5;	
		} else {
			return 5.0;
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
		
	}
	

	

}