package ua.com.serzh.java_security;

import javax.crypto.*;
import java.security.*;

/**
 * Created by Serzh on 1/29/17.
 */
public class Temp {

    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        SecureRandom rnd = SecureRandom.getInstanceStrong();
        KeyGenerator kg = KeyGenerator.getInstance("AES");
        // инициализируем генератор
        kg.init(256, rnd);
        // генерируем секретный ключ
        SecretKey sk = kg.generateKey();

//        Шифр/Режим/Способ выравнивания
        Cipher aes = Cipher.getInstance("AES/CBC/PKCS5Padding");
//инициализируем режим - шифрование
        aes.init(Cipher.ENCRYPT_MODE, sk);
//        оригинальное сообщение
        byte[] text = "JPoint Student Day".getBytes();
//        получаем зашифрованное сообщение
        byte[] ciphertext = aes.doFinal(text);

    }


    private static void secondExample() throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        SecureRandom rnd = SecureRandom.getInstanceStrong();
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("RSA");
        // инициализируем генератор
        kpg.initialize(4096, rnd);
        // генерируем пару ключей
        KeyPair kp = kpg.generateKeyPair();
//        System.out.println(kp.getPublic());

        MessageDigest sha512 = MessageDigest.getInstance("SHA-512");
        byte[] data, data1, finalData; // ...
        data = new byte[32];
        data1 = new byte[32];
        finalData = new byte[32];
        //...
//        обновляем данные
        sha512.update(data);
        sha512.update(data1);
//        добавляем данные и получаем результат
        byte[] hash = sha512.digest(finalData);


//        алгоритм хэша with fukjhbnv gjlgbcb
        Signature rsa = Signature.getInstance("SHA-512withRSA");
//        инициализируем подпись
        rsa.initSign(kp.getPrivate());
//        добаляем данные для подписи
        rsa.update(data);
//        вычисляем подпись
        byte[] sign = rsa.sign();

//        инициализируем проверку подписи
        rsa.initVerify(kp.getPublic());
//        устанавливаем подписанные данные
        rsa.update(data);
//        проверяем подпись
        boolean result = rsa.verify(sign);
    }

    private static void firstExample() {
        SecureRandom rnd = new SecureRandom();
        // получаем случайные числа
        byte[] rndData = new byte[32];
        rnd.nextBytes(rndData);
        //получаем новое начальное состояние
        byte[] seed = rnd.generateSeed(32);
    }
}
