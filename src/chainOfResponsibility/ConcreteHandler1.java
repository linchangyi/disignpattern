package chainOfResponsibility;

/**
 * @author LinChangyi
 * @date 2018/2/13
 **/
public class ConcreteHandler1 extends Handler{
    @Override
    public void handleRequest() {
        //根据某些条件来判断是否属于自己的职责范围
        //判断条件比如，从外部传入的参数，或者这里主动去获取的外部数据
        //如从数据库中获取等，下面只是个示意
        boolean someCondition = false;

        if(someCondition){
            //属于自己的职责
            System.out.println("ConcreteHandler1 handle request");
        } else {
            if(this.successor!=null){
                this.successor.handleRequest();
            }
        }
    }
}
