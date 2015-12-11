package map;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class TileMap {
    private String path;
    private BufferedImage tileSet;

    public TileMap(String path) {
        this.path = path;
        loadTiles(path);
    }

    public String path() {
        return path;
    }

    public void path(String path) {
        this.path = path;
    }

    public void loadTiles(String path){
        try {
            tileSet = ImageIO.read(new File(path));
        } catch (IOException e) {}
    }
}
