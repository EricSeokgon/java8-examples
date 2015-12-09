package tk.hadeslee.BJ8LF.Annotations;

/**
 * Project: java8-examples
 * FileName: VersionTest
 * Date: 2015-12-09
 * Time: 오전 10:52
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@Version(major = 1, minor = 0)
public class VersionTest {
    @Version(major = 1, minor = 1)
    private int xyz = 110;

    @Version(major = 1, minor = 0)
    public VersionTest() {

    }

    @Version(major = 1, minor = 1)
    public VersionTest(int xyz) {
        this.xyz = xyz;
    }

    @Version(major = 1, minor = 0)
    public void printData() {

    }

    @Version(major = 1, minor = 1)
    public void setXyz(int xyz) {
    }
}
