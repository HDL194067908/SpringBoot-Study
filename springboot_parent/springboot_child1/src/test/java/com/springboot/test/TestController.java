package com.springboot.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.boot.controller.IndexController;

import junit.framework.TestCase;

@SpringBootTest(classes = IndexController.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestController {

	@Autowired
	private IndexController indexcoontroller;
	
	@Test
	public void test1() {
		TestCase.assertEquals(this.indexcoontroller.index(), "hello");
	}
}
