import java.util.HashMap;
import java.util.Random;

public abstract class Vehicles {
    protected String _color;
    protected int _remainPower;

    Vehicles() {
        this._color = RandomColor();
        Random rand = new Random();
        this._remainPower = rand.nextInt(101);
    }

    private String RandomColor() {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(7);
        String _toReturn;
        switch (rand_int1) {
            case 0:
                _toReturn = "Black";
                break;
            case 1:
                _toReturn = "White";
                break;
            case 2:
                _toReturn = "Red";
                break;
            case 3:
                _toReturn = "Brown";
                break;
            case 4:
                _toReturn = "gray";
                break;
            case 5:
                _toReturn = "yellow";
                break;
            case 6:
                _toReturn = "blue";
                break;
            default:
                throw new IllegalStateException("Unexpected value of color: " + rand_int1);
        }
        return _toReturn;
    }

    enum Level {
        Black,
        White,
        Red,
        Brown,
        gray,
        yellow,
        blue
    }

    protected abstract HashMap getInfo(); // abstract function that the consumer can get the info

}