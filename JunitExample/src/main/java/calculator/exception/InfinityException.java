/*
 * Copyright 2015 NTS New Technology Systems GmbH. All Rights reserved.
 * NTS PROPRIETARY/CONFIDENTIAL. Use is subject to NTS License Agreement.
 * Address: Doernbacher Strasse 126, A-4073 Wilhering, Austria
 * Homepage: www.ntswincash.com
 */

package calculator.exception;

/**
 * Exception to indicate that a infinity has occured.
 *
 * @author pal
 */
public class InfinityException extends Exception {

    public InfinityException(String message) {
        super(message);
    }

}
