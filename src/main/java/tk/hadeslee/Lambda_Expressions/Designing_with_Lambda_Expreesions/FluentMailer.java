package tk.hadeslee.Lambda_Expressions.Designing_with_Lambda_Expreesions;

import java.util.function.Consumer;

/**
 * Project: java8-examples
 * FileName: FluentMailer
 * Date: 2015-11-16
 * Time: 오전 9:28
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class FluentMailer {
    private FluentMailer() {
    }

    public FluentMailer from(final String address) {
        return this;
    }

    public FluentMailer to(final String address) {
        return this;
    }

    public FluentMailer subject(final String line) {
        return this;
    }

    public FluentMailer body(final String message) {
        return this;
    }

    public static void send(final Consumer<FluentMailer> block) {
        final FluentMailer mailer = new FluentMailer();
        block.accept(mailer);
        System.out.println("sending ...");
    }

    public static void main(String[] args) {
        FluentMailer.send(mailer ->
                mailer.from("sklee@dbcore.com")
                        .to("sklee@dbcore.com")
                        .subject("build notification")
                        .body("...much better..."));

    }


}
