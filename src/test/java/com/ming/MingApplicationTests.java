package com.ming;

import com.ming.project.generator.web.GenController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan(basePackages = "com.ming.*.*.mapper")
public class MingApplicationTests {

	@Autowired
	private GenController genController;

	@Test
	public void test01() {
		genController.batchGenCode("information");
	}
}
