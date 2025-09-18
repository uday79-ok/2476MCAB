public class CRC
{
	private static final int POLYNOMIAL = 0x1021;
	public static int calculateCRC(byte[] data)
	{
		int crc = 0xFFFF; for (byte b : data) 
	{
		crc ^= (b & 0xFF) << 8;
		for (int i = 0; i < 8; i++) 
		{
			if ((crc & 0x8000) != 0) 
			{
				 crc = (crc << 1) ^ POLYNOMIAL;
			} 
			else 
			{
				crc <<= 1;
			}
		}
	}
	crc ^= 0xFFFF; 
	return crc;
 }
	public static void main(String[] args) 
	{
		byte[] dataPacket = "Hello, CRC goodmorning!".getBytes();
		int CRCChecksum = calculateCRC(dataPacket);
		System.out.println("Data packet: " + new String(dataPacket));
		System.out.println("CRC checksum:"+Integer.toHexString(CRCChecksum).toUpperCase());
	}
}