package other.singleton.factory;

/**
 * 抽象类工厂
 *
 */
public abstract class CarAbstructFactory {

}

//空调接口
interface Air_conditioner {
    void work();
}

//海尔空调
class Haier implements Air_conditioner {
    @Override
    public void work() {
        System.out.println(" Haier is working ...");
    }
}

//格力空调
class Gree implements Air_conditioner {
    @Override
    public void work() {
        System.out.println(" Gree is working ...");
    }
}


//一个发动机接口
interface Engine {
    void work();
}

//进口的发动机
class Engine_Import implements Engine{
    @Override
    public void work() {
        System.out.println("Engine_Import is working...");
    }
}

//本地的发动机
class Engine_Local implements Engine {
    @Override
    public void work() {
        System.out.println("Engine_Local  is working...");
    }
}

//汽车工厂的接口
abstract interface CarFactory {
    public Air_conditioner Intall_Air_conditioner();
    public Engine install_engine();
}

// A汽车工厂
class CarAFactory implements CarFactory{
    @Override
    public Air_conditioner Intall_Air_conditioner() {
        return new Haier();
    }

    @Override
    public Engine install_engine() {
        return new Engine_Import();
    }
}

//B汽车工厂
class CarBFactory implements CarFactory{
    @Override
    public Air_conditioner Intall_Air_conditioner() {
        return new Gree();
    }

    @Override
    public Engine install_engine() {
        return new Engine_Local();
    }
}

