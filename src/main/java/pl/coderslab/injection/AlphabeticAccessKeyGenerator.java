package pl.coderslab.injection;

public class AlphabeticAccessKeyGenerator implements AccessKeyGenerator {

    @Override
    public String generateAccessKey(int length) {
        String accessKey = "abcdefghijklmnoprstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder key = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int randomIndex = (int) (Math.random() * accessKey.length());
            key.append(accessKey.charAt(randomIndex));
        }
        return key.toString();
    }
}

