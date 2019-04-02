package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/_ActivatorImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u71/5731/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, December 22, 2015 6:17:58 PM PST
*/

public abstract class _ActivatorImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements Activator, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _ActivatorImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("active", new Integer (0));
    _methods.put ("registerEndpoints", new Integer (1));
    _methods.put ("getActiveServers", new Integer (2));
    _methods.put ("activate", new Integer (3));
    _methods.put ("shutdown", new Integer (4));
    _methods.put ("install", new Integer (5));
    _methods.put ("getORBNames", new Integer (6));
    _methods.put ("uninstall", new Integer (7));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    Integer __method = (Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  // A new ORB started server registers itself with the Activator
       case 0:  // activation/Activator/active
       {
         try {
           int serverId = ServerIdHelper.read (in);
           Server serverObj = ServerHelper.read (in);
           this.active (serverId, serverObj);
           out = $rh.createReply();
         } catch (ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           ServerNotRegisteredHelper.write (out, $ex);
         }
         break;
       }


  // Install a particular kind of endpoint
       case 1:  // activation/Activator/registerEndpoints
       {
         try {
           int serverId = ServerIdHelper.read (in);
           String orbId = ORBidHelper.read (in);
           EndPointInfo endPointInfo[] = EndpointInfoListHelper.read (in);
           this.registerEndpoints (serverId, orbId, endPointInfo);
           out = $rh.createReply();
         } catch (ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           ServerNotRegisteredHelper.write (out, $ex);
         } catch (NoSuchEndPoint $ex) {
           out = $rh.createExceptionReply ();
           NoSuchEndPointHelper.write (out, $ex);
         } catch (ORBAlreadyRegistered $ex) {
           out = $rh.createExceptionReply ();
           ORBAlreadyRegisteredHelper.write (out, $ex);
         }
         break;
       }


  // list active servers
       case 2:  // activation/Activator/getActiveServers
       {
         int $result[] = null;
         $result = this.getActiveServers ();
         out = $rh.createReply();
         ServerIdsHelper.write (out, $result);
         break;
       }


  // If the server is not running, start it up.
       case 3:  // activation/Activator/activate
       {
         try {
           int serverId = ServerIdHelper.read (in);
           this.activate (serverId);
           out = $rh.createReply();
         } catch (ServerAlreadyActive $ex) {
           out = $rh.createExceptionReply ();
           ServerAlreadyActiveHelper.write (out, $ex);
         } catch (ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           ServerNotRegisteredHelper.write (out, $ex);
         } catch (ServerHeldDown $ex) {
           out = $rh.createExceptionReply ();
           ServerHeldDownHelper.write (out, $ex);
         }
         break;
       }


  // If the server is running, shut it down
       case 4:  // activation/Activator/shutdown
       {
         try {
           int serverId = ServerIdHelper.read (in);
           this.shutdown (serverId);
           out = $rh.createReply();
         } catch (ServerNotActive $ex) {
           out = $rh.createExceptionReply ();
           ServerNotActiveHelper.write (out, $ex);
         } catch (ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           ServerNotRegisteredHelper.write (out, $ex);
         }
         break;
       }


  // currently running, this method will activate it.
       case 5:  // activation/Activator/install
       {
         try {
           int serverId = ServerIdHelper.read (in);
           this.install (serverId);
           out = $rh.createReply();
         } catch (ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           ServerNotRegisteredHelper.write (out, $ex);
         } catch (ServerHeldDown $ex) {
           out = $rh.createExceptionReply ();
           ServerHeldDownHelper.write (out, $ex);
         } catch (ServerAlreadyInstalled $ex) {
           out = $rh.createExceptionReply ();
           ServerAlreadyInstalledHelper.write (out, $ex);
         }
         break;
       }


  // list all registered ORBs for a server
       case 6:  // activation/Activator/getORBNames
       {
         try {
           int serverId = ServerIdHelper.read (in);
           String $result[] = null;
           $result = this.getORBNames (serverId);
           out = $rh.createReply();
           ORBidListHelper.write (out, $result);
         } catch (ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           ServerNotRegisteredHelper.write (out, $ex);
         }
         break;
       }


  // After this hook completes, the server may still be running.
       case 7:  // activation/Activator/uninstall
       {
         try {
           int serverId = ServerIdHelper.read (in);
           this.uninstall (serverId);
           out = $rh.createReply();
         } catch (ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           ServerNotRegisteredHelper.write (out, $ex);
         } catch (ServerHeldDown $ex) {
           out = $rh.createExceptionReply ();
           ServerHeldDownHelper.write (out, $ex);
         } catch (ServerAlreadyUninstalled $ex) {
           out = $rh.createExceptionReply ();
           ServerAlreadyUninstalledHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:activation/Activator:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _ActivatorImplBase
