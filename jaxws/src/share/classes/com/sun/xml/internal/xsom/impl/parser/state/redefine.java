/*
 * Copyright 2005-2006 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 */
/* this file is generated by RelaxNGCC */
package com.sun.xml.internal.xsom.impl.parser.state;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.Attributes;
import com.sun.xml.internal.xsom.impl.parser.NGCCRuntimeEx;

    import com.sun.xml.internal.xsom.*;
    import com.sun.xml.internal.xsom.parser.*;
    import com.sun.xml.internal.xsom.impl.*;
    import com.sun.xml.internal.xsom.impl.parser.*;
    import org.xml.sax.Locator;
    import org.xml.sax.ContentHandler;
    import org.xml.sax.helpers.*;
    import java.util.*;



class redefine extends NGCCHandler {
    private String schemaLocation;
    private ModelGroupDeclImpl newGrp;
    private AttGroupDeclImpl newAg;
    private SimpleTypeImpl newSt;
    private ComplexTypeImpl newCt;
    protected final NGCCRuntimeEx $runtime;
    private int $_ngcc_current_state;
    protected String $uri;
    protected String $localName;
    protected String $qname;

    public final NGCCRuntime getRuntime() {
        return($runtime);
    }

    public redefine(NGCCHandler parent, NGCCEventSource source, NGCCRuntimeEx runtime, int cookie) {
        super(source, parent, cookie);
        $runtime = runtime;
        $_ngcc_current_state = 15;
    }

    public redefine(NGCCRuntimeEx runtime) {
        this(null, runtime, runtime, -1);
    }

    private void action0()throws SAXException {
        XSAttGroupDecl oldAg = $runtime.currentSchema.getAttGroupDecl(newAg.getName());
            if(oldAg==null) {
              $runtime.reportError( Messages.format(Messages.ERR_UNDEFINED_ATTRIBUTEGROUP,newAg.getName()) );
            } else {
              newAg.redefine((AttGroupDeclImpl)oldAg);
              $runtime.currentSchema.addAttGroupDecl(newAg,true);
            }
}

    private void action1()throws SAXException {
        XSModelGroupDecl oldGrp = $runtime.currentSchema.getModelGroupDecl(newGrp.getName());
            if(oldGrp==null) {
              $runtime.reportError( Messages.format(Messages.ERR_UNDEFINED_MODELGROUP,newGrp.getName()) );
            } else {
              newGrp.redefine((ModelGroupDeclImpl)oldGrp);
              $runtime.currentSchema.addModelGroupDecl(newGrp,true);
            }
}

    private void action2()throws SAXException {
        XSComplexType oldCt = $runtime.currentSchema.getComplexType(newCt.getName());
            if(oldCt==null) {
              $runtime.reportError( Messages.format(Messages.ERR_UNDEFINED_COMPLEXTYPE,newCt.getName()) );
            } else {
              newCt.redefine((ComplexTypeImpl)oldCt);
              $runtime.currentSchema.addComplexType(newCt,true);
            }
}

    private void action3()throws SAXException {
        XSSimpleType oldSt = $runtime.currentSchema.getSimpleType(newSt.getName());
            if(oldSt==null) {
              $runtime.reportError( Messages.format(Messages.ERR_UNDEFINED_SIMPLETYPE,newSt.getName()) );
            } else {
              newSt.redefine((SimpleTypeImpl)oldSt);
              $runtime.currentSchema.addSimpleType(newSt,true);
            }
}

    private void action4()throws SAXException {
        $runtime.includeSchema( schemaLocation );
}

