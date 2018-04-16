package other.singleton.factory;

/**
 * 简单的工厂模式
 * 根据类名进行匹配
 */
public class SimpleFactory{
    public Object create(Class tClass){
        if(tClass.getName().equals(C1.class.getName())){
            return getC1();
        }
        if(tClass.getName().equals(C2.class.getName())){
            return getC2();
        }else {
            return getC3();
        }
    }
    public C1 getC1(){
        return new C1();
    }
    public C2 getC2(){
        return new C2();
    }
    public C3 getC3(){
        return new C3();
    }

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.create(C1.class);
        simpleFactory.create(C2.class);
        simpleFactory.create(C3.class);
    }
}