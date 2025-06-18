public class access_modifiers
{
	public static void main(String[] args) {
		new Xyz(); 
        new Xyz(); 
	}
}
class Xyz {
    
    static {
        System.out.println("in static");
    }

    
    {
        System.out.println("inside instance");
    }

    
    Xyz() {
        System.out.println("inside constructor");
    }


}
