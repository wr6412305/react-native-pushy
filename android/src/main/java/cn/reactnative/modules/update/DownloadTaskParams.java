package cn.reactnative.modules.update;

import android.content.Context;

import java.io.File;

/**
 * Created by tdzl2003 on 3/31/16.
 */
class DownloadTaskParams {
    static final int TASK_TYPE_FULL_DOWNLOAD = 1;
    static final int TASK_TYPE_PATCH_FROM_APK = 2;
    static final int TASK_TYPE_PATCH_FROM_HASH = 3;

    int         type;
    String      url;
    String      hash;
    File zipFilePath;
    File unzipDirectory;
    UpdateContext.DownloadFileListener listener;
}
