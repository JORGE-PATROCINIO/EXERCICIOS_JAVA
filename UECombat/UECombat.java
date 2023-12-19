package UECombat;

public class UECombat {

	public static void main(String[] args) {
		//Lutador L = new Lutador("Pretty Boy", "França", 31, 1.75d, 68.9d, 11, 2, 1);
		Lutador L[] = new Lutador[6];
		L[0] = new Lutador ("Pretty Boy", "França", 31, 1.75d, 68.9d, 11, 2, 1);
		L[1] = new Lutador ("Putscript", "Brasil", 29, 1.68d, 57.8d, 14, 2, 3);
		L[2] = new Lutador ("Snapshadow", "EUA", 35, 1.65d, 80.9d, 12, 2, 1);
		L[3] = new Lutador ("Dead Code", "Austrália", 28, 1.93d, 81.6d, 13, 0, 2);
		L[4] = new Lutador ("UFOCobol", "Brasil", 37, 1.70d, 119.3d, 5, 4, 3);
		L[5] = new Lutador ("Nerdaart", "EUA", 30, 1.81d, 105.7d, 12, 2, 4);
		
		/*L[3].Apresentar();
		System.out.println("----------------------------------------------------------");
		L[3].Status();*/
		
		Luta UEC01 = new Luta();
		UEC01.MarcarLuta(L[0],L[1]);
		UEC01.Lutar();
		L[0].Status();
		System.out.println("============================================================");
		L[1].Status();
		
	}

}
