package FindBomb;

public class Bomb {

    public String findBomb(String str) {
        String result = "";
        if (str.contains("")) {
            result = "Relax, there is no Bomb";
        }
        return result;
    }
}
