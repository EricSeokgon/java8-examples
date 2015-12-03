package tk.hadeslee.Lambda_Expressions.Working_with_Resources;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Project: java8-examples
 * FileName: FileWriterARM
 * Date: 2015-11-19
 * Time: 오전 9:46
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FileWriterARM implements AutoCloseable {
    private final FileWriter writer;

    public FileWriterARM(final String fileName) throws IOException {
        writer = new FileWriter(fileName);
    }

    public void writeStuff(final String message) throws IOException {
        writer.write(message);
    }

    @Override
    public void close() throws Exception {
        System.out.println("close called automatically...");
        writer.close();
    }
}
