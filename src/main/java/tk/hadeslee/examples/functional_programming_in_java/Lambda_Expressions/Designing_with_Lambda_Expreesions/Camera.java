package tk.hadeslee.examples.functional_programming_in_java.Lambda_Expressions.Designing_with_Lambda_Expreesions;

import java.awt.*;
import java.util.function.Function;

/**
 * Project: java8-examples
 * FileName: Camera
 * Date: 2015-11-11
 * Time: 오전 9:31
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
@SuppressWarnings("unchecked")
public class Camera {
    private Function<Color, Color> filter;

    public Color capture(final Color inputcolor) {
        final Color processedColor = filter.apply(inputcolor);
        return processedColor;
    }

}
