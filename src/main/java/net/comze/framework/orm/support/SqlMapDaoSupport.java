/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.comze.framework.orm.support;

import javax.sql.DataSource;

/**
 * @author <a href="mailto:gkzhong@gmail.com">GK.ZHONG</a>
 * @since 3.0.0
 * @version SqlMapDaoSupport.java 3.1.0 Mar 22, 2012 5:06:02 PM
 */
public class SqlMapDaoSupport extends DaoSupport {

	private SqlMapTemplate sqlMapTemplate = new SqlMapTemplate();

	public void setSqlMapTemplate(SqlMapTemplate sqlMapTemplate) {
		this.sqlMapTemplate = sqlMapTemplate;
	}

	public SqlMapTemplate getSqlMapTemplate() {
		return this.sqlMapTemplate;
	}

	@Override
	public void setDataSource(DataSource dataSource) {
		this.sqlMapTemplate.setDataSource(dataSource);
	}

	@Override
	public DataSource getDataSource() {
		return this.sqlMapTemplate.getDataSource();
	}

}
