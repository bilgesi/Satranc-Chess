package satranc;

public class Sah extends Tas {
	public Sah(char r) {
		super(r);
	}
	
	public double puan() {
		if (tehdit_altinda==true) {
			return 50;	
		} else {
			return 100;
		}
	}
	
	@Override
	public void tehditEt(int satir, int sutun, Board b) {
		b.setGostergec(satir, sutun);
		b.birYukari(renk);
		b.setGostergec(satir, sutun);
		b.birAsagi(renk);
		b.setGostergec(satir, sutun);
		b.birSola(renk) ;
		b.setGostergec(satir, sutun);
		b.birSaga(renk) ;
		b.setGostergec(satir, sutun);
		b.birAsagiiSola(renk) ;
		b.setGostergec(satir, sutun);
		b.birAsagiSaga(renk) ;
		b.setGostergec(satir, sutun);
		b.birYukariSola(renk);
		b.setGostergec(satir, sutun);
		b.birYukariSaga(renk);
		
	}
	

}
