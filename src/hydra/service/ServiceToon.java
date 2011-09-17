package hydra.service;

import com.google.protobuf.InvalidProtocolBufferException;

import bnet.protocol.Entity.EntityId;
import bnet.protocol.Rpc.NoData;
import bnet.protocol.authentication.Authentication.LogonRequest;
import bnet.protocol.authentication.Authentication.LogonResponse;
import bnet.protocol.toon.external.ToonExternal.CreateToonRequest;
import bnet.protocol.toon.external.ToonExternal.CreateToonResponse;
import bnet.protocol.toon.external.ToonExternal.ToonListRequest;
import bnet.protocol.toon.external.ToonExternal.ToonListResponse;
import hydra.HydraServerConnection;

public class ServiceToon implements Service
{
    private HydraServerConnection conn;
    
    public ServiceToon(HydraServerConnection conn)
    {
        this.conn = conn;
    }
    
    public void handleMessage(int method, int requestId, int length, byte[] message)
    {
        if (method == 1) {
            System.out.println("Matched ToonListRequest");
            this.handleToonListRequest(requestId, message);
        } else if (method == 3) {
            System.out.println("Matched CreateToonRequest");
            this.handleCreateToonRequest(requestId, message);
        }
    }
    
    private void handleToonListRequest(int requestId, byte[] message)
    {
        try
        {
            ToonListRequest toonListRequest = ToonListRequest.parseFrom(message);
            System.out.println(toonListRequest);
            ToonListResponse toonListResponse = ToonListResponse.newBuilder().build();
            this.conn.sendReply(requestId, toonListResponse.toByteArray());
            System.out.println("Sent ToonListResponse");
        }
        catch (InvalidProtocolBufferException e)
        {
            System.out.println("Couldn't parse ToonListRequest!");
        }
    }
    
    private void handleCreateToonRequest(int requestId, byte[] message)
    {
        try
        {
            CreateToonRequest createToonRequest = CreateToonRequest.parseFrom(message);
            System.out.println(createToonRequest);
            CreateToonResponse response = CreateToonResponse.newBuilder()
                    .setToon(EntityId.newBuilder().setHigh(0x300016200004433L).setLow(2L).build())
                    .build();
            this.conn.sendReply(requestId, response.toByteArray());
            System.out.println("Sent CreateToonResponse");
        }
        catch (InvalidProtocolBufferException e)
        {
            System.out.println("Couldn't parse ToonListRequest!");
        }
    }
}