package section10;

public class IphoneXR implements Phone {

	@Override
	public String processor() {
		return "ios 15";
	}

	@Override
	public int spaceInGB() {
		return 128;
	}

	@Override
	public String OS() {
		return "IOS";
	}

}
