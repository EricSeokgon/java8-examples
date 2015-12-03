package tk.hadeslee.Lambda_Expressions.String_Compararors_Filters;

import java.io.IOException;
import java.nio.file.*;
import java.util.concurrent.TimeUnit;

/**
 * Project: java8-examples
 * FileName: WatchFileChange
 * Date: 2015-11-06
 * Time: 오전 10:13
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class WatchFileChange {
    public static void main(String[] args) throws IOException, InterruptedException {
        final Path path = Paths.get(".");
        final WatchService watchService = path.getFileSystem().newWatchService();

        path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);

        System.out.println("Report any file changed within next 1 mintes...");

        final WatchKey watchKey = watchService.poll(1, TimeUnit.MINUTES);

        if (watchKey != null) {
            watchKey.pollEvents().stream().forEach(event -> System.out.println(event.context()));
        }


    }
}
