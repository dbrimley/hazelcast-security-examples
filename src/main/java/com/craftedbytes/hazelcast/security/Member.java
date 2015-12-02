package com.craftedbytes.hazelcast.security;

import com.hazelcast.client.ClientEndpoint;
import com.hazelcast.core.Client;
import com.hazelcast.core.ClientListener;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class Member {

    public static void main(String args[]){

        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();

        hazelcastInstance.getClientService().addClientListener(new ClientListener() {

            public void clientConnected(Client client) {
                ClientEndpoint clientEndpoint = (ClientEndpoint) client;
                System.out.println("Connected");
            }

            public void clientDisconnected(Client client) {

            }
        });
    }

}
