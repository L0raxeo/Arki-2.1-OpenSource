package com.sampleCompany.arki.gameEngine.input.keyboard;

import com.sampleCompany.arki.gameEngine.utils.VersionInfo;

/**
 * The Key class holds the current
 * state of the key, and any queued
 * states associated with that key.
 *
 * @author Lorcan A. Cheng
 */
@VersionInfo(
        version = "1.0",
        releaseDate = "11/11/2021",
        since = "1.0",
        contributors = {
                "Lorcan Andrew Cheng"
        }
)
public class Key
{

    private final int keyCode;
    private final char keyChar;
    private KeyState state;
    private KeyState queuedState;

    // Class
    public Key(int key, KeyState state, char keyChar)
    {
        this.keyCode = key;
        this.queuedState = state;
        this.keyChar = keyChar;
    }

    public void setState()
    {
        this.state = this.queuedState;
    }

    public void queueState(KeyState state)
    {
        this.queuedState = state;
    }

    // Getters

    public int getKeyCode()
    {
        return keyCode;
    }

    public char getKeyChar()
    {
        return keyChar;
    }

    public KeyState getState()
    {
        return state;
    }

    public KeyState getQueuedState()
    {
        return queuedState;
    }

}
