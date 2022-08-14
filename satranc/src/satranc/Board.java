package satranc;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Board {
	private Tas[][] board;
	private int gostergec_satir;
	private int gostergec_sutun;
	
	public void setGostergec(int a, int b) {
		gostergec_satir=a;
		gostergec_sutun=b;
	}
	
	public boolean tehdit(char renk) {
		if (!gecerli_koordinat(gostergec_satir,gostergec_sutun)) {
			return false;
		} else {
			Tas t=board[gostergec_satir][gostergec_sutun];
			if (t==null) {
				return true;
			} else {
				if (t.getRenk()!=renk) {
					t.setTehditAltinda(true);
				}
				return false;
			}
		}
	}
	public boolean birYukari(char renk) {
		gostergec_satir--;
		return tehdit(renk);
	}
	public boolean birAsagi(char renk) {
		gostergec_satir++;
		return tehdit(renk);
	}
	public boolean birSaga(char renk) {
		gostergec_sutun++;
		return tehdit(renk);
	}
	public boolean birSola(char renk) {
		gostergec_sutun--;
		return tehdit(renk);
	}
	public boolean birYukariSola(char renk) {
		gostergec_satir--;
		gostergec_sutun--;
		return tehdit(renk);
	}
	public boolean birYukariSaga(char renk) {
		gostergec_satir--;
		gostergec_sutun++;
		return tehdit(renk);
	}
	public boolean birAsagiiSola(char renk) {
		gostergec_satir++;
		gostergec_sutun--;
		return tehdit(renk);
	}
	public boolean birAsagiSaga(char renk) {
		gostergec_satir++;
		gostergec_sutun++;
		return tehdit(renk);
	}
	public boolean L1(char renk) {
		gostergec_satir+=2;
		gostergec_sutun+=1;
		return tehdit(renk);
	}
	public boolean L2(char renk) {
		gostergec_satir+=1;
		gostergec_sutun+=2;
		return tehdit(renk);
	}
	public boolean L3(char renk) {
		gostergec_satir+=2;
		gostergec_sutun-=1;
		return tehdit(renk);
	}
	public boolean L4(char renk) {
		gostergec_satir-=1;
		gostergec_sutun+=2;
		return tehdit(renk);
	}
	public boolean L5(char renk) {
		gostergec_satir-=2;
		gostergec_sutun+=1;
		return tehdit(renk);
	}
	public boolean L6(char renk) {
		gostergec_satir-=2;
		gostergec_sutun-=1;
		return tehdit(renk);
	}
	public boolean L7(char renk) {
		gostergec_satir-=1;
		gostergec_sutun-=2;
		return tehdit(renk);
	}
	public boolean L8(char renk) {
		gostergec_satir+=2;
		gostergec_sutun+=1;
		return tehdit(renk);
	}
	
	
	
	
	
	
	public boolean gecerli_koordinat(int satir, int sutun) {
		if (satir<0)
			return false;
		if (satir>7)
			return false;
		if (sutun<0)
			return false;
		if (sutun>7)
			return false;
		return true;
		
	}
	
	public Board(String txtDosyasi) {
		board = new Tas[8][8];
		try {
		      File myObj = new File(txtDosyasi);
		      Scanner myReader = new Scanner(myObj);
		      int satir=0;
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] taslar =data.split(" "); 
		        for (int i=0;i<8;i++) {
		        	String tas =taslar[i]; 
		        	if (!tas.equals("--")) {
		        		//System.out.println(tas);
		        		char t=tas.charAt(0);
		        		char r=tas.charAt(1);
		        		if (t=='k') {
		        			Kale k = new Kale(r);
		        			board[satir][i] = k;
		        		} else if (t=='p') {
		        			Piyon k = new Piyon(r);
		        			board[satir][i] = k;
		        		} else if (t=='f') {
		        			Fil k = new Fil (r);
		        			board[satir][i] = k;
		        		} else if (t=='a') {
		        			At k = new At(r);
		        			board[satir][i] = k;
		        		} else if (t=='v') {
		        			Vezir k = new Vezir(r);
		        			board[satir][i] = k;
		        		} else if (t=='s') {
		        			Sah k = new Sah(r);
		        			board[satir][i] = k;
		        		}  
		        		
		        		
		        	}
		        }
		        satir++;
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Olmayan dosya");
		      e.printStackTrace();
		    }
		
	}
	
	public void puanHesapla() {
		for (int satir=0;satir<8; satir++) {
			for (int sutun=0;sutun<8; sutun++) {
				Tas t = board[satir][sutun];
				if (t!=null) {
					t.tehditEt(satir,sutun,this);

				}
			}
		}
//		for (int satir=0;satir<8; satir++) {
//			for (int sutun=0;sutun<8; sutun++) {
//				Tas t = board[satir][sutun];
//				if (t!=null) {
//					if (t.getTehditAltinda()) {
//						System.out.println("tas: " +satir + "," + sutun);
//					}
//
//				}
//			}
//		}
		double siyah_puan=0;
		double beyaz_puan=0;
		for (int satir=0;satir<8; satir++) {
			for (int sutun=0;sutun<8; sutun++) {
				Tas t = board[satir][sutun];
				if (t!=null) {
					if (t.getRenk()=='b') {
						beyaz_puan += t.puan();			
					} else {
						siyah_puan += t.puan();
					}
				}
			}
		}
		System.out.println("Siyah:"+siyah_puan+"	Beyaz:" + beyaz_puan);
	}
	

}
