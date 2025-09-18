import java.util.Scanner;
public class ParityCheck {
 // Function to count the number of 1s in the binary string
 public static int countOnes(String binaryString) {
 int count = 0;
 for (char c : binaryString.toCharArray()) {
 if (c == '1') {
 count++;
 }
 }
 return count;
 }
 // Function to check the parity of the binary string
 public static String checkParity(String binaryString) {
 int onesCount = countOnes(binaryString);
 if (onesCount % 2 == 0) {
 return "Even parity";
 } else {
 return "Odd parity";
 }
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a binary number: ");
 String binaryString = scanner.nextLine();
 // Check if the input is a valid binary number
 if (!binaryString.matches("[01]+")) {
 System.out.println("Invalid binary number. Please enter a binary number containing only 0s and 1s");
 return;
 }
 String parity = checkParity(binaryString);
 System.out.println("The parity of the binary number " + binaryString + " is: " + 
parity);
 }
}