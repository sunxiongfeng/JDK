package sample.jnlp.webpad.src.version1;
/*
 * Copyright (c) 2006, 2010, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * -Redistribution of source code must retain the above copyright notice, this
 *  list of conditions and the following disclaimer.
 *
 * -Redistribution in binary form must reproduce the above copyright notice,
 *  this list of conditions and the following disclaimer in the documentation
 *  and/or other materials provided with the distribution.
 *
 * Neither the name of Oracle nor the names of contributors may
 * be used to endorse or promote products derived from this software without
 * specific prior written permission.
 *
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING
 * ANY IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE
 * OR NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN MICROSYSTEMS, INC. ("SUN")
 * AND ITS LICENSORS SHALL NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE
 * AS A RESULT OF USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS BE LIABLE FOR ANY LOST
 * REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT, SPECIAL, CONSEQUENTIAL,
 * INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND REGARDLESS OF THE THEORY
 * OF LIABILITY, ARISING OUT OF THE USE OF OR INABILITY TO USE THIS SOFTWARE,
 * EVEN IF SUN HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGES.
 *
 * You acknowledge that this software is not designed, licensed or intended
 * for use in the design, construction, operation or maintenance of any
 * nuclear facility.
 */

import javax.swing.Action;

/**
 * Represents the Cut Action.
 *
 */
public class CutAction extends JLFAbstractAction {

    private static final String ACTION_COMMAND_KEY_CUT = "cut-command";
    private static final String NAME_CUT = "Cut";
    private static final String SMALL_ICON_CUT = "Cut16.gif";
    private static final String LARGE_ICON_CUT = "Cut24.gif";
    private static final String SHORT_DESCRIPTION_CUT = "Cut";
    private static final String LONG_DESCRIPTION_CUT = "Remove the selected item from its current context. It is now available to be pasted elsewhere.";
    private static final int MNEMONIC_KEY_CUT = 'T';

    /**
     * ctor
     */
    public CutAction() {
        putValue(Action.NAME, NAME_CUT);
        putValue(Action.SMALL_ICON, getIcon(SMALL_ICON_CUT));
        putValue(LARGE_ICON, getIcon(LARGE_ICON_CUT));
        putValue(Action.SHORT_DESCRIPTION, SHORT_DESCRIPTION_CUT);
        putValue(Action.LONG_DESCRIPTION, LONG_DESCRIPTION_CUT);
        putValue(Action.MNEMONIC_KEY, new Integer(MNEMONIC_KEY_CUT));
        putValue(Action.ACTION_COMMAND_KEY, ACTION_COMMAND_KEY_CUT);
    }
}
