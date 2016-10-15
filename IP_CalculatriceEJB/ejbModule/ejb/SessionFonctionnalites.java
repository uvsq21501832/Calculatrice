package ejb;
import javax.ejb.Stateless;

@Stateless(mappedName = "SessionFonctionnalites")
public class SessionFonctionnalites implements InterfaceFonctionalites {

	@Override
	public float addition(float x, float y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public float soustraction(float x, float y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public float multipplication(float x, float y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public float division(float x, float y) {
		// TODO Auto-generated method stub
		return x/y;
	
	}

}
