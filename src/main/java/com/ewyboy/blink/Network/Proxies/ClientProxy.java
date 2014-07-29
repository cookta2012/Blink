package com.ewyboy.blink.Network.Proxies;

import org.lwjgl.input.Keyboard;

public class ClientProxy extends CommonProxy {


    public static boolean goUp() {
        return Keyboard.isKeyDown(Keyboard.KEY_SPACE);
    }

    public static boolean shiftPressed() {
        return Keyboard.isKeyDown(Keyboard.KEY_LSHIFT);
    }

}
