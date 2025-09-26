public class Caesar {

  private int rotation;
  private String message;
  private String encryptedMessage;
  private char[] rotatedAlphabet;

  public Caesar(String message, int withRotation) {
    this.message = message;
    this.encryptedMessage = message;
    this.rotation = withRotation;
    this.rotatedAlphabet = Alphabet.rotateBy(rotation);
  }

  private char encrypt(char c) {
    String s = "" + c;
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    return rotatedAlphabet[alphabet.indexOf(s.toUpperCase())];
  }

  public void encrypt() {
    StringBuilder sb = new StringBuilder();
    char[] rotatedAlphabet = Alphabet.rotateBy(rotation);

    for (int i = 0; i < message.length(); i++) {
      char c = encrypt(message.charAt(i));
      sb.append(c);
    }
    encryptedMessage = sb.toString();
  }

  public String getMessage() {
    return this.message;
  }

  public String getEncryptedMessage() {
    return this.encryptedMessage;
  }

  public void setMessage(String newMessage) {
    this.message = newMessage;
    // TODO Kall encryption for å oppdatere message med ny melding
  }

  public void setRotation(int newRotation) {
    this.rotation = newRotation;
    // TODO Kall encryption for å oppdatere message med ny rotasjon
  }

}
