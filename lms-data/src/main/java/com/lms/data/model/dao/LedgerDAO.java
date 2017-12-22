package com.lms.data.model.dao;

import java.util.List;

import com.lms.data.model.Ledger;
import com.lms.data.model.database.StaticDataFactory;

public interface LedgerDAO {
	
	StaticDataFactory dbInstance = StaticDataFactory.getInstance();
	
	void addLedger(Ledger ledger);
	void removeLedger(String ledgerId);
	void updateLedger(Ledger ledger);
	List<Ledger> getLedgerByUser(String userId);
	List<Ledger> getLedgerByBook(String bookId);
}
