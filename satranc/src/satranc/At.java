package satranc;

public class At extends Tas {
	public At(char r) {
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
		b.L1(renk);
		b.setGostergec(satir, sutun);
		b.L2(renk);
		b.setGostergec(satir, sutun);
		b.L3(renk);
		b.setGostergec(satir, sutun);
		b.L4(renk);
		b.setGostergec(satir, sutun);
		b.L5(renk);
		b.setGostergec(satir, sutun);
		b.L6(renk);
		b.setGostergec(satir, sutun);
		b.L7(renk);
		b.setGostergec(satir, sutun);
		b.L8(renk);		
		
	}
	

	

}
