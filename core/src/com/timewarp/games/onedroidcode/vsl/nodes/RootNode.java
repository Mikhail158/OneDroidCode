package com.timewarp.games.onedroidcode.vsl.nodes;

import com.timewarp.games.onedroidcode.vsl.CodeRunner;
import com.timewarp.games.onedroidcode.vsl.Node;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class RootNode extends Node {

    @Override
    public Node execute(CodeRunner runner) {
        Logger.getAnonymousLogger().log(Level.INFO, "ROOT ELEMENT");
        return next;
    }

    @Override
    public void reset() {
    }
}
