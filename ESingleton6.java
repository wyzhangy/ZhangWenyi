package other.singleton;

public enum ESingleton6 {
    E_SINGLETON_6;

    private Singleton6 singleton6 = null;

//    private ESingleton6(){
//        singleton6 = new Singleton6();
//    }

    public Singleton6 geteSingleton6(){
        return singleton6;
    }
}

class test{
    public static void main(String[] args) {
        Singleton6 singleton61 = ESingleton6.E_SINGLETON_6.geteSingleton6();
        Singleton6 singleton62 = ESingleton6.E_SINGLETON_6.geteSingleton6();
        //两次获取的singeton为同一个singleton
        System.out.println(singleton61==singleton62);
    }
}
