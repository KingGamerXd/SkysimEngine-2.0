/*
 * Decompiled with CFR 0.152.
 */
package vn.giakhanhvn.skysim.nms.nmsutil.apihelper.exception;

public class MissingHostException
extends RuntimeException {
    public MissingHostException() {
    }

    public MissingHostException(String message) {
        super(message);
    }

    public MissingHostException(String message, Throwable cause) {
        super(message, cause);
    }

    public MissingHostException(Throwable cause) {
        super(cause);
    }

    public MissingHostException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

