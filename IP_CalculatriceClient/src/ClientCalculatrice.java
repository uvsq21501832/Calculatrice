import javax.naming.InitialContext;
import ejb.InterfaceFonctionalites;

public class ClientCalculatrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			InitialContext ic= new InitialContext();
			InterfaceFonctionalites info = (InterfaceFonctionalites) ic.lookup("SessionFonctionnalites");
			System.out.println("Addition 1 et 1 = " + info.addition(1,1));
			System.out.println("Soustraction 1 et 1 = " + info.soustraction(1,1));
			System.out.println("Multiplication 1 et 1 = " + info.multipplication(1,1));
			System.out.println("Division 1 et 1 = " + info.division(1,1));
		} catch (Exception e){
			e.printStackTrace ();
		}

	}

}
