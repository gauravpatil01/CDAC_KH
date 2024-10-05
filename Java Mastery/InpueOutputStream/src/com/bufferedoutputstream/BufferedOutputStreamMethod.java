
package com.bufferedoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamMethod {
    public static void main(String[] args) {
        String data = "This is some test data for the BufferedOutputStream.";

        // Try-with-resources to ensure the stream is closed automatically
        try (BufferedOutputStream buffer = new BufferedOutputStream(new FileOutputStream("F:\\eclipse\\CDAC\\InpueOutputStream\\src\\output file"))) {

            // Convert the string to a byte array
            byte[] byteArray = data.getBytes();

            // Write the byte array to the buffered stream
            buffer.write(byteArray);

            // CLEAR INTERNAL BUFFER 
            buffer.flush();

            System.out.println("Data written to the file successfully.");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
