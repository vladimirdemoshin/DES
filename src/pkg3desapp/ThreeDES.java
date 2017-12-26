package pkg3desapp;

public class ThreeDES {  ///DES - EEE3
    
    public String encrypt(String message,String key1,String key2,String key3)
    {
        DES des = new DES();
        String cipher1 = des.encrypt(message, key1);
        String cipher2 = des.encrypt(cipher1, key2);
        String cipher3 = des.encrypt(cipher2, key3);
        return cipher3;
    }
    
    public String decrypt(String cipher,String key1,String key2,String key3)
    {
        DES des = new DES();
        String decrypt3 = des.decrypt(cipher, key3);
        String decrypt2 = des.decrypt(decrypt3, key2);
        String decrypt1 = des.decrypt(decrypt2, key1);
        return des.toInitialLength(decrypt1);
    }
}
