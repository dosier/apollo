package org.apollo.net.release.r317;

import org.apollo.game.message.impl.ClosedInterfaceMessage;
import org.apollo.net.codec.game.GamePacket;
import org.apollo.net.release.MessageDecoder;

/**
 * A {@link MessageDecoder} for the {@link ClosedInterfaceMessage}.
 *
 * @author Graham
 */
public final class ClosedInterfaceMessageDecoder extends MessageDecoder<ClosedInterfaceMessage> {

	@Override
	public ClosedInterfaceMessage decode(GamePacket packet) {
		return new ClosedInterfaceMessage();
	}

}