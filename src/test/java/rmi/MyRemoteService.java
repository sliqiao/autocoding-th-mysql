package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 远程服务接口
 * 
 * @date 2018年1月27日 下午12:03:27
 * @author 李桥
 * @version 1.0
 */

public interface MyRemoteService extends Remote {
	public String sayHello() throws RemoteException;
}
