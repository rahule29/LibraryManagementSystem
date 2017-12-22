package com.lms.data.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.lms.data.model.Ledger;

public class LedgerDaoImpl implements LedgerDAO{

	@Override
	public void addLedger(Ledger ledger) {
		dbInstance.getLedgers().put(ledger.getId(), ledger);
	}

	@Override
	public void removeLedger(String ledgerId) {
		dbInstance.getLedgers().remove(ledgerId);
	}

	@Override
	public void updateLedger(Ledger ledger) {
		dbInstance.getLedgers().put(ledger.getId(), ledger);		
	}

	@Override
	public List<Ledger> getLedgerByUser(String userId) {
		List<Ledger> ledgers = new ArrayList<>();
		for(Ledger ledger : dbInstance.getLedgers().values()){
			if(userId.trim().equals(ledger.getLendedFor())){
				ledgers.add(ledger);
			}
		}
		return ledgers;
	}

	@Override
	public List<Ledger> getLedgerByBook(String bookId) {
		List<Ledger> ledgers = new ArrayList<>();
		for(Ledger ledger : dbInstance.getLedgers().values()){
			if(bookId.trim().equals(ledger.getLendedBook())){
				ledgers.add(ledger);
			}
		}
		return ledgers;
	}
}
