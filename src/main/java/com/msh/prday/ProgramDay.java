package com.msh.prday;

public class ProgramDay {
    private final int errorCode;
    private final String dataMessage;

    public ProgramDay(int errorCode, String dataMessage) {
        this.errorCode = errorCode;
        this.dataMessage = dataMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getDataMessage() {
        return dataMessage;
    }
}
