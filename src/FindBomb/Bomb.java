package FindBomb;

public class Bomb {

    public String findBomb(String str) {
        String result = "";
        String toLowerCase = str.toLowerCase();
        if (toLowerCase.contains("bomb")) {
            result = "Duck!";
        } else {
            result = "Relax, there is no Bomb";
        }
        return result;
    }
}
