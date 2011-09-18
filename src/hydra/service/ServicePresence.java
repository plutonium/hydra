package hydra.service;

import com.google.protobuf.InvalidProtocolBufferException;

import bnet.protocol.Entity.EntityId;
import bnet.protocol.Rpc.NoData;
import bnet.protocol.authentication.Authentication.LogonRequest;
import bnet.protocol.authentication.Authentication.LogonResponse;
import bnet.protocol.game_master.GameMaster.ListFactoriesRequest;
import bnet.protocol.presence.Presence.SubscribeRequest;
import hydra.HydraServerConnection;

public class ServicePresence implements Service
{
    private HydraServerConnection conn;
    
    public ServicePresence(HydraServerConnection conn)
    {
        this.conn = conn;
    }
    
    public void handleMessage(int method, int requestId, int length, byte[] message)
    {
        if (method == 1) {
            System.out.println("Matched SubscribeRequest");
            //this.handleSubscribeRequest(requestId, message);
        }
    }
    
    private void handleSubscribeRequest(int requestId, byte[] message)
    {
        try {
			SubscribeRequest request = SubscribeRequest.parseFrom(message);
			System.out.println(request);
			this.conn.sendReply(requestId, NoData.newBuilder().build().toByteArray());
			System.out.println("Sent SubscribeResponse (NoData)");
		} catch (InvalidProtocolBufferException e) {
			System.out.println("Couldn't parse SubscribeRequest!");
		}
    }
}