package map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Map {
    private final TileMap tile;
    private Dimension dimension;
    private int[][] map;

    public Map(String mapPath, TileMap tile) {
        this.tile = tile;
        loadMap(mapPath);
    }

    private void loadMap(String path) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            initalizeDimensions(bufferedReader);
            map = new int[dimension.getX()][dimension.getY()];
            parseMap(bufferedReader);
        } catch (java.io.IOException e) {}

    }

    private void parseMap(BufferedReader bufferedReader) throws IOException {
        String[] tokens;
        for (int row = 0; row < dimension.getX(); row++) {
            tokens = bufferedReader.readLine().split("\\s+");
            for (int column = 0; column < dimension.getY(); column++) {
                map[row][column] = Integer.parseInt(tokens[column]);
            }
        }
    }

    private void initalizeDimensions(BufferedReader bufferedReader) throws IOException {
        int rows = Integer.parseInt(bufferedReader.readLine());
        int columns = Integer.parseInt(bufferedReader.readLine());
        dimension = new Dimension(rows, columns);
    }


    public Dimension getDimension() {
        return dimension;
    }
}
