package observer;

/**
 * @author LinChangyi
 * @date 2018/3/5
 **/
public interface Observer {
    /**
     * 观察者更新方法
     * 拉模式：传入整个Subject对象，让观察者自行操作
     * 推模式：Subject知道Observer所需要的数据，只传入相应参数
     */
    void update(Subject subject);
}
