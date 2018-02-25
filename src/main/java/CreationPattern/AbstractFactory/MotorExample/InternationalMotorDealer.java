package CreationPattern.AbstractFactory.MotorExample;

import CreationPattern.AbstractFactory.MotorExample.Elements.CustomizedChoicedElements;
import CreationPattern.AbstractFactory.MotorExample.Elements.EngineChoice;

public class InternationalMotorDealer {


    public static void main(String[] args) {
        InternationalMotorDealer Mike = new InternationalMotorDealer();
        Mike.todayDeals();
    }

    private void todayDeals() {
        InternationalMotorFactory chinaMotorFactory = new ChinaMotorFactory();
        InternationalMotorFactory usMotorFactory = new USMotorFactory();

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