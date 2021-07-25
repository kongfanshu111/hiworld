package RpcHomework;

import org.apache.hadoop.ipc.ProtocolSignature;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FindNameInterfaceIml implements FindNameInterface {

    private Map<String, String> map = new HashMap<String, String>();

    @Override
    public String findName(String num) {
        map.put("G20200541010078", "孔凡书");
        return map.get(num);
    }

    @Override
    public long getProtocolVersion(String s, long l) throws IOException {
        return FindNameInterface.versionID;
    }

    @Override
    public ProtocolSignature getProtocolSignature(String s, long l, int i) throws IOException {
        return null;
    }

}
