package com.nourl.streamsiteplayerremote.networking.messages;

import com.nourl.streamsiteplayerremote.networking.UByte;

/**
 * Created by Jannes Peters on 21.10.2015.
 */
public class InfoNetworkMessage extends NetworkMessage {

    public enum InfoNetworkMessageType {
        SERIES_CHANGED(0);

        private UByte id;
        InfoNetworkMessageType(int val) {
            id = new UByte(val);
        }

        public static InfoNetworkMessageType get(UByte id) {
            for (InfoNetworkMessageType type : values()) {
                if (type.getValue().equals(id)) return type;
            }
            return null;
        }

        public UByte getValue() {
            return id;
        }
    }

    public InfoNetworkMessage(UByte type, UByte id) {
        super(NetworkMessageType.INFO, type, id, null);
    }

    public InfoNetworkMessage(InfoNetworkMessageType type, UByte id) {
        super(NetworkMessageType.INFO, type.getValue(), id, null);
    }

    public InfoNetworkMessage(UByte type, UByte id, byte[] data) {
        super(NetworkMessageType.INFO, type, id, data);
    }

    public InfoNetworkMessage(InfoNetworkMessageType type, UByte id, byte[] data) {
        super(NetworkMessageType.INFO, type.getValue(), id, data);
    }
}
