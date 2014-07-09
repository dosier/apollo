package org.apollo.net.release.r377;

import org.apollo.game.event.impl.FirstPlayerActionEvent;
import org.apollo.net.codec.game.DataOrder;
import org.apollo.net.codec.game.DataTransformation;
import org.apollo.net.codec.game.DataType;
import org.apollo.net.codec.game.GamePacket;
import org.apollo.net.codec.game.GamePacketReader;
import org.apollo.net.release.EventDecoder;

/**
 * An {@link EventDecoder} for the {@link FirstPlayerActionEvent}.
 * 
 * @author Major
 */
public final class FirstPlayerActionEventDecoder extends EventDecoder<FirstPlayerActionEvent> {

    @Override
    public FirstPlayerActionEvent decode(GamePacket packet) {
	GamePacketReader reader = new GamePacketReader(packet);
	int index = (int) reader.getUnsigned(DataType.SHORT, DataOrder.LITTLE, DataTransformation.ADD);
	return new FirstPlayerActionEvent(index);
    }

}