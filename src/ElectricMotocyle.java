import java.util.HashMap;
import java.util.Random;

public class ElectricMotocyle extends Vehicles {
    protected int _wheelsNum;
    ElectricMotocyle(){
        super();
        this._wheelsNum = 2;

    }

    @Override
    protected HashMap getInfo() {
        HashMap _Info = new HashMap();
        _Info.put("Vehicle type:" , "ElectricMotocyle");
        _Info.put("WheelsNum:", _wheelsNum);
        _Info.put("Color:" , this._color);
        _Info.put("RemainPower:", this._remainPower);
        return _Info;
    }
}