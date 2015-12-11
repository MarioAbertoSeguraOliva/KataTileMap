package map;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Map_ {

    @Test
    public void should_return_x_and_y_dimensions() throws Exception {
        TileMap tile = new TileMap("res/tilemaps/tilemap00.png");
        Map map = new Map("res/levels/level1", tile);
        assertThat(map.getDimension().getX(), is(15));
        assertThat(map.getDimension().getY(), is(20));
    }
}
