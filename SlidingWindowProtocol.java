import java.util.Timer;
import java.util.TimerTask;
class Packet {
 int sequenceNumber;
 String data;
 public Packet(int sequenceNumber, String data) {
 this.sequenceNumber = sequenceNumber;
 this.data = data;
 }
}
class Sender {
 private int windowSize = 4;
 private Packet[] packets;
 private int sendBase;
 private int nextSeqNum;
 private Timer timer;
 public Sender(int totalPackets) {
 packets = new Packet[totalPackets];
 for (int i = 0; i < totalPackets; i++) {
 packets[i] = new Packet(i, "Data for packet " + i);
 }
 sendBase = 0;
 nextSeqNum = 0;
 }
 public void startSending() {
 while (sendBase < packets.length) {
 for (int i = sendBase; i < Math.min(sendBase + windowSize, packets.length); i++) {
 if (i >= nextSeqNum) {
 sendPacket(packets[i]);
 nextSeqNum++;
 }
 }
 startTimer();
 // Simulate timeout
 try {
 Thread.sleep(3000); // Simulating timeout
 } catch (InterruptedException e) {
 e.printStackTrace();
 }
 System.out.println("Timeout occurred. Resending packets...");
 }
 }
 private void sendPacket(Packet packet) {
 System.out.println("Sending packet: " + packet.sequenceNumber);
 }
 private void startTimer() {
 if (timer != null) {
 timer.cancel();
 }
 timer = new Timer();
 timer.schedule(new TimerTask() {
 @Override
 public void run() {
 System.out.println("Timeout occurred. Resending packets...");
 }
 }, 2000); // Timeout after 2 seconds
 }
}
public class SlidingWindowProtocol {
 public static void main(String[] args) {
 Sender sender = new Sender(10);
 sender.startSending();
 }
}
