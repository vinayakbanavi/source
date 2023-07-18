class Alien {
//String invade(short ships) { return "a few"; }
String invade(short... ships) { return "many"; }
}
class Defender {
public static void main(String [] args) {
	short i = 7;
System.out.println(new Alien().invade(i));
} }
