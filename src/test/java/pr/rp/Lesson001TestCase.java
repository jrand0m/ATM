package pr.rp;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Lesson001TestCase {
    /**
     *
     *
     * */
    @Test
    public void WhenYouPourMoreLiquidInBottleThanItsCapacity(){
        Bottle wineBottle = new WineBottle(null,"Good Vine", "Green", 100);
        assertThat("wine bottle should be 700cl", wineBottle.getVOLUME(), is(700.00));
        Beer beer = new Beer("Yellow", "Bitter", "Muggy", 5.5, "Wheat");
        assertThat("default portion of beer is 500cl", beer.getLiquidWeight(), is(500.00));
        wineBottle.fill(beer);
        assertThat("when beer is poured into the wine bottle, there should be enough space left",  wineBottle.getVOLUME()-wineBottle.getDrink().getLiquidWeight(), is(200));
    }
}
