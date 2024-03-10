//da se vnese dve strani na pravoagolnik da se presmeta perimetar i plostina
import java.util.Scanner;
public class PravoagolnikPLiPRM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int strana1, strana2, povrsina, perimetar;
				Scanner tastatura = new Scanner(System.in);
				System.out.println("dolzina na edna strana:");
				strana1= tastatura.nextInt();
				System.out.println("dolzina na druga strana:");
				strana2 = tastatura.nextInt();
				System.out.println("perimetar e: "+2*(strana1+strana2)+", plostina e: " + strana1*strana2);
	}

}
