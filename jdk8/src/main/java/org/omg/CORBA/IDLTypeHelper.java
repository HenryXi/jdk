/*
 * Copyright (c) 1999, 2001, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.omg.CORBA;


/**
* The Helper for <tt>IDLType</tt>.  For more information on
* Helper files, see <a href="doc-files/generatedfiles.html#helper">
* "Generated Files: Helper Files"</a>.<P>
* org/omg/CORBA/IDLTypeHelper.java
* Generated by the IDL-to-Java compiler (portable), version "3.0"
* from ir.idl
* 03 June 1999 11:33:44 o'clock GMT+00:00
*/

abstract public class IDLTypeHelper
{
  private static String  _id = "IDL:omg.org/CORBA/IDLType:1.0";

  public static void insert (Any a, IDLType that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static IDLType extract (Any a)
  {
    return read (a.create_input_stream ());
  }

  private static TypeCode __typeCode = null;
  synchronized public static TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = ORB.init ().create_interface_tc (IDLTypeHelper.id (), "IDLType");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static IDLType read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_IDLTypeStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, IDLType value)
  {
    ostream.write_Object ((Object) value);
  }

  public static IDLType narrow (Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof IDLType)
      return (IDLType)obj;
    else if (!obj._is_a (id ()))
      throw new BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      return new _IDLTypeStub (delegate);
    }
  }

}
