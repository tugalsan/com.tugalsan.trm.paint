package com.tugalsan.trm.paint;

import com.tugalsan.api.log.server.*;

//WHEN RUNNING IN NETBEANS, ALL DEPENDENCIES SHOULD HAVE TARGET FOLDER!
public class Main {

    final private static TS_Log d = TS_Log.of(Main.class);

    public static void main(String[] args) {
        new Scribble().setVisible(true);
    }
}
