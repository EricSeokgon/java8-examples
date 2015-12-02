package movie;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;

/**
 * Project: java8-examples
 * FileName: MovieTest
 * Date: 2015-12-02
 * Time: 오후 2:00
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MovieTest {

    private Movie movie;

    @Before
    public void setUp() throws Exception {
        movie = new Movie();
    }

    @Test
    public void should_return_0_when_just_created() {
        assertThat(movie.averageRating(), is(0));
    }

    @Test
    public void should_return_1_when_1_was_rated() {
        movie.rate(1);
        assertThat(movie.averageRating(), is(1));
    }

    @Test
    public void should_return_4_when_3_and_5_were_rated() {
        movie.rate(3);
        movie.rate(5);
        assertThat(movie.averageRating(), is(4));

    }
}