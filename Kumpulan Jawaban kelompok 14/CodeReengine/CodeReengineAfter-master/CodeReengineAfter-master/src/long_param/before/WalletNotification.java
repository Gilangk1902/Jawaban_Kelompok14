package long_param.before;

class WalletNotification {

	//parameter dikecilin karena kebanyakan data ada di class User
	public void balanceNotif(User user, int amount) {
		String body = "";
		if(amount == 0) {
			body = String.format(
					"Halo %s, Saldo mu sekarang ada %2d ", user.name, user.wallet.balance);
		}
		
		else if (amount > 0) { 
			body = String.format(
				"Halo %s, ada %2d masuk ke akunmu nih. " + 
				"Sekarang balance-mu menjadi %2d", user.name, amount, user.wallet.balance);
		} 
		
		else{
			body = String.format(
					"Halo %s, ada %2d keluar dari akunmu nih. " + 
					"Sekarang balance-mu menjadi %2d", user.name, amount, user.wallet.balance);
		}
		
		System.out.printf("Email terkirim ke %s\n", user.email);
		System.out.println("Isi email: ");
		System.out.println(body);
		
	}
}