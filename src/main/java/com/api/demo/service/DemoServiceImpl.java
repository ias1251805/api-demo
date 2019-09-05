package com.api.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.demo.data.entities.ColumnName;
import com.api.demo.data.entities.Table;

@Service
public class DemoServiceImpl implements DemoService {
	@Override
	public Table execute() {
		Table table = new Table();
		ColumnName mnemonic = new ColumnName();
		mnemonic.setText("Mnemonic");
		mnemonic.setType("String");

		List<ColumnName> columnNameList = new ArrayList<>();
		columnNameList.add(mnemonic);

		table.setColumns(columnNameList);

		List row1 = new ArrayList<>();
		row1.add("BNC");
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);

		
		
		List row2 = new ArrayList<>();
		row2.add("HUB");
		row2.add(1);
		row2.add(2);
		row2.add(3);
		row2.add(4);
		

		List rownumber = new ArrayList();
		rownumber.add(row1);
		rownumber.add(row2);

		table.setRows(rownumber);
		table.setType("table");

		return table;
	}
}
