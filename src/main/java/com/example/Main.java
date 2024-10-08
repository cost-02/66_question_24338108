package com.example;

import java.security.PublicKey;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        try {
            PublicKey publicKey = PublicKeyReader.get("path/to/your/public_key.pem");
            String plaintext = "Il testo da crittografare";
            byte[] encrypted = Encryptor.encrypt(plaintext, publicKey);
            String encryptedText = Base64.getEncoder().encodeToString(encrypted);
            System.out.println("Testo crittografato: " + encryptedText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
