package org.bluebride.design_pattern._03_structure.composite.ibatis;

public class IfSqlNode extends SqlNode {
	
	public IfSqlNode(String sqlStatement) {
		this.sqlStatement = sqlStatement;
	}
	
	@Override
	public void concatSqlStatement(DynamicContext context) {
		context.appendSql(sqlStatement.trim());
	}

}