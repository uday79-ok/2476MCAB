import java.util.Scanner;
public class FramingMethod {
 // Function to perform character stuffing for framing
 public static String frameData(String data) {
 char startDelimiter = '<';
 char endDelimiter = '>';
 char escapeChar = '\\';
 StringBuilder framedData = new StringBuilder();
 framedData.append(startDelimiter);
 for (char c : data.toCharArray()) {
 if (c == startDelimiter || c == endDelimiter || c == escapeChar) {
 framedData.append(escapeChar).append(c);
 } else {
 framedData.append(c);
 }
 }
 framedData.append(endDelimiter);
 return framedData.toString();
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a character string: ");
 String dataString = scanner.nextLine();
 
 String framedData = frameData(dataString);
 System.out.println("Framed data: " + framedData);
 }
}