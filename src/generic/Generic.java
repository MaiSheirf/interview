package generic;

class Test<T>{
    T obj;

    public Test(T i) {
        this.obj = i;
    }

    public T getObject(){
        return this.obj;
        }
    }

public class Generic {

    public static void main(String [] args){
        Test<Integer> obj = new Test<Integer>(15);
        System.out.println(obj.getObject());


        Test<String> obj2 = new Test<String>("mai");
        System.out.println(obj2.getObject());
    }




}
