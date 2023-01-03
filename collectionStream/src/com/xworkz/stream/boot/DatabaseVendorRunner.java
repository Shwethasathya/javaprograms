package com.xworkz.stream.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.stream.constant.Type;
import com.xworkz.stream.dto.DatabaseVendorDto;

public class DatabaseVendorRunner {

	public static void main(String[] args) {

		Collection<DatabaseVendorDto> collection = new ArrayList();

		collection.add(new DatabaseVendorDto("Microsoft", "Microsoft", Type.HIERARCHICAL, 2.6, 260));
		collection.add(new DatabaseVendorDto("Oracle", "Oracle", Type.SQL, 4.5, 400));
		collection.add(new DatabaseVendorDto("Freeware", "Microsoft", Type.RELATIONAL, 3.4, 0));
		collection.add(new DatabaseVendorDto("cloudscape", "Informix", Type.SQL, 2.6, 500));
		collection.add(new DatabaseVendorDto("IMS DB", "IBM", Type.RELATIONAL, 4.1, 260));

		collection.stream()
				  .filter(ele -> ele.getLicenseCost() < 100 && ele.getType().equals("SQL"))
				  .collect(Collectors.toList())
				  .forEach(ele -> System.out.println(ele));

	}
}