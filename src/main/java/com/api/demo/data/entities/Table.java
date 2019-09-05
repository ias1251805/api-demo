package com.api.demo.data.entities;

import java.util.List;

public class Table {
	private List<ColumnName> columns;
	private List<List> rows;
	private String type;

	public List<ColumnName> getColumns() {
		return columns;
	}

	public void setColumns(List<ColumnName> columns) {
		this.columns = columns;
	}

	public List<List> getRows() {
		return rows;
	}

	public void setRows(List<List> rows) {
		this.rows = rows;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
