package com.courses.java;

import java.util.NoSuchElementException;

/**
 * Created by User on 28.01.2016.
 */
public class WrongKeyParametrException extends Throwable {
    public WrongKeyParametrException(String message) {
        new NoSuchElementException(message);
    }
}
