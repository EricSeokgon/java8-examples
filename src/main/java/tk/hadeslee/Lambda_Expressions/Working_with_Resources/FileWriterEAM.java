package tk.hadeslee.Lambda_Expressions.Working_with_Resources;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Project: java8-examples
 * FileName: FileWriterEAM
 * Date: 2015-11-20
 * Time: 오전 9:24
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FileWriterEAM {
    private final FileWriter writer;

    private FileWriterEAM(final String fileName) throws IOException {
        writer = new FileWriter(fileName);
    }

    private void close() throws IOException {
        System.out.println("close called automatically...");
        writer.close();
    }

    public void writeStuff(final String message) throws IOException {
        writer.write(message);
    }

    public static void use(final String fileName,
                           final UseInstance<FileWriterEAM, IOException> block) throws IOException {
        final FileWriterEAM writerEAM = new FileWriterEAM(fileName);
        try {
            block.accept(writerEAM);
        } finally {
            writerEAM.close();

        }
    }

    public static void main(String[] args) throws IOException {
        FileWriterEAM.use("eam.txt", writerEAM -> writerEAM.writeStuff("sweet"));

        FileWriterEAM.use("eam2.txt", writerEAM -> {
            writerEAM.writeStuff("how");
            writerEAM.writeStuff("sweet");
        });
    }


}
