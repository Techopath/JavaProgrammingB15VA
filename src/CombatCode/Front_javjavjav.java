package CombatCode;

public class Front_javjavjav {
    public static void main(String[] args) {

    }
    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }

        return front + front + front;
    }
}
