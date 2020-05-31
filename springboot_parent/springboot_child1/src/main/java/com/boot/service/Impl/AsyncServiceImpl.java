package com.boot.service.Impl;

import java.util.Random;
import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import com.boot.service.AsyncService;
//异步调用测试
@Service
public class AsyncServiceImpl implements AsyncService {
	private static Random random=new Random();

	@Async
	@Override
	public Future<String> doTask1() throws Exception {
		System.out.println("task1 start");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end= System.currentTimeMillis();
		System.out.println("task1 end -"+(end-start)+"s");

		return new AsyncResult<String>("task1 结束");
	}

	@Async
	@Override
	public Future<String> doTask2() throws Exception {
		System.out.println("task2 start");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end= System.currentTimeMillis();
		System.out.println("task2 end -"+(end-start)+"s");

		return new AsyncResult<String>("task2 结束");
	}

	@Async
	@Override
	public Future<String> doTask3() throws Exception {
		System.out.println("task3 start");
		long start=System.currentTimeMillis();
		Thread.sleep(random.nextInt(10000));
		long end= System.currentTimeMillis();
		System.out.println("task3 end -"+(end-start)+"s");

		return new AsyncResult<String>("task3 结束");
	}

	

}
