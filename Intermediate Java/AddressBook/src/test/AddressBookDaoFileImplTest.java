package test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.sg.addressbook.dao.AddressBookDao;
import com.sg.addressbook.dao.AddressBookDaoFileImpl;
import com.sg.addressbook.dto.AddressBook;

class AddressBookDaoFileImplTest {

	private AddressBookDao dao;

	public AddressBookDaoFileImplTest () {
		dao = new AddressBookDaoFileImpl();
	}

	@Before
	public void setUp() throws Exception {
		List<AddressBook> addressesList = dao.listAllAddresses();
		for(AddressBook address : addressesList) {
			dao.removeAddress(address.getLastName());
		}
	}

	public AddressBook addAddress1() {
		AddressBook adr1 = new AddressBook("Lucas");
		adr1.setFirstName("George");
		adr1.setStreetAddress("888 Carsonia Ave");
		adr1.setCity("Reading");
		adr1.setState("PA");
		adr1.setZipCode(19650);
		return adr1;
	}

	public AddressBook addAddress2() {
		AddressBook adr2 = new AddressBook("Pena");
		adr2.setFirstName("Jimbo");
		adr2.setStreetAddress("5454 Savannah");
		adr2.setCity("JAX");
		adr2.setState("FL");
		adr2.setZipCode(32000);
		return adr2;
	}

	@Test
	public void testAddFindAddress() throws Exception {
		AddressBook adr1 = addAddress1();
		dao.addAddressBook(adr1.getLastName(), adr1);

		AddressBook fromDao = dao.findAddressByLastName(adr1.getLastName(), true);
		assertEquals(adr1, fromDao);
	}

	@Test
	public void testGetCountAndListAllAddresses() throws Exception {
		AddressBook adr1 = addAddress1();
		dao.addAddressBook(adr1.getLastName(), adr1);
		AddressBook adr2 = addAddress2();
		dao.addAddressBook(adr2.getLastName(), adr2);

		assertEquals(2, dao.listAllAddresses().size());
		assertEquals(2, dao.addressCount());
	}

	@Test
	public void testRemoveAddress() throws Exception {
		AddressBook adr1 = addAddress1();
		dao.addAddressBook(adr1.getLastName(), adr1);
		AddressBook adr2 = addAddress2();
		dao.addAddressBook(adr2.getLastName(), adr2);

		dao.removeAddress(adr2.getLastName());
		assertEquals(1,  dao.listAllAddresses().size());
		assertNull(dao.findAddressByLastName(adr2.getLastName(), true));

		dao.removeAddress(adr1.getLastName());
		assertEquals(0,  dao.listAllAddresses().size());
		assertNull(dao.findAddressByLastName(adr1.getLastName(), true));
	}

}
