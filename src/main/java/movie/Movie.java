package movie;

/**
 * Project: java8-examples
 * FileName: Movie
 * Date: 2015-12-02
 * Time: 오후 2:02
 * Author: Hades Lee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Movie {
    private int sumOfRate = 0;
    private int countOfRate = 0;

    public Integer averageRating() {

        return countOfRate == 0 ? 0 : sumOfRate / countOfRate;
    }

    public void rate(int rate) {
        this.sumOfRate += rate;
        countOfRate++;
    }
}
