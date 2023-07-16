package namegreetings;

public class NameGreetings {
    public String helloName(String s) {
        String result = "";
        if (s.isEmpty()) {
            result = "Hello " + "!";
        } else {
            result = "Hello " + s + "!";
        }
        return result;
    }
}
