//to show runtime polymerphism - Git - Change after push to central repository - Manoj Changes


class Amitabh{
	void awards(){
		System.out.println("5 awards");
	}
	void tvShow(){
		System.out.println("Sony - KBC");
	}
	void hitMovie(){
		System.out.println("Don");
	}
	void advertisement(){
		System.out.println("Dabur Honey");
	}
}

class Abhishek extends Amitabh{
	void sportsTeam(){
		System.out.println("Jaipur Kabbadi Team");
	}
	void hitMovie(){
		System.out.println("Dhoom");
	}
}

class HeroineFather{
	public static void main(String...args){
		Abhishek abhi=new Abhishek();
		abhi.awards();
		abhi.tvShow();
		abhi.hitMovie();
		abhi.advertisement();
		abhi.sportsTeam();
		
		Amitab ami=new Abhishek();
		((Abhishek)ami).sportsTeam();
	}
}

