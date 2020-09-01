package projekakhir;

abstract class BangunDatar {
	private double[] sisi;
	
	public double[] getSisi(){
	return sisi;
	}
	
	public void setSisi(double...ukuranSisi){
		sisi = new double[ukuranSisi.length];
		for (int i=0; i<ukuranSisi.length; i++){
			sisi[i] = ukuranSisi[i];
			//System.arraycopy(ukuranSisi, i, sisi, i,ukuranSisi.length);
		}
	}
	public abstract double getKeliling();
	public abstract double getLuas();
	}
