package com.sample.utility;


import com.intersys.objects.CacheDatabase;
import com.intersys.objects.CacheException;
import com.intersys.objects.Database;

public class DBUtility {

	private static Database dbconnection = null;
	public static Database createConnection(){

		if (dbconnection != null)
            return dbconnection;
        else {
        	try {
            String url="jdbc:Cache://localhost:1972/Samples";
			String username="_SYSTE";              //_SYSTEM";
			String password="_SYST"; 
			dbconnection = CacheDatabase.getDatabase (url, username, password);
        	}
        	
        	catch (CacheException e) {
                 e.printStackTrace();
        	    
        	 }        
	      return dbconnection;
	   }
	}
}
