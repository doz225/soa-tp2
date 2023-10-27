package service;

public class test {

	public static void main(String[] args) {
		
		double montant = 302;
		BanqueService bs = new BanqueService(montant);
		System.out.println(bs.conversion(montant));
	}

}