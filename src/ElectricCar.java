import java.util.HashMap;
import java.util.Random;

public class ElectricCar extends Vehicles{
    protected int _wheelsNum;
    protected int _doorNum;
    ElectricCar(){
        super();
        Random rand = new Random();
        this._doorNum = rand.nextInt(4) + 2; // generate random number from 2 to 5 ..
        this._wheelsNum = 4;
    }

    @Override
    protected HashMap getInfo() {
        HashMap _Info = new HashMap();
        _Info.put("Vehicle type:" , "ElectricCar");
        _Info.put("WheelsNum:", _wheelsNum);
        _Info.put("Color:" , this._color);
        _Info.put("RemainPower:", this._remainPower);
        _Info.put("DoorsNumber:", _doorNum);
        return _Info;
    }

}
