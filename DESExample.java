import javax.crypto.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Scanner;

public class DESExample {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) { // Using try-with-resources for automatic closing
            // Generate DES key
            KeyGenerator desKeyGenerator = KeyGenerator.getInstance("DES");
            SecretKey key = desKeyGenerator.generateKey();

            // Initialize Ciphers for encryption and decryption
            Cipher desCipherEncrypter = Cipher.getInstance("DES");
            desCipherEncrypter.init(Cipher.ENCRYPT_MODE, key);

            Cipher desCipherDecrypter = Cipher.getInstance("DES");
            desCipherDecrypter.init(Cipher.DECRYPT_MODE, key);

            // Get plaintext from user using Scanner
            System.out.print("Enter plaintext to encrypt: ");
            String message = input.nextLine();

            // Encrypt and decrypt the message
            String encrypted = encrypt(desCipherEncrypter, message);
            System.out.println("Encrypted text: " + encrypted);

            String decrypted = decrypt(desCipherDecrypter, encrypted);
            System.out.println("Decrypted text: " + decrypted);

            // Demonstrate file encryption/decryption using Scanner for file paths
            System.out.print("Enter path of file to encrypt: ");
            String path = input.nextLine();

            System.out.print("Enter path for encrypted file: ");
            String fileEnc = input.nextLine();

            fileEncrypt(desCipherEncrypter, path, fileEnc);

            System.out.print("Enter path for decrypted file: ");
            String fileDec = input.nextLine();

            fileDecrypt(desCipherDecrypter, fileEnc, fileDec);

        } catch (NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException
                 | BadPaddingException | IllegalBlockSizeException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to encrypt a string
    public static String encrypt(Cipher cipher, String plainStr) throws BadPaddingException, IllegalBlockSizeException {
        byte[] plainBytes = plainStr.getBytes(StandardCharsets.ISO_8859_1);
        byte[] encryptedBytes = cipher.doFinal(plainBytes);
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    // Helper method to decrypt a string
    public static String decrypt(Cipher cipher, String encryptedStr) throws BadPaddingException, IllegalBlockSizeException {
        byte[] encryptedBytes = Base64.getDecoder().decode(encryptedStr);
        byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
        return new String(decryptedBytes, StandardCharsets.ISO_8859_1);
    }

    // Helper method to encrypt a file
    public static void fileEncrypt(Cipher cipher, String inputPath, String outputPath) throws Exception {
        File inputFile = new File(inputPath);
        if (!inputFile.exists()) throw new FileNotFoundException("Input file not found: " + inputPath);
        if (!inputFile.canRead()) throw new Exception("Cannot read from file: " + inputPath);

        try (Scanner fileScanner = new Scanner(inputFile);
             FileWriter writer = new FileWriter(outputPath)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String encryptedLine = encrypt(cipher, line);
                writer.write(encryptedLine + "\n");
            }
            System.out.println("File encrypted successfully to: " + outputPath);
        }
    }

    // Helper method to decrypt a file
    public static void fileDecrypt(Cipher cipher, String inputPath, String outputPath) throws Exception {
        File inputFile = new File(inputPath);
        if (!inputFile.exists()) throw new FileNotFoundException("Input file not found: " + inputPath);

        try (Scanner fileScanner = new Scanner(inputFile);
             FileWriter writer = new FileWriter(outputPath)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String decryptedLine = decrypt(cipher, line);
                writer.write(decryptedLine + "\n");
            }
            System.out.println("File decrypted successfully to: " + outputPath);
        }
    }
}