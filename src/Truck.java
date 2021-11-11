import java.util.HashMap;
import java.util.Random;

public class Truck extends Vehicles{
    protected int _wheelsNum;
    protected boolean _cargoAttached;
    Truck(){
        super();
        Random rand = new Random();
        this._wheelsNum = 18;
        this._cargoAttached = rand.nextBoolean();
    }
    public HashMap getInfo(){
        HashMap _Info = new HashMap();
        _Info.put("Vehicle type:" , "Truck");
        _Info.put("WheelsNum:", _wheelsNum);
        _Info.put("Color:" , this._color);
        _Info.put("RemainPower:", this._remainPower);
        _Info.put("CargoAttached:", _cargoAttached);
        return _Info;
    }
}
