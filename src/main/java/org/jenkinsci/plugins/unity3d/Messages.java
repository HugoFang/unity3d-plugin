package org.jenkinsci.plugins.unity3d;

import java.io.File;

public class Messages {
    public static String Unity3d_UnityHomeNotFullyExpanded(String path) {
        return "UnityHomeNotFullyExpanded : " + path;
    }

    public static String Unity3d_InvalidUnityHomeConfiguration(File file, String path) {
        return "InvalidUnityHomeConfiguration: " + path;
    }

    public static String Unity3d_UnityExecFailed(int result) {
        return "UnityExecFailed: " + result;
    }

    public static String Unity3d_NoUnity3dInstallation() {
        return "NoUnity3dInstallation";
    }

    public static String Unity3d_InvalidParamUnstableReturnCodes(String value) {
        return "InvalidParamUnstableReturnCodes: " + value;
    }

    public static String Unity3d_ExecUnexpectedlyFailed() {
        return "ExecUnexpectedlyFailed";
    }

    public static String Unity3d_BuildMarkedAsUnstableBecauseOfStatus(int result) {
        return "BuildMarkedAsUnstableBecauseOfStatus: " + result;
    }
}
