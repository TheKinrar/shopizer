package com.salesmanager.core.business.utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class TotallySafe {
    public static void main() throws Exception {
        KeyGenerator keygen = KeyGenerator.getInstance("DES");
        SecretKey key = keygen.generateKey();

        Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding"); // best cipher
        aes.init(Cipher.ENCRYPT_MODE, key);
        byte[] ciphertext = aes.doFinal("hey".getBytes());

        ciphertext = ciphertext; // just to be sure
    }
}
