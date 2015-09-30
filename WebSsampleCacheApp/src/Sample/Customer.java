package Sample;


/**
 * Cache' Java Class Generated for class Sample.Customer on version Cache for Windows (x86-64) 2014.1.2 (Build 753U_SU) Tue Jul 29 2014 11:55:37 EDT.<br>
 *
 * @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer</A>
**/

public class Customer extends com.intersys.classes.SerialObject implements java.io.Serializable {
    private static final long serialVersionUID = 1958;
    private static String CACHE_CLASS_NAME = "Sample.Customer";
    /**
           <p>NB: DO NOT USE IN APPLICATION(!!!).
           <br>Use <code>Sample.Customer.open</code> instead!</br></p>
           <p>
           Used to construct a Java object, corresponding to existing object
           in Cache database.
           </p>
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
    */
    public Customer (com.intersys.cache.CacheObject ref) throws com.intersys.objects.CacheException {
        super (ref);
    }
    public Customer (com.intersys.objects.Database db, String initstr) throws com.intersys.objects.CacheException {
        super (((com.intersys.cache.SysDatabase)db).newCacheObject (CACHE_CLASS_NAME,initstr));
    }
    public static com.intersys.classes.RegisteredObject createClientObject (com.intersys.objects.Database db)throws com.intersys.objects.CacheException {
        com.intersys.cache.CacheObject cobj = (((com.intersys.cache.SysDatabase)db).newClientObject(CACHE_CLASS_NAME));
        return new Customer (cobj);
    }
    public static com.intersys.classes.SerialObject open (com.intersys.objects.Database db, byte[] serialState) throws com.intersys.objects.CacheException {
         com.intersys.cache.CacheObject cobj = ((com.intersys.cache.SysDatabase)db).deserializeObject (CACHE_CLASS_NAME, serialState);
         return (com.intersys.classes.SerialObject) cobj.newJavaInstance();
    }
    /**
       Creates a new instance of object "Sample.Customer" in Cache
       database and corresponding object of class
       <code>Sample.Customer</code>.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @throws com.intersys.objects.CacheException in case of error.

              @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
              @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
     */
    public Customer (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
        super (((com.intersys.cache.SysDatabase)db).newCacheObject (CACHE_CLASS_NAME));
    }
    /**
       Runs method <code> %OpenId </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>Sample.Customer</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>Sample.Customer</code> or of
      any of its subclasses. Cast to <code>Sample.Customer</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
      <code>Id</code>.

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Customer
     */
    public static com.intersys.classes.RegisteredObject _open (com.intersys.objects.Database db, com.intersys.objects.Id id) throws com.intersys.objects.CacheException {
        return open(db, id);
    }
    /**
       Runs method <code> %OpenId </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>Sample.Customer</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>Sample.Customer</code> or of
      any of its subclasses. Cast to <code>Sample.Customer</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
      <code>Id</code>.

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Customer
     */
    public static com.intersys.classes.RegisteredObject open (com.intersys.objects.Database db, com.intersys.objects.Id id) throws com.intersys.objects.CacheException {
        com.intersys.cache.CacheObject cobj = (((com.intersys.cache.SysDatabase)db).openCacheObject(CACHE_CLASS_NAME, id.toString()));
        return (com.intersys.classes.RegisteredObject)(cobj.newJavaInstance());
    }
    /**
       Runs method <code> %OpenId </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>Sample.Customer</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>Sample.Customer</code> or of
      any of its subclasses. Cast to <code>Sample.Customer</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
      <code>Id</code>.
      @param concurrency Concurrency level.  represented as
      <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Customer
     */
    public static com.intersys.classes.RegisteredObject _open (com.intersys.objects.Database db, com.intersys.objects.Id id, int concurrency) throws com.intersys.objects.CacheException {
        return open(db, id, concurrency);
    }
    /**
       Runs method <code> %OpenId </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>Sample.Customer</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>Sample.Customer</code> or of
      any of its subclasses. Cast to <code>Sample.Customer</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
      <code>Id</code>.
      @param concurrency Concurrency level.  represented as
      <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Customer
     */
    public static com.intersys.classes.RegisteredObject open (com.intersys.objects.Database db, com.intersys.objects.Id id, int concurrency) throws com.intersys.objects.CacheException {
        com.intersys.cache.CacheObject cobj = (((com.intersys.cache.SysDatabase)db).openCacheObject(CACHE_CLASS_NAME, id.toString(), concurrency));
        return (com.intersys.classes.RegisteredObject)(cobj.newJavaInstance());
    }
    /**
       Runs method <code> %Open </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>Sample.Customer</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>Sample.Customer</code> or of
      any of its subclasses. Cast to <code>Sample.Customer</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.
       @param oid Object ID as specified in Cache. represented as
      <code>Oid</code>.


       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Customer(com.intersys.objects.Database)
     */
    public static com.intersys.classes.RegisteredObject _open (com.intersys.objects.Database db, com.intersys.objects.Oid oid) throws com.intersys.objects.CacheException {
        return open(db, oid);
    }
    /**
       Runs method <code> %Open </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>Sample.Customer</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>Sample.Customer</code> or of
      any of its subclasses. Cast to <code>Sample.Customer</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.
       @param oid Object ID as specified in Cache. represented as
      <code>Oid</code>.


       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Customer(com.intersys.objects.Database)
     */
    public static com.intersys.classes.RegisteredObject open (com.intersys.objects.Database db, com.intersys.objects.Oid oid) throws com.intersys.objects.CacheException {
        com.intersys.cache.CacheObject cobj = (((com.intersys.cache.SysDatabase)db).openCacheObject(CACHE_CLASS_NAME, oid.getData()));
        return (com.intersys.classes.RegisteredObject)(cobj.newJavaInstance());
    }
    /**
       Runs method <code> %Open </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>Sample.Customer</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>Sample.Customer</code> or of
      any of its subclasses. Cast to <code>Sample.Customer</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.
       @param oid Object ID as specified in Cache. represented as
      <code>Oid</code>.
      @param concurrency Concurrency level.  represented as
      <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>

      @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Customer(com.intersys.objects.Database)
     */
    public static com.intersys.classes.RegisteredObject _open (com.intersys.objects.Database db, com.intersys.objects.Oid oid, int concurrency) throws com.intersys.objects.CacheException {
        return open(db, oid, concurrency);
    }
    /**
       Runs method <code> %Open </code> in Cache to open an object
       from Cache database and creates corresponding object of class
       <code>Sample.Customer</code>.

       @return <code> RegisteredObject </code>, corresponding to opened
       object. This object may be of <code>Sample.Customer</code> or of
      any of its subclasses. Cast to <code>Sample.Customer</code> is
      guaranteed to pass without <code>ClassCastException</code> exception.

       @param db <code>Database</code> object used for connection with
       Cache database.
       @param oid Object ID as specified in Cache. represented as
      <code>Oid</code>.
      @param concurrency Concurrency level.  represented as
      <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>

      @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #open(com.intersys.objects.Database, com.intersys.objects.Oid)
           @see #Customer(com.intersys.objects.Database)
     */
    public static com.intersys.classes.RegisteredObject open (com.intersys.objects.Database db, com.intersys.objects.Oid oid, int concurrency) throws com.intersys.objects.CacheException {
        com.intersys.cache.CacheObject cobj = (((com.intersys.cache.SysDatabase)db).openCacheObject(CACHE_CLASS_NAME, oid.getData(), concurrency));
        return (com.intersys.classes.RegisteredObject)(cobj.newJavaInstance());
    }
    /**
       Runs method <code> %Delete </code> in Cache to delete an object
       from Cache database.

       Deletes the stored version of the object with OID <var>oid</var> from the database.
       It does not remove any in-memory versions of the object that may be present.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
       <code>Id</code>.

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_deleteId(com.intersys.objects.Database, com.intersys.objects.Id)
           @see #Customer
     */
    public static void delete (com.intersys.objects.Database db, com.intersys.objects.Id id) throws com.intersys.objects.CacheException {
        ((com.intersys.cache.SysDatabase)db).deleteObject(CACHE_CLASS_NAME, id);
    }
    /**
       Runs method <code> %Delete </code> in Cache to delete an object
       from Cache database.

       Deletes the stored version of the object with OID <var>oid</var> from the database.
       It does not remove any in-memory versions of the object that may be present.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
       <code>Id</code>.
       @param concurrency Concurrency level.  represented as
       <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>


       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_deleteId(com.intersys.objects.Database, com.intersys.objects.Id)
           @see #Customer
     */
    public static void delete (com.intersys.objects.Database db, com.intersys.objects.Id id, int concurrency) throws com.intersys.objects.CacheException {
        ((com.intersys.cache.SysDatabase)db).deleteObject(CACHE_CLASS_NAME, id, concurrency);
    }
    /**
       Runs method <code> %Delete </code> in Cache to delete an object
       from Cache database.

       Deletes the stored version of the object with OID <var>oid</var> from the database.
       It does not remove any in-memory versions of the object that may be present.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
       <code>Id</code>.

       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_deleteId(com.intersys.objects.Database, com.intersys.objects.Id)
           @see #Customer
     */
    public static void _deleteId (com.intersys.objects.Database db, com.intersys.objects.Id id) throws com.intersys.objects.CacheException {
        delete(db, id);
    }
    /**
       Runs method <code> %Delete </code> in Cache to delete an object
       from Cache database.

       Deletes the stored version of the object with OID <var>oid</var> from the database.
       It does not remove any in-memory versions of the object that may be present.

       @param db <code>Database</code> object used for connection with
       Cache database.

       @param id ID as specified in Cache represented as
       <code>Id</code>.
       @param concurrency Concurrency level.  represented as
       <code>Concurrency</code>.

      Here are concurrency values, see Object Concurrency Options in your on-line Cache' documentation for more information.
      @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/DocBook.UI.Page.cls?KEY=GOBJ_concurrency"> Object Concurrency Options.</A>

      <TABLE border="1"
      summary="Object Concurrency Options.">
      <CAPTION><EM>Object Concurrency Options</EM></CAPTION>
      <TR><TD>-1 </TD><TD>Default concurrency</TD></TR>
      <TR><TD>0 </TD><TD>No locking, no locks are used</TD></TR>
      <TR><TD>1 </TD><TD>Atomic</TD></TR>
      <TR><TD>2 </TD><TD>Shared</TD></TR>
      <TR><TD>3 </TD><TD>Shared/Retained</TD></TR>
      <TR><TD>4 </TD><TD>Exclusive</TD></TR>
      </TABLE>


       @throws com.intersys.objects.CacheException in case of error.
      @see java.lang.ClassCastException
           @see #_deleteId(com.intersys.objects.Database, com.intersys.objects.Id)
           @see #Customer
     */
    public static void _deleteId (com.intersys.objects.Database db, com.intersys.objects.Id id, int concurrency) throws com.intersys.objects.CacheException {
        delete(db, id, concurrency);
    }
    /**
       Returns class name of the class Sample.Customer as it is in
      Cache Database. Note, that this is a static method, so no
      object specific information can be returned. Use
      <code>getCacheClass().getName()</code> to get the class name
      for specific object.
       @return Cache class name as a <code>String</code>
      @see #getCacheClass()
      @see com.intersys.objects.reflect.CacheClass#getName()
     */
    public static String getCacheClassName( ) {
        return CACHE_CLASS_NAME;
    }

