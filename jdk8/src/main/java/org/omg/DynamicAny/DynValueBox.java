package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/DynValueBox.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u71/5731/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Tuesday, December 22, 2015 6:17:59 PM PST
*/


/**
    * DynValueBox objects support the manipulation of IDL boxed value types.
    * The DynValueBox interface can represent both null and non-null value types.
    * For a DynValueBox representing a non-null value type, the DynValueBox has a single component
    * of the boxed type. A DynValueBox representing a null value type has no components
    * and a current position of -1.
    */
public interface DynValueBox extends DynValueBoxOperations, DynValueCommon, org.omg.CORBA.portable.IDLEntity
{
} // interface DynValueBox
