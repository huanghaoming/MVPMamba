package com.zhenmei.mvpmamba.demo.net.download;

import java.io.File;

public interface JsDownloadListener {
    void onStartDownload();

    void onProgress(int progress, long total);

    void onFinishDownload(File file);

    void onFail(String errorInfo);
}