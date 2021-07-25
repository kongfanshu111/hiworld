package RpcHomework;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Test {
    public static void main(String[] args) throws IOException {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1",12345);
        FindNameInterface proxy = RPC.getProxy(FindNameInterface.class, FindNameInterface.versionID, inetSocketAddress, new Configuration());
        System.out.println(proxy.findName("G20200541010078"));
    }
}
