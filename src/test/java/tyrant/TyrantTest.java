package tyrant;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Project: java8-examples
 * FileName: TyrantTest
 * Date: 2015-12-02
 * Time: 오후 2:33
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class TyrantTest {
    @Test
    public void getRetrievesWhatWasPut() throws IOException {
//        Tyrant t = new Tyrant();
//        t.put("key", "value");
//        assertThat(t.get("key"), is("value"));

        new TyrantMap().put();

    }

    private class TyrantMap {

        public static final int OPERATION_PREFIX = 0xC8;
        public static final int OPERATION_PUT = 0x10;
        private Socket socket;
        private DataOutputStream writer;
        private InputStream reader;

        public void put() throws IOException {
            String key = "key";
            String value = "value";

            socket = new Socket("127.0.0.1", 1978);
            writer = new DataOutputStream(socket.getOutputStream());
            writer.write(OPERATION_PREFIX);
            writer.write(OPERATION_PUT);
            writer.writeInt(key.length());
            writer.writeInt(value.length());
            writer.write(key.getBytes()); //key
            writer.write(value.getBytes()); //value
            reader = socket.getInputStream();
            int status = reader.read();
            assertThat(status, is(1));
        }
    }
}