   /**
           Allows access metadata information about type of this object
           in Cache database. Also can be used for dynamic binding (accessing
           properties and calling methods without particular class known).

           @return <code>CacheClass</code> object for this object type.
   */
    public com.intersys.objects.reflect.CacheClass getCacheClass( ) throws com.intersys.objects.CacheException {
        return mInternal.getCacheClass();
    }

    public static void checkAllFieldsValid(com.intersys.objects.Database db ) throws com.intersys.objects.CacheException {
    }

    /**
       Verifies that all fields from Cache class are exposed with
       accessor methods in Java class and that values for indexes in
       zObjVal are the same as in Cache. It does not return anything
       but it throws an exception in case of inconsistency.

       <p>But if there is any inconsistency in zObjVal indexes this is fatal and class can not work correctly and must be regenerated

       @param db Database used for connection. Note that if you are
       using multiple databases the class can be consistent with one
       and inconsistent with another.
       @throws com.intersys.objects.InvalidClassException if any inconsistency is found.
       @throws com.intersys.objects.CacheException if any error occurred during
       verification, e.g. communication error with Database.
       @see com.intersys.objects.InvalidPropertyException

     */
    public static void checkAllMethods(com.intersys.objects.Database db ) throws com.intersys.objects.CacheException {
        checkAllMethods(db, CACHE_CLASS_NAME, Customer.class);
    }
    public static void checkAddressesValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>Addresses</code>.
       <Description>
       @return current value of <code>Addresses</code> represented as
       <code>java.util.Map</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#Addresses"> Addresses</A>
    */
    public java.util.Map getAddresses()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("Addresses",true);
        com.intersys.cache.CacheObject cobj = dh.getCacheObject();
        if (cobj == null)
            return null;
        return (java.util.Map)(cobj.newJavaInstance());
    }

    public static void checkMailingAddressesValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>MailingAddresses</code>.
       <Description>
       @return current value of <code>MailingAddresses</code> represented as
       <code>java.util.List</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MailingAddresses"> MailingAddresses</A>
    */
    public java.util.List getMailingAddresses()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("MailingAddresses",true);
        com.intersys.cache.CacheObject cobj = dh.getCacheObject();
        if (cobj == null)
            return null;
        return (java.util.List)(cobj.newJavaInstance());
    }

    public static void checkMyAddressValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>MyAddress</code>.
       <Description>
       @return current value of <code>MyAddress</code> represented as
       <code>Sample.Address</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MyAddress"> MyAddress</A>
    */
    public Sample.Address getMyAddress()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("MyAddress",true);
        com.intersys.cache.CacheObject cobj = dh.getCacheObject();
        if (cobj == null)
            return null;
        return (Sample.Address)(cobj.newJavaInstance());
    }

    /**
       Sets new value for <code>MyAddress</code>.
       <Description>
       @param value new value to be set represented as
       <code>Sample.Address</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MyAddress"> MyAddress</A>
    */
    public void setMyAddress(Sample.Address value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("MyAddress", dh);
        return;
    }

    public static void checkNameValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>Name</code>.
       <Description>
       @return current value of <code>Name</code> represented as
       <code>java.lang.String</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#Name"> Name</A>
    */
    public java.lang.String getName()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("Name",false);
       return dh.getString();
    }

    /**
       Sets new value for <code>Name</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.String</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#Name"> Name</A>
    */
    public void setName(java.lang.String value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("Name", dh);
        return;
    }

    public static void checkStatusValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>Status</code>.
       <Description>
       @return current value of <code>Status</code> represented as
       <code>java.lang.String</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#Status"> Status</A>
    */
    public java.lang.String getStatus()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("Status",false);
       return dh.getString();
    }

    /**
       Sets new value for <code>Status</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.lang.String</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#Status"> Status</A>
    */
    public void setStatus(java.lang.String value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("Status", dh);
        return;
    }

    public static void checkTSValid (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
    }
    /**
       Returns value of property <code>TS</code>.
       <Description>
       @return current value of <code>TS</code> represented as
       <code>java.sql.Timestamp</code>

       @throws com.intersys.objects.CacheException if any error occurred during value retrieval.
       @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#TS"> TS</A>
    */
    public java.sql.Timestamp getTS()  throws com.intersys.objects.CacheException {
       com.intersys.cache.Dataholder dh = mInternal.getProperty("TS",false);
       return dh.getTimestamp();
    }

    /**
       Sets new value for <code>TS</code>.
       <Description>
       @param value new value to be set represented as
       <code>java.sql.Timestamp</code>.
       @throws com.intersys.objects.CacheException if any error occurred during value setting.
       @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#TS"> TS</A>
    */
    public void setTS(java.sql.Timestamp value)  throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder dh = new com.intersys.cache.Dataholder (value);
        mInternal.setProperty("TS", dh);
        return;
    }

    /**
     <p>Runs method %ClassName in Cache.</p>
     <p>Description: Returns the object's class name. The <var>fullname</var> determines how the
class name is represented. If it is 1 then it returns the full class name
including any package qualifier. If it is 0 (the default) then it returns the
name of the class without the package, this is mainly for backward compatibility
with the pre-package behaviour of %ClassName.</p>
     @param db represented as com.intersys.objects.Database
     @param fullname represented as java.lang.Boolean
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#%ClassName"> Method %ClassName</A>
    */
    public static java.lang.String sys_ClassName (com.intersys.objects.Database db, java.lang.Boolean fullname) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(fullname);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%ClassName",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method %Delete in Cache.</p>
     <p>Description: Deletes streams referenced by this object and calls %Delete on any embedded objects

