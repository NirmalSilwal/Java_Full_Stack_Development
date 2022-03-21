package section10;

public class InterfaceDemoPhone {

	public static void main(String[] args) {

		Phone phone = new OppoA57();
		System.out.println(phone.processor());
		System.out.println(phone.spaceInGB());

		Phone newphone = new IphoneXR();
		System.out.println(newphone.processor());
		System.out.println(newphone.OS());
	}
}
