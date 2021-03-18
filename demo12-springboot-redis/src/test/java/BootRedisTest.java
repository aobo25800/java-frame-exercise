import com.zjz.SpringRedisApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest(classes = SpringRedisApplication.class)
public class BootRedisTest {

//    @Autowired
//    StringRedisTemplate stringRedisTemplate;
//    @Autowired
//    RedisTemplate<Object, Object> redisTemplate;

    @Test
    public void funcTest(){
//        stringRedisTemplate.opsForValue().set("msg", "123");
//        System.out.println(stringRedisTemplate.opsForValue().get("msg"));
        System.out.println(1);
    }
}
