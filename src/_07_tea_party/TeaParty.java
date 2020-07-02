package _07_tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if(isKnighted == true) {
			if(isWoman == true) {
				return "Hello Lady " + name;
			}
			return "Hello Sir " + name;
		}
		if(isWoman == true) {
			return "Hello Ms. " + name;
		}
		return "Hello Mr. " + name;
	}
	
}
