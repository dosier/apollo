package org.apollo.game.event.impl;

import org.apollo.game.event.Event;

/**
 * An {@link Event} sent to the client to set a widget's text.
 * 
 * @author Graham
 */
public final class SetWidgetTextEvent extends Event {

    /**
     * The interface's id.
     */
    private final int interfaceId;

    /**
     * The text.
     */
    private final String text;

    /**
     * Creates the set interface text event.
     * 
     * @param interfaceId The interface's id.
     * @param text The interface's text.
     */
    public SetWidgetTextEvent(int interfaceId, String text) {
	this.interfaceId = interfaceId;
	this.text = text;
    }

    /**
     * Gets the interface id.
     * 
     * @return The interface id.
     */
    public int getInterfaceId() {
	return interfaceId;
    }

    /**
     * Gets the interface's text.
     * 
     * @return The interface's text.
     */
    public String getText() {
	return text;
    }

}