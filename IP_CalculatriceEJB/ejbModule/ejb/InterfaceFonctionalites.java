package ejb;
import javax.ejb.Remote;


@Remote
public interface InterfaceFonctionalites {
	
	public float addition (float x, float y);
	public float soustraction(float x, float y);
	public float multipplication(float x, float y);
	public float division (float x, float y);

}
