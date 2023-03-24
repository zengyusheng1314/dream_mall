package com.sean.mall.rediscomm.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/**
 * redis
 *
 * @author zhanghh Email:zhanghonghui007@163.com
 * @since 2023/03/24 19:28
 */
@Slf4j
public class RedisOpsExtUtil {

    @Resource(name = "redisCluster")
    private RedisTemplate redisTemplate;

    public void set(String key, Object value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public void set(String key, Object value, long timeOut, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, value, timeOut, timeUnit);
    }

    public <V> void putAllListRight(String key, Collection<V> value) {
        if (CollectionUtils.isEmpty(value)) {
            log.warn("{}没有数据可以放入redis中}", key);
        } else {
            redisTemplate.opsForList().rightPushAll(key, value);
        }
    }

    public <T> T getAllList(String key, Class<T> t) {
        return (T)redisTemplate.opsForList().range(key, 0, -1);
    }

    public <T> T get(String key, Class<T> t) {
        return (T)redisTemplate.opsForValue().get(key);
    }

    public String get(String key) {
        return (String)redisTemplate.opsForValue().get(key);
    }

    public Long decr(String key) {
        return redisTemplate.opsForValue().decrement(key);
    }

    public Long decr(String key, Long delta) {
        return redisTemplate.opsForValue().decrement(key, delta);
    }

    public Long incr(String key) {
        return redisTemplate.opsForValue().increment(key);
    }

    public Long incr(String key, Long delta) {
        return redisTemplate.opsForValue().increment(key, delta);
    }

    public Boolean expire(String key, Long timeOut, TimeUnit timeUnit) {
        return redisTemplate.expire(key, timeOut, timeUnit);
    }

    public Boolean delete(String key) {
        return redisTemplate.delete(key);
    }

    public Boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    /**
     * 发布channl信息
     * 
     * @param channl
     * @param message
     */
    public void pushLish(String channl, Object message) {
        redisTemplate.convertAndSend(channl, message);
    }

}
