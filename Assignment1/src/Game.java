public class Game {
    public static void main(String[] args) {
        Map map = createMap("WildernessMap", 10, 10);
        map.display();
    }

    public static Map createMap(String type, int width, int height) {
        if (type.equals("CityMap")) {
            return new CityMap(width, height);
        } else if (type.equals("WildernessMap")) {
            return new WildernessMap(width, height);
        } else {
            throw new IllegalArgumentException("Unknown map type");
        }
    }
}