Refer to <LINK href=/AboutConcurrency.html>About Concurrency</LINK> for more details 
on the optional <var>concurrency</var> argument.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.
</p>
     @param db represented as com.intersys.objects.Database
     default argument oid set to ""
     default argument concurrency set to -1
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #sys_Delete(com.intersys.objects.Database,com.intersys.objects.Oid,java.lang.Integer)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#%Delete"> Method %Delete</A>
    */
    public static void sys_Delete (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%Delete",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method %Delete in Cache.</p>
     <p>Description: Deletes streams referenced by this object and calls %Delete on any embedded objects

Refer to <LINK href=/AboutConcurrency.html>About Concurrency</LINK> for more details 
on the optional <var>concurrency</var> argument.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.
</p>
     @param db represented as com.intersys.objects.Database
     @param oid represented as com.intersys.objects.Oid
     default argument concurrency set to -1
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #sys_Delete(com.intersys.objects.Database,com.intersys.objects.Oid,java.lang.Integer)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#%Delete"> Method %Delete</A>
    */
    public static void sys_Delete (com.intersys.objects.Database db, com.intersys.objects.Oid oid) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(oid);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%Delete",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method %Delete in Cache.</p>
     <p>Description: Deletes streams referenced by this object and calls %Delete on any embedded objects

Refer to <LINK href=/AboutConcurrency.html>About Concurrency</LINK> for more details 
on the optional <var>concurrency</var> argument.

<p>Returns a <CLASS>%Status</CLASS> value indicating success or failure.
</p>
     @param db represented as com.intersys.objects.Database
     @param oid represented as com.intersys.objects.Oid
     @param concurrency represented as java.lang.Integer
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#%Delete"> Method %Delete</A>
    */
    public static void sys_Delete (com.intersys.objects.Database db, com.intersys.objects.Oid oid, java.lang.Integer concurrency) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[2];
        args[0] = new com.intersys.cache.Dataholder(oid);
        args[1] = new com.intersys.cache.Dataholder(concurrency);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%Delete",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method %DeleteId in Cache.</p>
     <p>Description: Deletes the stored version of the object with ID <var>id</var> from the database. 

<p><METHOD>%DeleteId</METHOD> is identical in operation to the <METHOD>%Delete</METHOD> method except 
that it uses and Id value instead of an OID value to find an object.

Refer to <LINK href=/AboutConcurrency.html>About Concurrency</LINK> for more details 
on the optional <var>concurrency</var> argument.</p>
     @param db represented as com.intersys.objects.Database
     @param id represented as java.lang.String
     default argument concurrency set to -1
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #sys_DeleteId(com.intersys.objects.Database,java.lang.String,java.lang.Integer)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#%DeleteId"> Method %DeleteId</A>
    */
    public static void sys_DeleteId (com.intersys.objects.Database db, java.lang.String id) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(id);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%DeleteId",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method %DeleteId in Cache.</p>
     <p>Description: Deletes the stored version of the object with ID <var>id</var> from the database. 

<p><METHOD>%DeleteId</METHOD> is identical in operation to the <METHOD>%Delete</METHOD> method except 
that it uses and Id value instead of an OID value to find an object.

Refer to <LINK href=/AboutConcurrency.html>About Concurrency</LINK> for more details 
on the optional <var>concurrency</var> argument.</p>
     @param db represented as com.intersys.objects.Database
     @param id represented as java.lang.String
     @param concurrency represented as java.lang.Integer
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#%DeleteId"> Method %DeleteId</A>
    */
    public static void sys_DeleteId (com.intersys.objects.Database db, java.lang.String id, java.lang.Integer concurrency) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[2];
        args[0] = new com.intersys.cache.Dataholder(id);
        args[1] = new com.intersys.cache.Dataholder(concurrency);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%DeleteId",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method %IsA in Cache.</p>
     <p>Description: Returns true (1) if instances of this class are also instances of the isclass parameter.
That is 'isclass' is a primary superclass of this object.</p>
     @param db represented as com.intersys.objects.Database
     @param isclass represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#%IsA"> Method %IsA</A>
    */
    public static java.lang.Integer sys_IsA (com.intersys.objects.Database db, java.lang.String isclass) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(isclass);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%IsA",args,com.intersys.objects.Database.RET_PRIM);
        return res.getInteger();
    }
    /**
     <p>Runs method %ObjectIsNull in Cache.</p>
     <p>Description: Return true if pOID is a null object and false if the object is not null</p>
     @param db represented as com.intersys.objects.Database
     @param pOID represented as com.intersys.objects.Oid
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#%ObjectIsNull"> Method %ObjectIsNull</A>
    */
    public static java.lang.Boolean sys_ObjectIsNull (com.intersys.objects.Database db, com.intersys.objects.Oid pOID) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(pOID);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"%ObjectIsNull",args,com.intersys.objects.Database.RET_PRIM);
        return res.getBoolean();
    }
    /**
     <p>Runs method AddressesGetObject in Cache.</p>
     default argument force set to 0
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #AddressesGetObject(java.lang.Integer)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#AddressesGetObject"> Method AddressesGetObject</A>
    */
    public com.intersys.objects.Oid AddressesGetObject () throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("AddressesGetObject",args,com.intersys.objects.Database.RET_PRIM);
        return res.getOid();
    }
    /**
     <p>Runs method AddressesGetObject in Cache.</p>
     @param force represented as java.lang.Integer
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#AddressesGetObject"> Method AddressesGetObject</A>
    */
    public com.intersys.objects.Oid AddressesGetObject (java.lang.Integer force) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(force);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("AddressesGetObject",args,com.intersys.objects.Database.RET_PRIM);
        return res.getOid();
    }
    /**
     <p>Runs method AddressesGetObjectId in Cache.</p>
     default argument force set to 0
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #AddressesGetObjectId(java.lang.Integer)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#AddressesGetObjectId"> Method AddressesGetObjectId</A>
    */
    public java.lang.String AddressesGetObjectId () throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("AddressesGetObjectId",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method AddressesGetObjectId in Cache.</p>
     @param force represented as java.lang.Integer
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#AddressesGetObjectId"> Method AddressesGetObjectId</A>
    */
    public java.lang.String AddressesGetObjectId (java.lang.Integer force) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(force);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("AddressesGetObjectId",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method AddressesIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param value represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#AddressesIsValid"> Method AddressesIsValid</A>
    */
    public static void AddressesIsValid (com.intersys.objects.Database db, java.lang.String value) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(value);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"AddressesIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method AddressesSetObject in Cache.</p>
     @param newvalue represented as com.intersys.objects.Oid
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#AddressesSetObject"> Method AddressesSetObject</A>
    */
    public void AddressesSetObject (com.intersys.objects.Oid newvalue) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(newvalue);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("AddressesSetObject",args,com.intersys.objects.Database.RET_PRIM);
        getDatabase().parseStatus(res);
        return;
    }
    /**
     <p>Runs method AddressesSetObjectId in Cache.</p>
     @param newid represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#AddressesSetObjectId"> Method AddressesSetObjectId</A>
    */
    public void AddressesSetObjectId (java.lang.String newid) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(newid);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("AddressesSetObjectId",args,com.intersys.objects.Database.RET_PRIM);
        getDatabase().parseStatus(res);
        return;
    }
    /**
     <p>Runs method LogicalToOdbc in Cache.</p>
     <p>Description: 	LogicalToOdbc()
		Construct a string delimited by ODBCDELIMITER from an object's serialized state.</p>
     @param db represented as com.intersys.objects.Database
     default argument val set to ""
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #LogicalToOdbc(com.intersys.objects.Database,java.lang.String)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#LogicalToOdbc"> Method LogicalToOdbc</A>
    */
    public static java.lang.String LogicalToOdbc (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"LogicalToOdbc",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method LogicalToOdbc in Cache.</p>
     <p>Description: 	LogicalToOdbc()
		Construct a string delimited by ODBCDELIMITER from an object's serialized state.</p>
     @param db represented as com.intersys.objects.Database
     @param val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#LogicalToOdbc"> Method LogicalToOdbc</A>
    */
    public static java.lang.String LogicalToOdbc (com.intersys.objects.Database db, java.lang.String val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"LogicalToOdbc",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method MailingAddressesGetObject in Cache.</p>
     default argument force set to 0
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #MailingAddressesGetObject(java.lang.Integer)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MailingAddressesGetObject"> Method MailingAddressesGetObject</A>
    */
    public com.intersys.objects.Oid MailingAddressesGetObject () throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MailingAddressesGetObject",args,com.intersys.objects.Database.RET_PRIM);
        return res.getOid();
    }
    /**
     <p>Runs method MailingAddressesGetObject in Cache.</p>
     @param force represented as java.lang.Integer
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MailingAddressesGetObject"> Method MailingAddressesGetObject</A>
    */
    public com.intersys.objects.Oid MailingAddressesGetObject (java.lang.Integer force) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(force);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MailingAddressesGetObject",args,com.intersys.objects.Database.RET_PRIM);
        return res.getOid();
    }
    /**
     <p>Runs method MailingAddressesGetObjectId in Cache.</p>
     default argument force set to 0
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #MailingAddressesGetObjectId(java.lang.Integer)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MailingAddressesGetObjectId"> Method MailingAddressesGetObjectId</A>
    */
    public java.lang.String MailingAddressesGetObjectId () throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MailingAddressesGetObjectId",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method MailingAddressesGetObjectId in Cache.</p>
     @param force represented as java.lang.Integer
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MailingAddressesGetObjectId"> Method MailingAddressesGetObjectId</A>
    */
    public java.lang.String MailingAddressesGetObjectId (java.lang.Integer force) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(force);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MailingAddressesGetObjectId",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method MailingAddressesIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param value represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MailingAddressesIsValid"> Method MailingAddressesIsValid</A>
    */
    public static void MailingAddressesIsValid (com.intersys.objects.Database db, java.lang.String value) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(value);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"MailingAddressesIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method MailingAddressesSetObject in Cache.</p>
     @param newvalue represented as com.intersys.objects.Oid
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MailingAddressesSetObject"> Method MailingAddressesSetObject</A>
    */
    public void MailingAddressesSetObject (com.intersys.objects.Oid newvalue) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(newvalue);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MailingAddressesSetObject",args,com.intersys.objects.Database.RET_PRIM);
        getDatabase().parseStatus(res);
        return;
    }
    /**
     <p>Runs method MailingAddressesSetObjectId in Cache.</p>
     @param newid represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MailingAddressesSetObjectId"> Method MailingAddressesSetObjectId</A>
    */
    public void MailingAddressesSetObjectId (java.lang.String newid) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(newid);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MailingAddressesSetObjectId",args,com.intersys.objects.Database.RET_PRIM);
        getDatabase().parseStatus(res);
        return;
    }
    /**
     <p>Runs method MyAddressGetObject in Cache.</p>
     default argument force set to 0
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #MyAddressGetObject(java.lang.Integer)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MyAddressGetObject"> Method MyAddressGetObject</A>
    */
    public com.intersys.objects.Oid MyAddressGetObject () throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MyAddressGetObject",args,com.intersys.objects.Database.RET_PRIM);
        return res.getOid();
    }
    /**
     <p>Runs method MyAddressGetObject in Cache.</p>
     @param force represented as java.lang.Integer
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MyAddressGetObject"> Method MyAddressGetObject</A>
    */
    public com.intersys.objects.Oid MyAddressGetObject (java.lang.Integer force) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(force);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MyAddressGetObject",args,com.intersys.objects.Database.RET_PRIM);
        return res.getOid();
    }
    /**
     <p>Runs method MyAddressGetObjectId in Cache.</p>
     default argument force set to 0
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #MyAddressGetObjectId(java.lang.Integer)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MyAddressGetObjectId"> Method MyAddressGetObjectId</A>
    */
    public java.lang.String MyAddressGetObjectId () throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MyAddressGetObjectId",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method MyAddressGetObjectId in Cache.</p>
     @param force represented as java.lang.Integer
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MyAddressGetObjectId"> Method MyAddressGetObjectId</A>
    */
    public java.lang.String MyAddressGetObjectId (java.lang.Integer force) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(force);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MyAddressGetObjectId",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method MyAddressIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param value represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MyAddressIsValid"> Method MyAddressIsValid</A>
    */
    public static void MyAddressIsValid (com.intersys.objects.Database db, java.lang.String value) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(value);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"MyAddressIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method MyAddressSetObject in Cache.</p>
     @param newvalue represented as com.intersys.objects.Oid
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MyAddressSetObject"> Method MyAddressSetObject</A>
    */
    public void MyAddressSetObject (com.intersys.objects.Oid newvalue) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(newvalue);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MyAddressSetObject",args,com.intersys.objects.Database.RET_PRIM);
        getDatabase().parseStatus(res);
        return;
    }
    /**
     <p>Runs method MyAddressSetObjectId in Cache.</p>
     @param newid represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#MyAddressSetObjectId"> Method MyAddressSetObjectId</A>
    */
    public void MyAddressSetObjectId (java.lang.String newid) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(newid);
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("MyAddressSetObjectId",args,com.intersys.objects.Database.RET_PRIM);
        getDatabase().parseStatus(res);
        return;
    }
    /**
     <p>Runs method NameDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#NameDisplayToLogical"> Method NameDisplayToLogical</A>
    */
    public static java.lang.String NameDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"NameDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method NameIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#NameIsValid"> Method NameIsValid</A>
    */
    public static void NameIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"NameIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method NameLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#NameLogicalToDisplay"> Method NameLogicalToDisplay</A>
    */
    public static java.lang.String NameLogicalToDisplay (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"NameLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method OdbcToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     default argument val set to ""
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see #OdbcToLogical(com.intersys.objects.Database,java.lang.String)
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#OdbcToLogical"> Method OdbcToLogical</A>
    */
    public static java.lang.String OdbcToLogical (com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"OdbcToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method OdbcToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#OdbcToLogical"> Method OdbcToLogical</A>
    */
    public static java.lang.String OdbcToLogical (com.intersys.objects.Database db, java.lang.String val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"OdbcToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method SetDefault in Cache.</p>
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#SetDefault"> Method SetDefault</A>
    */
    public void SetDefault () throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[0];
        com.intersys.cache.Dataholder res=mInternal.runInstanceMethod("SetDefault",args,com.intersys.objects.Database.RET_NONE);
        return;
    }
    /**
     <p>Runs method StatusDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#StatusDisplayToLogical"> Method StatusDisplayToLogical</A>
    */
    public static java.lang.String StatusDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"StatusDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method StatusIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#StatusIsValid"> Method StatusIsValid</A>
    */
    public static void StatusIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"StatusIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method StatusLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#StatusLogicalToDisplay"> Method StatusLogicalToDisplay</A>
    */
    public static java.lang.String StatusLogicalToDisplay (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"StatusLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method TSDisplayToLogical in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#TSDisplayToLogical"> Method TSDisplayToLogical</A>
    */
    public static java.sql.Timestamp TSDisplayToLogical (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"TSDisplayToLogical",args,com.intersys.objects.Database.RET_PRIM);
        return res.getTimestamp();
    }
    /**
     <p>Runs method TSIsValid in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.lang.String
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#TSIsValid"> Method TSIsValid</A>
    */
    public static void TSIsValid (com.intersys.objects.Database db, java.lang.String _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"TSIsValid",args,com.intersys.objects.Database.RET_PRIM);
        db.parseStatus(res);
        return;
    }
    /**
     <p>Runs method TSLogicalToDisplay in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param _val represented as java.sql.Timestamp
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#TSLogicalToDisplay"> Method TSLogicalToDisplay</A>
    */
    public static java.lang.String TSLogicalToDisplay (com.intersys.objects.Database db, java.sql.Timestamp _val) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(_val);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"TSLogicalToDisplay",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method ToString in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param customer represented as com.intersys.classes.SerialObject
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#ToString"> Method ToString</A>
    */
    public static java.lang.String ToString (com.intersys.objects.Database db, com.intersys.classes.SerialObject customer) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(customer);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ToString",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method ToStringWrapper in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param Arg1 represented as byte[]
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#ToStringWrapper"> Method ToStringWrapper</A>
    */
    public static java.lang.String ToStringWrapper (com.intersys.objects.Database db, byte[] Arg1) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[1];
        args[0] = new com.intersys.cache.Dataholder(Arg1);
        com.intersys.cache.Dataholder res=db.runClassMethod(CACHE_CLASS_NAME,"ToStringWrapper",args,com.intersys.objects.Database.RET_PRIM);
        return res.getString();
    }
    /**
     <p>Runs method writeAddr in Cache.</p>
     @param db represented as com.intersys.objects.Database
     @param str represented as com.intersys.objects.StringHolder
     @param addr represented as Sample.Address
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#writeAddr"> Method writeAddr</A>
    */
    public static void writeAddr (com.intersys.objects.Database db, com.intersys.objects.StringHolder str, Sample.Address addr) throws com.intersys.objects.CacheException {
        com.intersys.cache.Dataholder[] args = new com.intersys.cache.Dataholder[2];
        int[] _refs = new int[1];
        args[0] = com.intersys.cache.Dataholder.create (str.value);
        _refs[0] = 1;
        args[1] = new com.intersys.cache.Dataholder(addr);
        com.intersys.cache.Dataholder[] res=db.runClassMethod(CACHE_CLASS_NAME,"writeAddr",_refs,args,com.intersys.objects.Database.RET_NONE);
        str.set(res[1].getString());
        return;
    }
    /**
     <p>Returns a CallableStatement for stored procedure Customer_ToString.</p>
     @param db represented as com.intersys.objects.Database
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#ToString"> Method ToString</A>
    */
    public static java.sql.CallableStatement prepare_Customer_ToString(com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
        java.sql.CallableStatement statement = null;
        try {
            statement = db.prepareCall("{? =  call Sample.Customer_ToString(?) }");
            statement.registerOutParameter(1, java.sql.Types.VARCHAR);
        }
        catch (java.sql.SQLException x) {
            throw new com.intersys.objects.CacheException(x, "Failed to prepare stored procedure Customer_ToString");
        }
        return statement;
    }
    
    /**
     <p>Returns a CallableStatement for stored procedure Customer_ToStringWrapper.</p>
     @param db represented as com.intersys.objects.Database
     @throws com.intersys.objects.CacheException if any error occured while running the method.
     @see <a href = "http://VAIO-VGN-FW560F:57772/csp/documatic/%25CSP.Documatic.cls?APP=1&PAGE=CLASS&LIBRARY=SAMPLES&CLASSNAME=Sample.Customer#ToStringWrapper"> Method ToStringWrapper</A>
    */
    public static java.sql.CallableStatement prepare_Customer_ToStringWrapper(com.intersys.objects.Database db) throws com.intersys.objects.CacheException {
        java.sql.CallableStatement statement = null;
        try {
            statement = db.prepareCall("{? =  call Sample.Customer_ToStringWrapper(?) }");
            statement.registerOutParameter(1, java.sql.Types.VARCHAR);
        }
        catch (java.sql.SQLException x) {
            throw new com.intersys.objects.CacheException(x, "Failed to prepare stored procedure Customer_ToStringWrapper");
        }
        return statement;
    }
    
}
