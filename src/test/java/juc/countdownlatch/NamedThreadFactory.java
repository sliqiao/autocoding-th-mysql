/*
 * Copyright 1999-2011 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package juc.countdownlatch;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * InternalThreadFactory. ThreadFactory用来设置线程创建的方式，例如：线程命名和是否Daemon线程(守护线程)
 * 
 * @author qian.lei
 */

public class NamedThreadFactory implements ThreadFactory {
	private static final AtomicInteger POOL_SEQ = new AtomicInteger(1);

	private final AtomicInteger mThreadNum = new AtomicInteger(1);

	private final String mPrefix;

	private final boolean mDaemon;

	private final ThreadGroup mGroup;

	public NamedThreadFactory() {
		this("pool-" + NamedThreadFactory.POOL_SEQ.getAndIncrement(), false);
	}

	public NamedThreadFactory(String prefix) {
		this(prefix, false);
	}

	public NamedThreadFactory(String prefix, boolean daemon) {
		this.mPrefix = prefix + "-thread-";
		this.mDaemon = daemon;
		SecurityManager s = System.getSecurityManager();
		this.mGroup = (s == null) ? Thread.currentThread().getThreadGroup() : s.getThreadGroup();
	}

	@Override
	// jdk应用工厂方法模式
	public Thread newThread(Runnable runnable) {
		String name = this.mPrefix + this.mThreadNum.getAndIncrement();
		Thread ret = new Thread(this.mGroup, runnable, name, 0);
		ret.setDaemon(this.mDaemon);
		return ret;
	}

	public ThreadGroup getThreadGroup() {
		return this.mGroup;
	}
}