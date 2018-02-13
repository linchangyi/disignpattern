package chainOfResponsibility;

/**
 * 职责接口
 * @author LinChangyi
 * @date 2018/2/13
 **/
public abstract class Handler {
    /**
     * 持有后继的职责对象
     */
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 处理请求的方法
     * 可以根据需求传入参数
     */
    public abstract void handleRequest();
}
