/*
 * QueueSampler.java - MXBean implementation for the QueueSampler MXBean.
 * This class must implement all the Java methods declared in the
 * QueueSamplerMXBean interface, with the appropriate behavior for each one.
 */

package jmx.mxbean;

import java.util.Date;
import java.util.Queue;

public class QueueSampler implements QueueSamplerMXBean {

	private Queue<String> queue;

	public QueueSampler(Queue<String> queue) {
		this.queue = queue;
	}

	@Override
	public QueueSample getQueueSample() {
		synchronized (this.queue) {
			return new QueueSample(new Date(), this.queue.size(), this.queue.peek());
		}
	}

	@Override
	public void clearQueue() {
		synchronized (this.queue) {
			this.queue.clear();
		}
	}
}
