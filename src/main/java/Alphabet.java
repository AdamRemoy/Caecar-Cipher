public class Alphabet {

  public static char[] rotateBy(int rotation) {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char[] rotatedAlphabet = new char[26];
    for (int i = 0; i < 26; i++) {
      rotatedAlphabet[i] = (alphabet.charAt((i + rotation) % 26));
    }
    return rotatedAlphabet;
  }

}