    public void enterElement(String $__uri, String $__local, String $__qname, Attributes $attrs) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 15:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("redefine"))) {
                    $runtime.onEnterElementConsumed($__uri, $__local, $__qname, $attrs);
                    $_ngcc_current_state = 14;
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        case 1:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation"))) {
                    NGCCHandler h = new annotation(this, super._source, $runtime, 476, null,AnnotationContext.SCHEMA);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("simpleType"))) {
                        NGCCHandler h = new simpleType(this, super._source, $runtime, 477);
                        spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                    }
                    else {
                        if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("complexType"))) {
                            NGCCHandler h = new complexType(this, super._source, $runtime, 478);
                            spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                        }
                        else {
                            if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("group"))) {
                                NGCCHandler h = new group(this, super._source, $runtime, 479);
                                spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                            }
                            else {
                                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attributeGroup"))) {
                                    NGCCHandler h = new attributeGroupDecl(this, super._source, $runtime, 480);
                                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                                }
                                else {
                                    unexpectedEnterElement($__qname);
                                }
                            }
                        }
                    }
                }
            }
            break;
        case 0:
            {
                revertToParentFromEnterElement(this, super._cookie, $__uri, $__local, $__qname, $attrs);
            }
            break;
        case 14:
            {
                if(($ai = $runtime.getAttributeIndex("","schemaLocation"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    unexpectedEnterElement($__qname);
                }
            }
            break;
        case 2:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("annotation"))) {
                    NGCCHandler h = new annotation(this, super._source, $runtime, 481, null,AnnotationContext.SCHEMA);
                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                }
                else {
                    if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("simpleType"))) {
                        NGCCHandler h = new simpleType(this, super._source, $runtime, 482);
                        spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                    }
                    else {
                        if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("complexType"))) {
                            NGCCHandler h = new complexType(this, super._source, $runtime, 483);
                            spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                        }
                        else {
                            if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("group"))) {
                                NGCCHandler h = new group(this, super._source, $runtime, 484);
                                spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                            }
                            else {
                                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("attributeGroup"))) {
                                    NGCCHandler h = new attributeGroupDecl(this, super._source, $runtime, 485);
                                    spawnChildFromEnterElement(h, $__uri, $__local, $__qname, $attrs);
                                }
                                else {
                                    $_ngcc_current_state = 1;
                                    $runtime.sendEnterElement(super._cookie, $__uri, $__local, $__qname, $attrs);
                                }
                            }
                        }
                    }
                }
            }
            break;
        default:
            {
                unexpectedEnterElement($__qname);
            }
            break;
        }
    }

    public void leaveElement(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 1:
            {
                if(($__uri.equals("http://www.w3.org/2001/XMLSchema") && $__local.equals("redefine"))) {
                    $runtime.onLeaveElementConsumed($__uri, $__local, $__qname);
                    $_ngcc_current_state = 0;
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 0:
            {
                revertToParentFromLeaveElement(this, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 14:
            {
                if(($ai = $runtime.getAttributeIndex("","schemaLocation"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
                }
                else {
                    unexpectedLeaveElement($__qname);
                }
            }
            break;
        case 2:
            {
                $_ngcc_current_state = 1;
                $runtime.sendLeaveElement(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedLeaveElement($__qname);
            }
            break;
        }
    }

    public void enterAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 0:
            {
                revertToParentFromEnterAttribute(this, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 14:
            {
                if(($__uri.equals("") && $__local.equals("schemaLocation"))) {
                    $_ngcc_current_state = 13;
                }
                else {
                    unexpectedEnterAttribute($__qname);
                }
            }
            break;
        case 2:
            {
                $_ngcc_current_state = 1;
                $runtime.sendEnterAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        default:
            {
                unexpectedEnterAttribute($__qname);
            }
            break;
        }
    }

    public void leaveAttribute(String $__uri, String $__local, String $__qname) throws SAXException {
        int $ai;
        $uri = $__uri;
        $localName = $__local;
        $qname = $__qname;
        switch($_ngcc_current_state) {
        case 0:
            {
                revertToParentFromLeaveAttribute(this, super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 2:
            {
                $_ngcc_current_state = 1;
                $runtime.sendLeaveAttribute(super._cookie, $__uri, $__local, $__qname);
            }
            break;
        case 12:
            {
                if(($__uri.equals("") && $__local.equals("schemaLocation"))) {
                    $_ngcc_current_state = 2;
                }
                else {
                    unexpectedLeaveAttribute($__qname);
                }
            }
            break;
        default:
            {
                unexpectedLeaveAttribute($__qname);
            }
            break;
        }
    }

    public void text(String $value) throws SAXException {
        int $ai;
        switch($_ngcc_current_state) {
        case 0:
            {
                revertToParentFromText(this, super._cookie, $value);
            }
            break;
        case 14:
            {
                if(($ai = $runtime.getAttributeIndex("","schemaLocation"))>=0) {
                    $runtime.consumeAttribute($ai);
                    $runtime.sendText(super._cookie, $value);
                }
            }
            break;
        case 2:
            {
                $_ngcc_current_state = 1;
                $runtime.sendText(super._cookie, $value);
            }
            break;
        case 13:
            {
                schemaLocation = $value;
                $_ngcc_current_state = 12;
                action4();
            }
            break;
        }
    }

    public void onChildCompleted(Object $__result__, int $__cookie__, boolean $__needAttCheck__)throws SAXException {
        switch($__cookie__) {
        case 476:
            {
                $_ngcc_current_state = 1;
            }
            break;
        case 477:
            {
                newSt = ((SimpleTypeImpl)$__result__);
                action3();
                $_ngcc_current_state = 1;
            }
            break;
        case 478:
            {
                newCt = ((ComplexTypeImpl)$__result__);
                action2();
                $_ngcc_current_state = 1;
            }
            break;
        case 479:
            {
                newGrp = ((ModelGroupDeclImpl)$__result__);
                action1();
                $_ngcc_current_state = 1;
            }
            break;
        case 480:
            {
                newAg = ((AttGroupDeclImpl)$__result__);
                action0();
                $_ngcc_current_state = 1;
            }
            break;
        case 481:
            {
                $_ngcc_current_state = 1;
            }
            break;
        case 482:
            {
                newSt = ((SimpleTypeImpl)$__result__);
                action3();
                $_ngcc_current_state = 1;
            }
            break;
        case 483:
            {
                newCt = ((ComplexTypeImpl)$__result__);
                action2();
                $_ngcc_current_state = 1;
            }
            break;
        case 484:
            {
                newGrp = ((ModelGroupDeclImpl)$__result__);
                action1();
                $_ngcc_current_state = 1;
            }
            break;
        case 485:
            {
                newAg = ((AttGroupDeclImpl)$__result__);
                action0();
                $_ngcc_current_state = 1;
            }
            break;
        }
    }

    public boolean accepted() {
        return(($_ngcc_current_state == 0));
    }


}
