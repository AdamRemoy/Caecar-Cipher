public class Main {

  public static void main(String[] args) {
    Caesar m = new Caesar(args[0], Integer.parseInt(args[1]));
    m.encrypt();
    System.out.println(m.getEncryptedMessage());
  }
}
