package RpcHomework;

import org.apache.hadoop.ipc.VersionedProtocol;

public interface FindNameInterface extends VersionedProtocol {

    long versionID = 1L;

    String findName(String num);

}
