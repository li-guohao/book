package cn.liguohao.design.pattern.command;

import cn.liguohao.design.pattern.command.entity.Garage;
import cn.liguohao.design.pattern.command.entity.RemoteControl;
import cn.liguohao.design.pattern.command.entity.Light;

/**
 * @Description TODO
 * @Author liguohao
 * @Date 2020/9/24 23:03
 */
public class CommandTest {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOnCommand);
        remoteControl.buttonPress();

        Garage garage = new Garage();
        GarageDoorOnCommand garageDoorOnCommand = new GarageDoorOnCommand(garage);

        remoteControl.setCommand(garageDoorOnCommand);
        remoteControl.buttonPress();
    }
}
