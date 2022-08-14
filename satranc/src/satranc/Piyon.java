package satranc;

public class Piyon extends Tas {

	public Piyon(char r) {
		super(r);
	}
	
	public double puan() {
		if (tehdit_altinda==true) {
			return 0.5;	
		} else {
			return 1.0;
		}
	}
	
	@Override
	public void tehditEt(int satir, int sutun, Board b) {
		if (renk=='s') {
			b.setGostergec(satir, sutun);
			b.birAsagiiSola(renk) ;
			b.setGostergec(satir, sutun);
			b.birAsagiSaga(renk) ;

		} else {
			b.setGostergec(satir, sutun);
			b.birYukariSola(renk);
			b.setGostergec(satir, sutun);
			b.birYukariSaga(renk);			
		}

		
	}

}