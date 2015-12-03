package tk.hadeslee.Lambda_Expressions.Designing_with_Lambda_Expreesions;

/**
 * Project: java8-examples
 * FileName: MailBuilder
 * Date: 2015-11-16
 * Time: 오전 9:22
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MailBuilder {
    public MailBuilder from(final String address){ return this;}
    public MailBuilder to(final String address){ return this;}
    public MailBuilder subject(final String line){ return this;}
    public MailBuilder body(final String massage){ return this;}
    public void send(){System.out.println("sending..."); }

    public static void main(String[] args) {
        new MailBuilder()
                .from("sklee@dbcore.com")
                .to("sklee@dbcore.com")
                .subject("build notfication")
                .body(".... it good less ...")
                .send();
    }

}
