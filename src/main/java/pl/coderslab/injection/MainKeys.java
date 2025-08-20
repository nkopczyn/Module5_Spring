package pl.coderslab.injection;

public class MainKeys {
    public static void main(String[] args) {
        AccessKeyService accessKeyService = new AccessKeyService(new AlphabeticAccessKeyGenerator());
        accessKeyService.sendKey(10);

// inne potencjalne AccessKeyGenerators, które można stworzyć, które wszytskie implementują interface AccessKeyGenerator

//        AccessKeyService accessKeyService2 = new AccessKeyService(new NumericAccessKeyGenerator());
//        accessKeyService2.sendKey(10);
//
//        AccessKeyService accessKeyService3 = new AccessKeyService(new DumbGenerator());
//        accessKeyService3.sendKey(10);

    }
}