package thread3;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class PublicMap {
    public Map<Integer,Integer> map = new ConcurrentHashMap<>();

    public synchronized void put(int i){
        while (map.size() >= 100){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        map.put(i,i);
        System.out.println("放入数据成功");
        notify();
    }

    public synchronized int get(int i){
        while (map.size() == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("数据取出成功");
        notify();
        return map.get(i);
    }
}
