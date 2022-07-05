package com.tugalsan.trm.paint;

import com.tugalsan.api.input.server.*;
import com.tugalsan.api.log.server.*;
import com.tugalsan.api.thread.server.*;
import java.nio.file.*;

//WHEN RUNNING IN NETBEANS, ALL DEPENDENCIES SHOULD HAVE TARGET FOLDER!
public class Main {

    final private static TS_Log d = TS_Log.of(Main.class.getSimpleName());

    /*
        
     */
    public static void main(String[] args) {
        System.out.println("0");
        var soundRecorder = TS_InputSound.of(Path.of("D:\\as\\a.wav"));
        System.out.println("1");
        TS_ThreadWaitUtils.seconds(null, 20f, "");
        System.out.println("3");
        soundRecorder.kill();
        System.out.println("5");
        soundRecorder.saveToFile();
        System.out.println("6");
    }
}
