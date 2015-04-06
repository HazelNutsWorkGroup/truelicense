/*
 * Copyright (C) 2005-2015 Schlichtherle IT Services.
 * All rights reserved. Use is subject to license terms.
 */

package net.java.truelicense.core.auth;

/**
 * Provides an authentication.
 *
 * @author Christian Schlichtherle
 */
public interface AuthenticationProvider {
    /** Returns the authentication. */
    Authentication authentication();
}