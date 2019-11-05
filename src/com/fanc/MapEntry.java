package com.fanc;

import java.util.Map;

/**
 * @Author : fanc
 * @Date : 2019/11/4 9:19 下午
 */
public class MapEntry<K, V> implements Map.Entry<K, V> {
    private K key;
    private V value;

    // 构造函数就不需要泛型了
    public MapEntry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V v) {
        V result = value;
        value = v;
        return result;
    }

    @Override
    public int hashCode() {
        return (key == null ? 0 : key.hashCode()) ^
                (value == null ? 0 : key.hashCode());
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof MapEntry)) {
            return false;
        }
        MapEntry me = (MapEntry) o;
        return (key == null ? me.getKey() == null : key.equals(me.getKey())) &&
                (value == null ? me.getValue() == null : value.equals(me.getValue()));
    }

    @Override
    public String toString() {
        return key + "=" + value;
    }
}
