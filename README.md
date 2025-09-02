# ![Status](https://img.shields.io/badge/print-logger-brightgreen) #

### ![Status](https://img.shields.io/badge/Create%20Local%20Repository-00809D) ###
> go to your .m2 folder
> and unzip ![Status](https://img.shields.io/badge/jdc.zip-FB4141) to your .m2>repository> com >
> 
###  ![Status](https://img.shields.io/badge/Add%20Dependency-00809D) ###

```
 <dependency>
   	<groupId>com.jdc.mkt</groupId>
   	<artifactId>PrintLogger</artifactId>
   	<version>1.0</version>
   </dependency>
```

###  ![Status](https://img.shields.io/badge/Usage_of_PrintLogger_Example-00809D) ###
```
package com.jdc.mkt;

import java.util.List;

import com.jdc.mkt.utils.anno.Connector;

@Connector(database = DatabaseType.MYSQL,name = "testDb", user = "root", password = "1234")
public class Main {
	
	

	public static void main(String[] args) {
        //To get the logger instance, we need to use the Logger class.
		Logger logger = Logger.getInstance(Main.class);
		
		// Print table by query
		logger.printResultSetAsTable("SELECT * FROM addresses_tbl");
		
		// Print table by query with update like create, drop, etc.
		logger.updateQueryAsTable("""
				create table if not exists tst_tbl(
					id int primary key auto_increment,
					name varchar(24) not null
				)
				""");
		
		logger.updateQueryAsTable("drop table tst_tbl");
		
		// Print table by entity list 
		logger.printEntityTable(List.of(
				new Person("aa",22),
				new Person("bb",33)
				), Person.class);
		logger.printResultSetAsTable("SELECT * FROM addresses_tbl");
		
	}
}

//person class for testing
class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
```

