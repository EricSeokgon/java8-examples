package tk.hadeslee.Lambda_Expressions.Designing_with_Lambda_Expreesions;

/**
 * Project: java8-examples
 * FileName: Mailer
 * Date: 2015-11-14
 * Time: 오전 12:14
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Mailer {
    public void from(final String address) {
    }

    public void to(final String address) {
    }

    public void subject(final String line) {
    }

    public void body(final String message) {
    }

    public void send() {
        System.out.println("sending...");
    }

    public static void main(String[] args) {
        Mailer mailer = new Mailer();
        mailer.from("sklee@dbcore.com");
        mailer.to("sklee@dbcore.com");
        mailer.subject("build notification");
        mailer.body(".... your code good ....");
        mailer.send();
    }



}
