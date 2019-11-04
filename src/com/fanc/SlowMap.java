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

    }

}
