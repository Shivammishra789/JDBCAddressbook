package com.jdbc;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class AddressBookCountTest {
	
	@Test
    public void AddressBookDataRetrievedDFromDB_MatchCount() throws Exception {
		
		
		AddressBookDBService addressbookservice = new AddressBookDBService();
		
		List<PersonInformation> list = addressbookservice.getDataFromDB();
		
		int actual_size = 6;
        Assert.assertEquals(actual_size , list.size());
    }
}