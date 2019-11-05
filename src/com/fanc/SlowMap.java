package com.fanc;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.*;

/**
 * @Author : fanc
 * @Date : 2019/11/4 8:58 下午
 */
public class SlowMap<K, V> extends AbstractMap<K, V> {
    private List<K> keys = new ArrayList<>();
    private List<V> values = new ArrayList<>();

    @Override
    public V put(K key, V value) {
        V oldvalue = get(key);
        if(!keys.contains(oldvalue)) {
            // 同步增加
            keys.add(key);
            values.add(value);
        }
        else {
            // 因为同步增加的原因，所以keys的索引是一直不变的
            values.set(keys.indexOf(key), value);
        }
        return oldvalue;
    }

    @Override
    public V get(Object key) {
        if (!keys.contains(key)) {
            return null;
        }
        return values.get(keys.indexOf(key));
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = new HashSet<>();
        Iterator<K> ki = keys.iterator();
        Iterator<V> vi = values.iterator();
        while(ki.hasNext()) {
            set.add(new MapEntry<>(ki.next(), vi.next()));
        }
        return set;
    }

    public static void main(String[] args) {
        SlowMap<String, String> map = new SlowMap<>();
        map.put("123", "agdfa");
        map.put("456", "fda");
        map.put("7979", "opip");
        map.put("567", "uore");
        System.out.println(map);
        System.out.println(map.get("123"));
        System.out.println(map.entrySet());
    }

}
