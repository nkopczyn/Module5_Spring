package pl.coderslab.injection;

public class AccessKeyService {

    private final AccessKeyGenerator ack;

    public AccessKeyService(AccessKeyGenerator ack) {
        this.ack = ack;
    }

    public void sendKey(int keyLength) {
        String key = ack.generateAccessKey(keyLength); // metoda z interface
        System.out.println("sending key...");
        System.out.println(key);
    }

}
