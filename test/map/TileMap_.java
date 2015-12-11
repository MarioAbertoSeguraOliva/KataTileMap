package map;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TileMap_ {
    @Test
    public void path_should_be_available_at_any_moment() throws Exception {
        String path = "res/tilemaps/tilemap00.png";
        TileMap tileMap = new TileMap(path);
        assertThat(tileMap.path(), is(path));
        path = "res/tilemaps/tilemap01.png";
        tileMap.path(path);
        assertThat(tileMap.path(), is(path));
    }

    @Test
    public void apath_should_be_available_at_any_moment() throws Exception {
        String path = "res/tilemaps/tilemap00.png";
        TileMap tileMap = new TileMap(path);
        assertThat(tileMap.path(), is(path));
        path = "res/tilemaps/tilemap01.png";
        tileMap.path(path);
        assertThat(tileMap.path(), is(path));
    }
}
