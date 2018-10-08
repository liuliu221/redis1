package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.redis.RedisReactiveAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

import demo.conifg.User;

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
public class TestRedis {
	@Autowired  
	private RedisTemplate redisTemplate;

	@Test
	public void set() {
		redisTemplate.opsForValue().set("test:set", "testValue1");
	}
	
	@Test
	public void get() {
		String s=(String) redisTemplate.opsForValue().get("test:set");
		System.out.println(s);
	}
	
	@Test
	public void setObject() {
		 User user =new User();
		 user.setName("jiayanping");
		 user.setAge(35);
		 redisTemplate.opsForValue().set("jialiu", user);
		 
		 System.out.println(redisTemplate.opsForValue().get("jialiu"));
	}
	
	@Test
	public void getUser() {
		System.out.println(redisTemplate.opsForValue().get("user"));
	}
}
