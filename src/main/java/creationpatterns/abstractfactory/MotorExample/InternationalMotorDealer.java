package creationpatterns.abstractfactory.MotorExample;

import creationpatterns.abstractfactory.MotorExample.Elements.CustomizedChoicedElements;
import creationpatterns.abstractfactory.MotorExample.Elements.EngineChoice;
import creationpatterns.abstractfactory.MotorExample.Factory.ChinaMotorFactory;
import creationpatterns.abstractfactory.MotorExample.Factory.MotorFactory;
import creationpatterns.abstractfactory.MotorExample.Factory.USMotorFactory;
import creationpatterns.abstractfactory.MotorExample.Motor.Motor;

public class InternationalMotorDealer {


    public static void main(String[] args) {
        InternationalMotorDealer Mike = new InternationalMotorDealer();
        Mike.todaySales();
    }

    private void todaySales() {
        MotorFactory chinaMotorFactory = new ChinaMotorFactory();
        MotorFactory usMotorFactory = new USMotorFactory();

        Motor JohnsUSHondaMotor = usMotorFactory.buildHondaMotor(
                CustomizedChoicedElements.builder()
                .buyer("John")
                .engine(EngineChoice.ENGINE_500)
                .flame(true)
                .turbo(true)
                .build()
        );
        JohnsUSHondaMotor.run();



        Motor KasUSHondaMotor = usMotorFactory.buildHondaMotor(
                CustomizedChoicedElements.builder()
                        .buyer("KA")
                        .engine(EngineChoice.ENGINE_500)
                        .flame(false)
                        .turbo(true)
                        .build()
        );
        KasUSHondaMotor.run();


        Motor LiusChinaYamahaMotor = chinaMotorFactory.buildYamahaMotor(
                CustomizedChoicedElements.builder()
                        .buyer("Liu")
                        .engine(EngineChoice.ENGINE_300)
                        .build()
        );
        LiusChinaYamahaMotor.run();
    }
}