package rmi;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * 远程服务接口实现
 * 
 * @date 2018年1月27日 下午12:07:35
 * @author 李桥
 * @version 1.0
 */

public class MyRemoteServiceImpl extends UnicastRemoteObject implements MyRemoteService {

	public MyRemoteServiceImpl() throws RemoteException {
		super();
	}

	@Override
	public String sayHello() {
		return "Server says,'Hello'!";
	}

	public static void main(String[] args) {
		try {
			MyRemoteService myRemoteService = new MyRemoteServiceImpl();
			Naming.rebind("myRemoteService", myRemoteService);
			System.out.println("注册服务成功");
			System.in.read();
		} catch (Exception e) {
			System.err.println("注册服务异常：" + e.getMessage());
		}
	}

}
