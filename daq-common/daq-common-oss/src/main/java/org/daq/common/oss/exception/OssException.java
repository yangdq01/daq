package org.daq.common.oss.exception;

import java.io.Serial;

/**
 * OSS异常类
 *
 * @author daq
 */
public class OssException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;

    public OssException(String msg) {
        super(msg);
    }

}
