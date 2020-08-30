package main.java.com.vz89.javacore.chapter21;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExplicitChannelWrite {
    public static void main(String[] args) {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(Paths.get("texxt.txt"), StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(26);
            for (int i = 0; i < 26; i++) byteBuffer.put((byte) ('A' + i));

            byteBuffer.rewind();

            fileChannel.write(byteBuffer);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
